package Java_Pratice;

public class Multi_level_inheritance
{
    int a=20;
}
class subclass_1 extends Multi_level_inheritance
{
    void first_implement()
    {
        System.out.println("count");
    }

}
class Sub_class_2 extends subclass_1
{
    void second_implements()
    {
        System.out.print("good_second_one");
        super.first_implement();
    }
}
class main_handler
{
    public static void main(String[]args)
    {
        Sub_class_2 S2=new Sub_class_2();
        S2.first_implement();
        S2.second_implements();

    }
}
