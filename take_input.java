import java.util.Scanner;

public class take_input
{

    public static void main(String[] args)
    {
        Scanner obj= new Scanner(System.in);
        
        System.out.println("namw ?\n");
        String name = obj.nextLine();
         System.out.println("age ?\n");
        int age = obj.nextInt();
         System.out.println("salary?\n");
        double salary = obj.nextDouble();
        
        System.out.println("namw :"+name);
        System.out.println("age :"+age);
        System.out.println("salary :"+salary);
        
    }
}
