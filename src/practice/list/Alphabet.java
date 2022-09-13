package practice.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        String[] subString = s.split("");
        List<String> list = Arrays.asList(subString);
        list.sort(null);
        StringBuilder s1 = new StringBuilder();
        list.forEach(s1::append);
        return s1.toString();
        // Это другой вариант метода:
//        char[] list = s.toCharArray();
//        Arrays.sort(list);
//        return String.valueOf(list);
    }
}
