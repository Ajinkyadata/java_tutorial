import java.io.File ;
import java.io.IOException;

public class nFile
{
    public static void main(String[] args)
    {
        try
        {
        File obj= new File("testFile.txt");

        if(obj.createNewFile())
        System.out.println(obj.getName());
        else
        System.out.println("File is there");
        }
        catch(IOException e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
    }

}