package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s1 = "56";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(s1);
//            if (matcher.matches()) System.out.println("Соответствует");
//            else System.out.println("Не соответствует");
//            System.out.println(matcher.matches());
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "    " + matcher.group());
        }
    }
}
