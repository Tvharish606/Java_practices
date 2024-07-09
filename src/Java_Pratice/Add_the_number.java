package Java_Pratice;

public class Add_the_number
{

    public static void main(String[]args)
    {
        int A=12345;
        int sum=0;
        while(A!=0)
        {
            int rem=A%10;
            sum=sum+rem;
            A=A/10;

        }
        System.out.println(sum);

    }
}
