package Java_Pratice;

import java.net.PasswordAuthentication;

public class Encapsluation {
    private String password = "Harish@606";
    private String password_updated;

    public String get_password() {
        return password;
    }

    public void set_password(String password)
    {
        this.password = password;
    }
}
class main_classss
{
    public static void main(String[]args)
    {
        Encapsluation E=new Encapsluation();
        String Pass = E.get_password();
        System.out.println(Pass);
        E.set_password("Harish@505");
        System.out.println(E.get_password());

    }
}