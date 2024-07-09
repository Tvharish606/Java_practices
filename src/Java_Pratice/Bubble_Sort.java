package Java_Pratice;

public class Bubble_Sort
{
    public static void main(String[]args)
    {
        int[]arr={20,10,30,40};

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i;j<arr.length-1;j++)
            {
                if(arr[i]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int K=0;K<arr.length;K++)
        {
            System.out.print(arr[K]+" ");
        }
    }
}
