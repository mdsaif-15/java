import java.util.*;

public class factorial {
    public static void main(String[] args) {
        double i, n, fact = 1;
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the 'n' value : ");
        n = Sc.nextDouble();
        for (i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);

    }
}
