package Java_Pratice;

public class Duplicate_charaters
{
    public static void main(String[]args)
    {
        String A="HarisH";
        for(int i=0;i<A.length();i++)
        {
            for(int j=i+1;j<A.length();j++)
            {
                if(A.charAt(i)==A.charAt(j))
                {
                    System.out.println(A.charAt(i));
                }
            }
        }
    }
}
