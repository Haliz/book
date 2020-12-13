package palindrome;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("10001"));
        System.out.println(isPalindrome("12345"));
        System.out.println(isPalindrome("123321"));

//        System.out.println(isSumEven("21345"));
//        System.out.println(isSumEven("999"));
    }

    private static boolean isSumEven(String numberAsString) {
        //write you code here
        return false;
    }

    private static boolean isPalindrome(String numberAsString) {
        numberAsString.replaceAll("\\W","");
        System.out.println(numberAsString);
        return numberAsString.equalsIgnoreCase(new StringBuilder(numberAsString.replaceAll("\\W",""))
                .reverse().toString());
    }
}


