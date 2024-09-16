package Java_Pratice;

import java.util.ArrayList;
import java.util.TreeSet;

public class Autosort_elements
{
    public static void main(String[]args)
    {
        ArrayList<Integer> amount= new ArrayList<>();
        amount.add(8830);
        amount.add(8339);
        amount.add(7353);
        amount.add(10002);
        amount.add(2011);
        System.out.println(amount);
        TreeSet<Integer> sorted_amount=new TreeSet<>(amount);
        System.out.println(sorted_amount);
    }
}
