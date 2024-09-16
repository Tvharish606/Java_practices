package Revision_logical_coding;

public class Add_the_number
{
    public static void main(String[]args)
    {
        int number=3763612;
        int add=0;
        int rem=0;
        while(number!=0)
        {
            rem=number%10;
            add=add+rem;
            number=number/10;
        }
        System.out.println(add);
    }
}
