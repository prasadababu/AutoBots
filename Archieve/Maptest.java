
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;

class Maptest {

    public static void main(String args[]) {

        LinkedHashMap<String, Integer> test = new LinkedHashMap<>();
        test.put("Hi", 10);
        test.put("There", 10);
        test.put("I", 10);
        test.put("am", 10);
        test.put(null, 0);

        // System.out.println(Math.PI() );

        // System.out.println(test.entrySet());

        // for (Map.Entry<String, Integer> entry: test.entrySet()) {
        // System.out.println(entry);
        // }
        // Set set= test.entrySet();

        System.out.println(test.toString());

    }

}