public class LargestElement {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 11;
        array[1] = 12;
        array[2] = 13;
        array[3] = 14;
        array[4] = 15;
        int max = array[0];
        for (int i = 0; i <= 4; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.err.println("The largest elements : " + max);
    }

}
