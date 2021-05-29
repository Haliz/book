import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> dailyTemperatures(List<Integer> t) {
        ArrayList<Integer> outList = new ArrayList<>();
        for (int i = 0; i < t.size(); i++) {
            int k = 0;
            for (int j = i; j < t.size(); j++) {
                if (t.get(j) > t.get(i)) {
                    k = j-i;
                    break;
                }
            }
            outList.add(k);
        }
        return outList;
    }


    public static void main(String[] args) {
        List<Integer> listIn = List.of(73, 74, 75, 71, 69, 72, 76, 73);
        System.out.println(dailyTemperatures(listIn));
    }
}
