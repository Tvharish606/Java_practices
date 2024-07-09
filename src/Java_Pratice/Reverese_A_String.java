package Java_Pratice;

public class Reverese_A_String
{
    public static void main(String[]args)
    {
        String A="manikanta";
        String r="";

        for(int i=A.length()-1;i>0;i--)
        {
               r=r+A.charAt(i);
        }
        System.out.println(r);
        if(r.equalsIgnoreCase(A))
        {
            System.out.println("palidrome");
        }
        else {
            System.out.println("not a palidrome");
        }
    }
}
