import java.io.File;

public class FileFolderDemo {
public static void main (String args[]) {
	File file=new File("D:\\File IO programs\\abii");
	boolean present=file.exists();
	System.out.println("folder present"+" "+present);
	if(present==false)
		file.mkdir();
	}
}
