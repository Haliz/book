package practice.cicle;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            //Суммирование цифр числа
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}

