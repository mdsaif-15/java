public class ArrayAverage {
    public static void main(String[] args) {
        int sum = 0, avg;
        int[] array = new int[5];
        array[0] = 11;
        array[1] = 12;
        array[2] = 13;
        array[3] = 14;
        array[4] = 15;
        for (int i = 0; i <= 4; i++) {
            sum += array[i];
        }
        avg = sum / 5;
        System.err.println("the average of the array is : " + avg);
    }
}
