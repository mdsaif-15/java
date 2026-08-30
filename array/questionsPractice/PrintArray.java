public class PrintArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 11;
        array[1] = 12;
        array[2] = 13;
        array[3] = 14;
        array[4] = 15;
        System.err.println("Elements of array");
        for (int i = 0; i < array.length; i++) {
            System.err.println(array[i]);
        }
    }
}
