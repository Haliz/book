package practice.collestions;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String rsl = "";
        if (list.isEmpty()) {
            return  rsl;
        }
        return list.get(0);
    }
}
