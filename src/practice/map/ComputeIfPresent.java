package practice.map;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        name.computeIfPresent(1, (key, value) -> value + " " + surname.get(key));
        name.computeIfPresent(2, (key, value) -> value + " " + surname.get(key));
        return name ;
    }
}
