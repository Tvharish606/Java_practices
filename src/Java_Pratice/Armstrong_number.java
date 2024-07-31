package Java_Pratice;

public class Armstrong_number
{
    public static void main(String[]args)
    {
        int a=153;
        int copy=a;
         int Strong=0;
         while(a!=0)
         {
             int num=a%10;
              Strong=Strong+(num*num*num);
              a=a/10;
         }
         if(copy==Strong)
         {
             System.out.println(Strong);
         }
    }
}
