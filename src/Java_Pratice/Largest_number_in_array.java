package Java_Pratice;

public class Largest_number_in_array {
    public static void main(String[] args) {


        int[] a = {20, 10, 3, 11, 7, 2};
        int largest = 0;
        for (int i = 0; i < a.length;i++)
        {
            if(a[i] > largest)
            {
                largest=a[i];

            }

        }
        System.out.print(largest);
    }
}