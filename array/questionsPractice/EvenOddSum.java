public class EvenOddSum {
    public static void main(String[] args) {
        int Array[] = { 10, 20, 40, 50, 30, 60, 90, 10, 400, 68, 45,
                12, 56, 23, 45, 67, 68, 405, 203, 560, 601,
                23, 43, 17, 14, 15, 67, 45, 20, 34, 45, 612,
                89, 98, 67, 45, 90, 112, 132, 24, 901 };
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0) {
                evenSum += Array[i];
            } else {
                oddSum += Array[i];
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
