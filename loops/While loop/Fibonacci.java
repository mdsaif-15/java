public class Fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int count = 1;
        while (count <= 10) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
    }
}