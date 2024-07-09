package Java_Pratice;

public class Add_number_only_add
{
    public static void main(String[]args)
    {
        int sum=0;
        int number=12345678;
        while(number!=0)
        {
          int  rem=number%10;
          if(rem%2==1)
          {
              sum=sum+rem;
          }
          number=number/10;
        }
        System.out.println(sum);
    }
}
