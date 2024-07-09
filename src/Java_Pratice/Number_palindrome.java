package Java_Pratice;

public class Number_palindrome {
    public static void main(String[] args)
    {
        int number=12321;
        int copy=number;
        int rev=0;
        while(number!=0)
        {
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        if(copy==rev)
        {
            System.out.println(rev);
        }


    }
}
