package Revision_logical_coding;

public class Add_the_number_only_add
{
    public static void main(String[]args)
    {
        int number=3837383;
        int rem=0;
        int add=0;
        while (number!=0)
        {
            rem=number%10;
            if(rem%2==1)
            {
                add=add+rem;
            }
            number=number/10;
        }
        System.out.println(add);
    }
}
