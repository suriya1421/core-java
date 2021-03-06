import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileInputOutputStreams {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		//modify();
		//read();
		//delete();
		//copy();
		moveFileMethod();
	}
	 
	
	private static void createFile()
	{
		File file = new File(("d:\\suriya\\new demo.txt"));

	    try {
	    	
	      boolean value = file.createNewFile();
	      if (value)
	      {
	        System.out.println("New Java File is created.");
	      }
	      else
	      {
	        System.out.println("The file already exists.");
	      }
	    }
	    catch(Exception e)
	    {
	      e.getStackTrace();
	    }
	}
	 
	private static void rename()
	{
		 File file = new File("d:\\suriya\\new demo.txt");
       
	        File renameFile = new File("d:\\suriya\\\\new docx.txt");
	         
	        if(file.renameTo(renameFile))
	        {
	            System.out.println("File was successfully renamed");
	        } 
	        else
	        {
	            System.out.println("Error: Unable to rename file");
	        }    
	}
	
	private static void appendMethod() 
	{
		String textToAppend = "Happy Learning !!";
		String fileName = "d:\\suriya\\new docx.txt";

		try
		(FileWriter fileWriter = new FileWriter(fileName, true);
		PrintWriter printWriter = new PrintWriter(fileWriter);)
		{
		  printWriter.println(textToAppend);
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
	}
	 
	private static void modifyMethod() throws IOException
	{
		 FileOutputStream file = new FileOutputStream("d:\\suriya\\new docx.txt");
        
         String modify = "java training.";
         byte[] b = modify.getBytes();
         file.write(b);
         file.close();
         System.out.println("Modification Complete");
         
         FileInputStream file1 = new FileInputStream("d:\\suriya\\new docx.txt");
         int i;
         while((i=file1.read())!=-1)
         {
         System.out.print((char)i);
         }
         file1.close(); 
	}
	private static void read() throws IOException 
	{
		  FileReader file=new FileReader("D:\\suriya\\new file.txt");    
          int i;    
          while((i=file.read())!=-1)    
          System.out.print((char)i);    
          file.close();  
	}
	
	private static void deleteMethod() throws IOException
	{
		  File file = new File("D:\\File IO programs\\abii.txt");
		    boolean value = file.delete();
		    if(value) 
		    {
		      System.out.println("file is successfully deleted.");
		    }
		    else {
		      System.out.println("File doesn't exit");
		    }
		  }
	
	private static void copyMethod() throws IOException {
	    
		try 
        {
            InputStream input=new FileInputStream("D:\\dem\\abc.txt");
            OutputStream output=new FileOutputStream("D:\\dem\\xyz.txt");
            int content=input.read();
            while(content != -1)
            {
                output.write(content);
                content=input.read();
            }
            output.flush();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
	
		public static void moveFileMethod()
		{

	        Path sourceFilePath = Paths.get("D:\\dem\\abc.txt");
	        Path targetFilePath = Paths.get("D:\\dem\\def.txt");

	        try {
	            Files.move(sourceFilePath, targetFilePath);
	        } catch (FileAlreadyExistsException ex) 
	        {
	            System.out.println("Target file already exists");
	        } 
	        catch (IOException err) {
	        	
	            System.out.format("I/O error:", err);
	        }
	    }
		}


