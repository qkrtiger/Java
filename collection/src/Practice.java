import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("soccer", "축구");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String abc = entry.getKey();
            String korean = entry.getValue();

            System.out.println(abc + ": " + korean);
        }
    }
}