package com.chainsys.jdbc;

import java.sql.*;
import java.sql.SQLException;

public class Basic_jdbc {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement stat=con.createStatement();
		ResultSet rs=stat.executeQuery("select * from employees");
		while (rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+ rs.getString(4));
		}
			}
	}
