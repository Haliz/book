package practice.arrays;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        for (int i = 0; i < string.length; i++){
            if (string[i] == c){
                rsl = i;
                number--;
                if (number == 0){
                    break;
                }
            }
        }
        return rsl;
    }
}