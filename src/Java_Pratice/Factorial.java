package Java_Pratice;

public class Factorial
{
    public static void main(String[]args)
    {
        long no=20;
        long fact=1;
        for(long i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
