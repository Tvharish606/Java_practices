package Java_Pratice;

 class Method_Overridding
{
    void Version_1()
    {
        System.out.println("build_1_updates");
    }
}
class overrideen extends Method_Overloading
{
    public void Version_1()
    {

        System.out.println("build_1_2nd_updates");


    }
}
class main
{
    public static void main(String[]args)
    {
        overrideen O=new overrideen();
        O.Version_1();
    }
}
