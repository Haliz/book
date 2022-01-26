package practice.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < hours.length - 2) {
                if (hours[i] <= 8) {
                    sum += hours[i] * 10;
                } else {
                    sum += (hours[i]-8) * 15 + 8 * 10;
                }
            } else {
                if (hours[i] <= 8) {
                    sum += hours[i] * (10*2);
                } else {
                    sum += (hours[i]-8) * (15*2) + 8 * (10*2);
                }
            }
        }
        return sum;
    }
}
