package Java_Pratice;

import java.util.Arrays;

public class Merge_two_arrays
{
    public static void main(String[]args)
    {
        int[]arr={12,30,21,8,4,32};
        int[]abb={20,30,60,45};
        int size=arr.length+abb.length;
        int[]acc=new int[size];
        int pos=0;
        for(int i:arr)
        {
            acc[pos]=i;
            pos++;
        }
        for(int j:abb)
        {
            acc[pos]=j;
            pos++;
        }
        Arrays.sort(acc);
        for( int k:acc)
        {
        System.out.println(k);
        }
    }
}
