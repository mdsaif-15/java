import java.util.*;

public class creation {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // string(key), integer (value);

        map.put("india", 120);
        map.put("russia", 130);
        map.put("usa", 70);
        map.put("china", 160);

        System.out.println(map);
    }
}