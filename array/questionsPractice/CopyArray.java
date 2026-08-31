public class CopyArray {
    public static void main(String[] args) {

        int array[] = { 10, 20, 30, 40, 50, 60 };
        int newArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        System.err.println("Original Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.err.println("Copy Array");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}
