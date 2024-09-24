public class Amazon
{
    Amazon()
    {
        System.out.println("Constructor Called");
    }
    public static void main(String[] args)
    {
        Amazon a1=new Amazon();
        new Amazon();
    }
}