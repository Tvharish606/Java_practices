package Revision_logical_coding;

public class Autosorting_the_array_elements
{
    public static void main(String[]args)
    {
        int[]numbers={262,833,922,102,24};
        int temp=0;
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int f=i;f<numbers.length-1;f++)
            {
                if(numbers[i]>numbers[f+1])
                {
                    temp=numbers[f+1];
                    numbers[f+1]=numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        for (int number : numbers) {
    System.out.println(number);
}
}
}
