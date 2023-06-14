import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> country=new HashMap<>();
        country.put("TR","Turkiye");
        country.put("ENG","England");
        country.put("USA","America");
        System.out.println(country.size());
        System.out.println(country.containsKey("TR"));
        for(String key: country.keySet()){
            System.out.println(key);
        }
        System.out.println("*******************");
        for(String key:country.values()){
            System.out.println(key);
        }

    }
}
