package Revision_logical_coding;

public class fibonoci_series
{
    public static void main(String[]args)
    {
        int number=10;
        int fib1=0;
        int fib2=1;
        System.out.print(fib1+" "+fib2+" ");
        for(int i=0;i<=number;i++)
        {
            int fib3=fib1+fib2;
            System.out.print(fib3+" ");
            fib1=fib2;
            fib2=fib3;

        }


    }
}
