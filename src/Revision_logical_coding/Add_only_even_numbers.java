package Revision_logical_coding;

public class Add_only_even_numbers
{
    public static void main(String[]args)
    {
        int number=286327638;
        int rem=0;
        int addeven=0;
        while (number!=0)
        {
            rem=number%10;
            if(rem%2==0)
            {
                addeven=addeven+rem;
            }
            number=number/10;
        }
        System.out.println(addeven);
    }
}
