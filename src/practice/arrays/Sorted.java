package practice.arrays;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = true;
        for (int i=1; i < array.length; i++) {
            if (array[i] < array[i-1]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
