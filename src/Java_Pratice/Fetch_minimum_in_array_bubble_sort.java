package Java_Pratice;

public class Fetch_minimum_in_array_bubble_sort {
    public static void main(String[] args) {
        int[] value = {20, 30, 10, 5, 8};
        for (int i = 0; i < value.length - 1; i++) {

            for (int j = 0; j < value.length - 1; j++) {
                if (value[j] > value[j + 1]) {
                    int temp = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < value.length; k++)
        {
            System.out.println(value[k]);
        }
        System.out.println(value[0]);
    }
}