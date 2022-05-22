import java.util.HashMap;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        HashMap<String, String> userMap = new HashMap <String, String>();
        userMap.put("Butterflies", "You give me butterflies, inside.");
        userMap.put("Honest", "Honest. I like it.");
        userMap.put("Test", "This soung says Test.");
        userMap.put("Nice song", "A really great song!");

        Set<String> keys = userMap.keySet();
        for(String key : keys) {

            // System.out.println(key);
            System.out.println(key + ": " + userMap.get(key));

        }
    }
}