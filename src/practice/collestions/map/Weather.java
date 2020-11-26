package practice.collestions.map;
import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        HashMap<String, Integer> sum = new HashMap<>();
       for (Info elem :list ) {
           if (sum.containsKey(elem.getCity())) {
               var rainfall = sum.get(elem.getCity()) + elem.getRainfall();
               sum.put(elem.getCity(), rainfall);
           } else {
               sum.put(elem.getCity(), elem.getRainfall());
           }
       }
           for (String key : sum.keySet()) {
               rsl.add(new Info(key, sum.get(key)));
           }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }

        @Override
        public String toString() {
            return "Info{" +
                    "city='" + city + '\'' +
                    ", rainfall=" + rainfall +
                    '}';
        }
    }
}
