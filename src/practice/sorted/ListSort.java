package practice.sorted;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static List<String> sort(List<String> data) {
        data.sort(Collections.reverseOrder((x, y) -> x == null ? -1 : x.compareTo(y)));
        return data;
    }
}
