public class BitTest {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        System.out.println(binary(n));
        System.out.println(binary(n>>>16));

    }

    public static String binary(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 31; i++) {
            sb.append(num % 2 == 0 ? 0 : 1);
            sb.append((i + 1) % 8 == 0 ? " " : "");
            num /= 2;
        }
        return sb.reverse().toString();
    }

}
