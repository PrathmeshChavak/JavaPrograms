import java.util.Scanner;
public class Basics
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        String gender;
        int age;
        System.out.println("Enter your gender ?");
        gender=s1.next();
        if(gender.equalsIgnoreCase("Female"))
        {
            System.out.println("Free Ticket for Female.");
        }
            else if(gender.equalsIgnoreCase("Male"))
            {
                System.out.println("Enter your age ?");
                age=s1.nextInt();
                if(age<=12)
                {
                    System.out.println("Half Ticket for Children.");
                }
                else if(age<=59)
                {
                    System.out.println("Full Ticket for Adults.");
                }
                else
                {
                    System.out.println("Half Ticket for Senior Citizens.");
                }
            } 
            else
            {
                System.out.println("Please enter gender as Male or Female only.");
            }
        
    }
}