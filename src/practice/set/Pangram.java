package practice.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        String letters = s.replaceAll("[^a-zA-Z]", "");

        char[] chars = letters.toLowerCase().toCharArray();
        Set<Character> list = new HashSet<>();
        for (char c : letters.toLowerCase().toCharArray()) {
            list.add(c);
        }
        if(list.size() == 26) {
            return true;
        }
        return false;
    }
}
