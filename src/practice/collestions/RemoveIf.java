package practice.collestions;

import java.util.List;

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(elem -> elem.length() < 5);
        return list;
    }
}
