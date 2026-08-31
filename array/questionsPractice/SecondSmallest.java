public class SecondSmallest {
    public static void main(String[] args) {
        int Array[] = { 10, 20, 40, 50, 30, 60 };
        int min = Array[0];
        int secondMin = Array[1];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < min && Array[i] < secondMin) {
                secondMin = min;
                min = Array[i];

            } else if (Array[i] > min && Array[i] < secondMin) {
                secondMin = Array[i];
            }
        }
        System.out.println(secondMin);
    }
}
