public class Basics
{
     int a=10;
     int b=2;
    public static void main(String[] args)
    {
        Basics b1=new Basics();
        int c=b1.a+b1.b;
        int d=b1.a-b1.b;
        int e=b1.a*b1.b;
        int f=b1.a/b1.b;
        System.out.println("Addition of a+b is"+" "+c);
        System.out.println("Subtraction of a-b is"+" "+d);
        System.out.println("Multiplication of a*b is"+" "+e);
        System.out.println("Division of a/b is"+" "+f);
    }
}