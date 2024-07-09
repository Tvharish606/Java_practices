package Java_Pratice;

public class Prime_number_1to_100
{
    public static void main(String[]args)
    {
        for(int i=1;i<=100;i++)
        {
            int no=i;
            int count=0;
            for(int j=1;j<=no;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
         if(count==2)
         {
             System.out.println(i + " "+" prime_number");
         }
         else {
             System.out.println("not a prime number");
         }

        }
    }

}
