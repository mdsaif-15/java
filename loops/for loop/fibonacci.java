import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        int i, a = 0, b = 1, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value for 'n' :");
        n = sc.nextInt();
        for (i = 0; i < n - 2; i++) {
            c = a + b;
            System.out.print(c + "\t");
            a = b;
            b = c;
        }
        System.out.println();

    }

}