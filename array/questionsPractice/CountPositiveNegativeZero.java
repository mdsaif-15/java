public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        int array[] = new int[10];
        int zeroCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        array[0] = -1;
        array[1] = 0;
        array[2] = 3;
        array[3] = -4;
        array[4] = 0;
        array[5] = 6;
        array[6] = -7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == 0) {
                zeroCount += 1;
            } else if (array[i] > 0) {
                positiveCount += 1;
            } else {
                negativeCount += 1;
            }
        }
        System.err.println("Number of  Zeros in array : " + zeroCount);
        System.err.println("Number of positive elements : " + positiveCount);
        System.err.println("Number of negative elements : " + negativeCount);
    }
}
