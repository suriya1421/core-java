import java.io.File;
import java.io.IOException;

public class RenameFile {
public static void main(String args[]) {
	File file = new File("D:\\File IO programs\\abii");
	
		try {
			file.createNewFile();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		File newfile = new File("D:\\File IO programs\\divya");
        boolean renamesuccess=file.renameTo(newfile);
        System.out.println("rename success "+renamesuccess);
        System.out.println(file.getName());
        System.out.println(newfile.getName());
        }
	
}

