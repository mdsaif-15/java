public class RemoveDuplicates {
    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 10, 40, 50, 10, 40 };
        int newArray[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i] != array[j]) {
                    newArray[i] = array[i];
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }

}
