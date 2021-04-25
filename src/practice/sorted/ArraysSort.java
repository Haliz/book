package practice.sorted;

import java.util.Arrays;

public class ArraysSort {
    public static long[] sort(long[] data) {
//        return Arrays.stream(data).sorted().toArray();
        Arrays.sort(data);
        return data;
    }
}
