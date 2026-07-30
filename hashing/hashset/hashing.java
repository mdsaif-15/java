import java.util.HashSet;
import java.util.Iterator;

public class hashing {
    public static void main(String[] args) {

        // creating hashset
        HashSet<Integer> set = new HashSet<>();

        // inserting element

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);

        System.out.println(set);

        // deleting element

        set.remove(4);

        // searching element

        if (set.contains(1)) {
            System.out.println("yes the contain's element ");
        }
        if (!set.contains(6)) {
            System.out.println("No the entement not contains.");
        }

        // size of hashset

        System.err.println("the size of the set is : " + set.size());

        // iterater

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
