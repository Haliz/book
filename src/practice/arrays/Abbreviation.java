package practice.arrays;

public class Abbreviation {
    public static String collect(String s) {
        s = s.trim();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ' ') {
                sb.append(arr[i + 1]);
            }
        }
        return  sb.toString();
    }
}
