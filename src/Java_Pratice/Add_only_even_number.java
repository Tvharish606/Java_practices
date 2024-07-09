package Java_Pratice;

public class Add_only_even_number
{
    public static void main(String[]args)
    {
        int number=123456;
        int sum=0;
        while(number!=0)
        {
           int rem=number%10;
           if(rem%2==0)
           {
               sum=sum+rem;

           }
            number=number/10;

        }
        System.out.println(sum);
    }
}
