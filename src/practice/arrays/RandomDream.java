package practice.arrays;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        int i = (num % prizes.length) == 0 ? prizes.length-1 : (num % prizes.length - 1);
        return prizes[i] ;
    }
}
