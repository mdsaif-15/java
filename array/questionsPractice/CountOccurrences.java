public class CountOccurrences {
    public static void main(String[] args) {
        int count = 0;
        int searchElement = 10;
        int array[] = { 10, 20, 10, 40, 10 };
        for (int i = 0; i < array.length; i++) {
            if (searchElement == array[i]) {
                count += 1;
            }
        }
        System.err.println("The " + searchElement + " occurres " + count + " times in ths array.");
    }
}
