import java.util.*;

public class addElementInHashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1) for enter element: ");

            int c = sc.nextInt();

            if (c == 1) {
                System.out.print("enter the element :  ");
                int e = sc.nextInt();

                set.add(e);
            } else {
                if (set.size() >= 1) {
                    System.out.println("element entered successfully!!");
                    break;

                } else {
                    System.err.println("Invalid input !!");
                    break;
                }
            }

        }
        System.out.println("the set is : " + set);
    }
}