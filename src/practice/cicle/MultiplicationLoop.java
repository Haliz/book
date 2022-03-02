package practice.cicle;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        var rls = 1;
        for(int i=a; i<=b; i++) {
            rls *= i;
        }
        return rls;
    }
}
