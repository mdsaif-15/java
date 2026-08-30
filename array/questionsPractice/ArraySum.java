public class ArraySum {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[5];
        array[0] = 11;
        array[1] = 12;
        array[2] = 13;
        array[3] = 14;
        array[4] = 15;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.err.println("the total sum of the array is : " + sum);

    }
}
