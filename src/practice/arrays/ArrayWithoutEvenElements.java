package practice.arrays;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int k = 0;
        for (int i=0; i< data.length; i++) {
            if (data[i]%2 !=0) {
                data[k] = data[i];
                k++;
            }
        }
        return Arrays.copyOf(data, k);
    }
}
