package Java_Pratice;
class get_and_set_data
{
    private String password="harish@606";
    public String getpassword()
    {
        return password;
    }
    public get_and_set_data(String password)
    {
       this.password=password;
    }
}
public class Enscapulate_the_data
{
    public static void main(String[]args)
    {
        get_and_set_data s=new get_and_set_data("fan_and_fun");
        System.out.println(s.getpassword());
    }
}
