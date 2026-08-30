public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] ReverseArray = new int[5];
        array[0] = 11;
        array[1] = 12;
        array[2] = 13;
        array[3] = 14;
        array[4] = 15;
        for (int i = 0; i <= array.length - 1; i++) {
            ReverseArray[i] = array[array.length - 1 - i];
        }
        System.err.print("Original : ");
        for (int i = 0; i < array.length; i++) {
            System.err.print(array[i] + " ");
        }
        System.err.println();
        System.err.print("Reverse : ");
        for (int i = 0; i < ReverseArray.length; i++) {
            System.err.print(ReverseArray[i] + " ");
        }
    }

}
