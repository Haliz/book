package practice.sorted;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortWithObject {
    public static String[] sort(String[] data) {
        return Arrays.stream(data).sorted(Comparator.reverseOrder()).toArray(String[]::new);
    }
}

