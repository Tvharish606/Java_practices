package Java_Pratice;

import java.util.*;

public class Reverse_a_Words
{



    public static void main (String[]args)
    {
        String sentence="i am harish";
        String[]sent=sentence.split(" ");
        List<String> list= Arrays.asList(sent);
        Collections.reverse(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
