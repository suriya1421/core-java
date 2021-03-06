package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.Appointmentsdao;
import com.chainsys.miniproject.pojo.Appointments;

/**
 * Servlet implementation class Appointments
 */
public class Appointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Appointment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Appointments> applist = Appointmentsdao.getAllAppointment();
		Iterator<Appointments> appItr = applist.iterator();
		while (appItr.hasNext()) {
			Appointments app = appItr.next();
			out.println(app.getAPPOINTMENT_ID() + " " + app.getDOCTOR_ID());
			out.println("</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source="AddNewEmployee";
		 String message="<h1>Error while "+source+"</h1>";
		PrintWriter out = response.getWriter();	
		Appointments app = new Appointments();
		if (request.getParameter("click").equals("ADD_APP")) {
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int app_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(app_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setAPPOINTMENT_ID(app_id);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			app.setAPPOINTMENT_DATE(newDate);

			String docid = request.getParameter("docid");
			try {
				Validator.checkStringForParseInt(docid);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int doc_id = Integer.parseInt(docid);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setDOCTOR_ID(doc_id);

			String pat_name =request.getParameter("pat_name");
			try {
				Validator.checkStringOnly(pat_name);
			} catch (InvalidInputDataException e) {
				System.out.println("Error :" + e.getMessage());
			}
			app.setPATIENT_NAME(pat_name);
			String Fee = request.getParameter("fee");
			try {
				Validator.checkStringForParseInt(Fee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			float Fees = Float.parseFloat(Fee);
			try {
				Validator.CheckNumberForGreaterThanZero(Fees);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setFEES_COLLECTED(Fees);
			int result = Appointmentsdao.insertAppointment(app);
			out.println(result + "row inserted");
		}
	else if (request.getParameter("click").equals("UPDATE_APP")) {
		doPut(request,response);
	}
	else if (request.getParameter("click").equals("DELETE_APP")) {
		doDelete(request,response);}
		}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		Appointments app = new Appointments();

			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int app_id = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(app_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setAPPOINTMENT_ID(app_id);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			app.setAPPOINTMENT_DATE(newDate);

			String docid = request.getParameter("docid");
			try {
				Validator.checkStringForParseInt(docid);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			int doc_id = Integer.parseInt(docid);
			try {
				Validator.CheckNumberForGreaterThanZero(doc_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setDOCTOR_ID(doc_id);

			String pat_name =request.getParameter("pat_name");
			try {
				Validator.checkStringOnly(pat_name);
			} catch (InvalidInputDataException e) {
				System.out.println("Error :" + e.getMessage());
			}
			app.setPATIENT_NAME(pat_name);
			String Fee = request.getParameter("fee");
			try {
				Validator.checkStringForParseInt(Fee);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			float Fees = Float.parseFloat(Fee);
			try {
				Validator.CheckNumberForGreaterThanZero(Fees);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			app.setFEES_COLLECTED(Fees);
			int result = Appointmentsdao.updateAppointment(app);
			out.println(result + "row inserted");
		}
		
		

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Appointments app = new Appointments();
		String id = request.getParameter("id");
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		int app_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setAPPOINTMENT_ID(app_id);
		int result = Appointmentsdao.deleteAppointment(app_id);
		out.println(result + "row deleted");
	}	

}