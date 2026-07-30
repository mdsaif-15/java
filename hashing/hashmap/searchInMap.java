import java.util.*;

public class searchInMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "saif");
        map.put(2, "Rahul");
        map.put(3, "rishab");
        map.put(4, "saif");
        map.put(5, "rahul");

        System.out.println(map);
        System.out.println(map.get(5));

    }

}
