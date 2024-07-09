package Java_Pratice;

public class Count_of_String
{
    public static void main(String[]args) {
        String A = "harish";
        int h=0,a=0,r=0,i=0,s=0;

        for (int j = 0; j < A.length(); j++)
        {
           if (A.charAt(j)=='h'){
               h++;

           } else if (A.charAt(j)=='a') {
               a++;
           }
        }
        System.out.println("h"+h);
        System.out.println("a"+a);

    }
}
