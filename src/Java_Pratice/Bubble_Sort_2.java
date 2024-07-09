package Java_Pratice;

public class Bubble_Sort_2
{
    public static void main(String[]args)
    {
        int[]arr={20,3,35,12,4,1};

        for(int i=0;i<arr.length-1;i++)
        {
            for (int j = 0; j < arr.length-1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
            for (int k = 0; k < arr.length; k++)
            {
                System.out.println(arr[k]+" ");
            }


        }




}
