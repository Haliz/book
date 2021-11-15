package geecko;

import java.util.List;

/*Задача про ступеньки. Надо посчитать максимальную глубину подвала. Есть ступеньки вверх и вниз*/

public class Level1 {
    public static void main(String[] args) {
        System.out.println(getResult(List.of("d", "d", "d", "u", "d", "d", "u")));
    }

    public static int getResult(List<String> arraySteps) {
        int rsl = 0;
        int deep = 0;
        for (String step : arraySteps) {
            if (step.equals("d")) {
                deep++;
            }
            else if (step.equals("u")) {
                deep--;
            }
            if (deep > rsl) {
                rsl = deep;
            }
        }
        return rsl;
    }
}
