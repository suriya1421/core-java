import java.io.File;

public class SubFolderCreation {
	public static void main (String args[]) {
		File file=new File("D:\\File IO programs\\abii\\aadish\\siva mithran");
		boolean present=file.exists();
		System.out.println("folder present"+" "+present);
		if(present==false)
			file.mkdirs();
		}

}
