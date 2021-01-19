package palindrome;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("10001"));
        System.out.println(isPalindrome("12345"));
        System.out.println(isPalindrome("123321"));

        System.out.println(isSumEven("21345"));
        System.out.println(isSumEven("999"));
    }

    private static int isSumEven(String numberAsString) {
       var n = Integer.parseInt(numberAsString);
        int sum = 0;
        while (n != 0) {
            //Суммирование цифр числа
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    private static boolean isPalindrome(String numberAsString) {
        numberAsString.replaceAll("\\W","");
        System.out.println(numberAsString);
        return numberAsString.equalsIgnoreCase(new StringBuilder(numberAsString.replaceAll("\\W",""))
                .reverse().toString());
    }
}


