package practice.arrays;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int k = 1;
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] >= array[i - 1]) {
                    k++;
                } else {
                 k = 1;
                }
                if (k > count) {
                    count = k;
                }
            }
        }
        return count;
    }
}
