public class Basic
{
    static void main1(int a, int b)
    {
        System.out.println("Value of a is"+" "+a);
        System.out.println("Value of b is"+" "+b);
        int x=a+b;
        System.out.println("Addition of a and b is"+" "+x);
    }
    static void main2(int c, int d)
    {
        System.out.println("Value of c is"+" "+c);
        System.out.println("Value of d is"+" "+d);
         int z=c-d;
        System.out.println("Subtraction of c and d is"+" "+z);
    }
    void main3(int e, int f)
    {
        System.out.println("Value of e is"+" "+e);
        System.out.println("Value of f is"+" "+f);
         int y=e*f;
        System.out.println("Multiplication of e and f is"+" "+y);
    }
    void main4(int g, int h)
    {
        System.out.println("Value of g is"+" "+g);
        System.out.println("Value of h is"+" "+h);
         int q=g/h;
        System.out.println("Division of e and f is"+" "+q);
    }
    
    public static void main(String[] args)
    {
        System.out.println("Main Method started");
        main1(5,10);
        main2(7,2);
        Basic b1=new Basic();
        b1.main3(7,8);
        b1.main4(18,3);
    }
}