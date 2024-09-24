import java.util.Scanner;
public class Basic
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your name");
        String fname=s1.next();
        System.out.println("Enter your age");
        int age=s1.nextInt();
        System.out.println("Enter your gender");
        String gen=s1.next();
        System.out.println("Are you graduate ?");
        boolean grad=s1.nextBoolean();
        System.out.println("Enter your mobile number");
        long mno=s1.nextLong();
        System.out.println("Enter your salary ?");
        double sal=s1.nextDouble();
        System.out.println("Enter total years of experience ?");
        float exp=s1.nextFloat();
        System.out.println("Thanks for the details");
        System.out.println("____________");
        System.out.println("Below are the details received:");
        System.out.println("Your name is:"+" "+fname);
        System.out.println("Your age is:"+" "+age);
        System.out.println("Your gender is:"+" "+gen);
        System.out.println("Your graduation status is:"+" "+grad);
        System.out.println("Your mobile number is:"+" "+mno);
        System.out.println("Your salary is:"+" "+sal);
        System.out.println("Your total experience is:"+" "+exp);
    }
}