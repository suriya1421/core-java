import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String args[]) {
		File file=new File("D:\\File IO programs\\abii\\suriya.txt");
		boolean present=file.exists();
		System.out.println("file status"+" "+present);
		if(present==false)
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
