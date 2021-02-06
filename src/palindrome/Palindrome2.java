package palindrome;

import java.util.Objects;

public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("10001"));
        System.out.println(isPalindrome("12345"));
        System.out.println(isPalindrome("123321"));
    }

    private static boolean isPalindrome(String numberAsString) {
        System.out.println(numberAsString);
        char[] args = numberAsString.toCharArray();
        for (int i = 0; i < args.length / 2; i++) {
//            System.out.println(args[i]);
            boolean rsl = Objects.equals(args[i], args[args.length - 1 - i]);
            if (!rsl) {
                return false;
            }
        }
        return true;
    }
}


