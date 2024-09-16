package Revision_logical_coding;

import java.util.ArrayList;
import java.util.TreeSet;

public class Autosorting_the_elements_in_collection
{
    public static void main(String[]args)
    {
        ArrayList<Integer> rolenumbers = new ArrayList<>();
        rolenumbers.add(8830);
        rolenumbers.add(8339);
        rolenumbers.add(7353);
        rolenumbers.add(10002);
        rolenumbers.add(2011);
        TreeSet<Integer> orderwise=new TreeSet<Integer>(rolenumbers);
        for(int wsie:orderwise)
        {
            System.out.println(wsie);
        }
    }
}
