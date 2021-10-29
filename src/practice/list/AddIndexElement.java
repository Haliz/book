package practice.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (check.size() > index && !check.contains(str)) {
            list.add(index, str);
            return true;
        }
        return false;
    }
}
