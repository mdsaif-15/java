public class CountEvenOdd {
    public static void main(String[] args) {
        int array[] = new int[10];
        int evenCount = 0;
        int oddCount = 0;
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        System.err.println("Number of even elements : " + evenCount);
        System.err.println("Number of odd elements : " + oddCount);
    }
}
