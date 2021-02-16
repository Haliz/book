package practice.stream;

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
      return    list.stream().reduce((a1, a2) -> a1 * a2).get();
    }
}
