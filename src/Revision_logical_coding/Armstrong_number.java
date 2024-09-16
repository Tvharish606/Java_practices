package Revision_logical_coding;

public class Armstrong_number
{
    public static void main(String[]args)
    {
        int number=153;
        int copy=number;
        int rem=0;
        int add=0;
        while(number!=0)
        {
            rem=number%10;
            add=add+(rem*rem*rem);
            number=number/10;
        }
        System.out.println(add);
        if(copy==add)
        {
            System.out.println("armstrong_number");
        }
        else {
            System.out.println("not a armstrong");
        }
    }
}
