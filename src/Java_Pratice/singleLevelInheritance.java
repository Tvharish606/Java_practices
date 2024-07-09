package Java_Pratice;

public class singleLevelInheritance
{
    public void whatsapp()
    {
        System.out.println("whatsapp is runnig");
    }
}
class Sub_class extends singleLevelInheritance
{
    public void facebook()
    {
        System.out.println("facebook is running");
    }
}
class main_class
{
    public static void main(String[]args)
    {
        Sub_class S=new Sub_class();
        S.facebook();
        S.whatsapp();

    }
}
