package Revision_logical_coding;

public class merge_two_array
{
    public static void main(String[]args)
    {
        int[]member1={20,10,46,89,12,6,22};
        int[]member2={6,29,67,80,11,8,363,393};
        int mergelenght=member1.length+member2.length;
        int[]merge=new int[mergelenght];
        int pos=0;
            for (int m1 : member1)
            {
                merge[pos]=m1;
                pos++;
            }
            for(int m2:member2)
            {
                merge[pos]=m2;
                pos++;
            }
            for(int M:merge)
            {
                System.out.println(M);
            }
    }
}
