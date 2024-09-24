public class Basics
{
    public static void main(String[] args)
    {
        System.out.println("Main Method called");
        Basics b1=new Basics();
        b1.main();
        b1.main("Prathamesh",'M');
    }
    void main()
    {
        System.out.println("Main method with no arguments is called");
    }
    static void main(String name, char gender)
    {
        System.out.println("Main method with name and gender arguments is called"+" "+name+" "+gender);
    }
}