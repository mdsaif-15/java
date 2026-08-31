public class SecondLargest {
    public static void main(String[] args) {
        int Array[] = { 10, 20, 40, 50, 30, 60 };
        int max = Array[0];
        int secondMax = Array[1];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max && Array[i] > secondMax) {
                secondMax = max;
                max = Array[i];

            } else if (Array[i] < max && Array[i] > secondMax) {
                secondMax = Array[i];
            }
        }
        System.out.println(secondMax);
    }
}
