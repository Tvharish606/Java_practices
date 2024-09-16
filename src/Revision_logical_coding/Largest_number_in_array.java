package Revision_logical_coding;

public class Largest_number_in_array
{
    public static void main(String[]args)
{
    int[]arr={20,71,29,8,29};
    int largest=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i] > largest)
        {
            largest=arr[i];
        }

    }
    System.out.println(largest);
}
}
