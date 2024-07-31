package Java_Pratice;

import java.lang.reflect.Array;

public class Merge_two_arrays_and_sort_the_values {
    public static void main(String[] args) {
        int pos = 0;
        int temp = 0;
        int[] first = {1, 3, 5, 7};
        int[] second = {2, 4, 6};
        int length = first.length + second.length;
        int[] output = new int[length];
        for (int i : first) {
            output[pos] = i;
            pos++;
        }
        for (int j : second) {
            output[pos] = j;
            pos++;
        }
        for (int K : output) {
            System.out.print(K);
        }
        System.out.println();
        for (int l = 0; l < output.length; l++)
        {
            for (int j = l + 1; j < output.length; j++) {
                if (output[l] > output[j]) {
                    temp = output[l];
                    output[l] = output[j];
                    output[j] = temp;
                }
            }
        }
        for (int M : output) {
            System.out.print(M);
        }
    }
}
