package practice.list;

import java.util.List;

public class ArProgression {

    public static int checkData(List<Integer> data) {
    boolean progression = true;
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                progression = false;
                break;
            }
        }
        if (progression) {
            int sum = 0;
            for (int e : data) {
                sum += e;
            }
            return sum;
        }
        return 0;
    }
}