import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Demo
{
    public static void main(String[] args)
    {
        try
        {
            Studentinfo si = new Studentinfo("Abi", 104, "110044");
            FileOutputStream fos = new FileOutputStream("D:\\suriya\\Papulu.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}