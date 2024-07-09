package Java_Pratice;

public class Seperate_the_characters
{

    public static void main(String[]args)
    {
        String uc=" ";
        String lc=" ";
        String number=" ";
        String SPecial=" ";
        String S="jhadvSSGSFSHSSYqv@#^#*&^#@27473287424387";
        for(int i=0;i<S.length();i++)
        {
           char ch=S.charAt(i);
           if(ch>=65&&ch<=90)
           {
               uc=uc+ch;
           }
           if(ch>=48&&ch<=57)
           {
               number=number+ch;
           }
        }
        System.out.println(uc);
        System.out.println(number);


    }


}
