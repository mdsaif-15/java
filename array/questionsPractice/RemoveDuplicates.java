import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 10, 40, 50, 10, 40 };
        int newArray[] = new int[10];
        int index = 0;

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[i + 1]) {
                newArray[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

}
