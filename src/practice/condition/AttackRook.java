package practice.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        char[] charLeft = left.toCharArray();
        char[] charRight = right.toCharArray();
        return charLeft[0] == charRight[0] || charLeft[1] == charRight[1];
    }
}
