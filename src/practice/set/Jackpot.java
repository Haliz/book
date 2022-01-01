package practice.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < combination.length; i++) {
            strings.add(combination[i]);
        }
        if (strings.size() == 1) {
            return true;
        }
        return false;
    }
}
