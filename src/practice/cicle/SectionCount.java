package practice.cicle;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        int i = 1;
        while(section*i <= length){
            count=i;
            i++;
        }
        return count;
    }
}