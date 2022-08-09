package practice.arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int number = 1;
        for (int row = 0; row < count; row++) {
            triangle[row] = new int[row + 1];
            for (int i = 0; i < triangle[row].length; i++) {
                triangle[row][i] = number++;
            }
        }

        return triangle;
    }
}
