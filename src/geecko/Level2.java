package geecko;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

/*Задача про ступеньки. Надо посчитать максимальную глубину подвала. Есть ступеньки вверх и вниз*/

public class Level2 {
    public static void main(String[] args) {
        System.out.println(getResult(List.of("09:55-10:20","10:45-11:02","12:50-12:55")));
//        System.out.println(fTime("09:55"));
    }

    public static float getResult(List<String> distract) {
        float sum = 0;
        for (String string : distract) {
            String[] split = string.split("-");
            float start = fTime(split[0]);
            float finish = fTime(split[1]);
            float workTime = finish - start;
            sum = sum + workTime;
        }

        float procent = (sum) * 100 / 8;
        String resultString = String.format(new Locale("en","US"),"%.2f", procent);
        float result = Float.parseFloat(resultString);
        return result;
    }

    public static float fTime(String time) {
        String[] splitTime = time.split(":");
        float outTime = Integer.parseInt(splitTime[0]) + (Float.parseFloat(splitTime[1]) / 60);
        return outTime;
    }
}
