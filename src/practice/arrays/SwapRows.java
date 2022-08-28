package practice.arrays;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data[dst].length; i++) {
            int temp = data[dst][i];
            data[dst][i] = data[src][i];
            data[src][i] = temp;
        }
    }
}
