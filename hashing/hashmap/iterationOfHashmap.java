import java.util.*;

public class iterationOfHashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "saif");
        map.put(2, "Rahul");
        map.put(3, "rishab");
        map.put(4, "saif");
        map.put(5, "rahul");

        for (Map.Entry<Integer, String> e : map.entrySet()) {

            System.out.print(e.getKey() + "  ");
            System.out.println(e.getValue() + "  ");

        }
    }
}
