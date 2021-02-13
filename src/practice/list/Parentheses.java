package practice.list;

import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    public static boolean valid(char[] data) {
        List<Character> left = new ArrayList<>();
        List<Character> right = new ArrayList<>();
        for (char datum : data) {
            if (datum == '(') {
                left.add(datum);
            } else if (datum == ')') {
                right.add(datum);
            }
            if (right.size() > left.size()) {
                return false;
            }
        }
        return right.size() == left.size();
    }
}
