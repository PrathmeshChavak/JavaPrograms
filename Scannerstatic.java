import java.util.Scanner;
public class Basics
{
    static int a;
    static int b;
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter value of a ");
        a=s1.nextInt();
        System.out.println("Enter value of b");
        b=s1.nextInt();
        int c=a+b;
        System.out.println("Addition of a+b is"+" "+c);
    }
}