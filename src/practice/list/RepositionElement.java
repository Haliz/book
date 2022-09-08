package practice.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String value = list.remove(list.size() - 1);
        if (index < list.size()) {
            list.set(index, value);
        }
        return list;
    }
}
