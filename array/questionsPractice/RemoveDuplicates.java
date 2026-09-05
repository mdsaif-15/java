public class RemoveDuplicates {
    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 10, 40, 50, 10, 40 };
        int newArray[] = new int[10];
        int index = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < index; j++) {
                if (array[i] == newArray[j]) {
                    found = false;
                }
                if (found) {
                    newArray[index] = array[i];
                    index++;
                    found = true;
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

}
