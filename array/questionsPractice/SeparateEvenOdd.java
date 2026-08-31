public class SeparateEvenOdd {
    public static void main(String[] args) {
        int Array[] = { 10, 21, 41, 50, 30, 61 };
        int oddArray[] = new int[3];
        int evenArray[] = new int[3];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0) {
                evenArray[evenIndex] = Array[i];
                evenIndex++;

            } else {
                oddArray[oddIndex] = Array[i];
                oddIndex++;
            }
        }
        System.out.print("Even Array: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
        System.out.print("Odd Array: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
    }
}
