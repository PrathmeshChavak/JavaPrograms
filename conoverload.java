public class Amazon
{
    Amazon()
    {
        System.out.println("1st Constructor Called");
    }
    Amazon(int a)
    {
        System.out.println("2nd constructor called with a single int parameter"+" "+a);
    }
    Amazon(int a, int b)
    {
         System.out.println("3rd constructor called with a two int parameter"+" "+a+" "+"and "+b);
    }
    public static void main(String[] args)
    {
        Amazon a1=new Amazon();
        new Amazon(5);
        new Amazon(7,3);
    }
}