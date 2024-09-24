import java.util.Scanner;
public class Basics
{
     int a;
     int b;
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        Basics b1=new Basics();
        System.out.println("Enter value of a ");
        b1.a=s1.nextInt();
        System.out.println("Enter value of b");
        b1.b=s1.nextInt();
        int c=b1.a+b1.b;
        System.out.println("Addition of a+b is"+" "+c);
    }
}