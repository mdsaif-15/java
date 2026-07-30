//import java.util.*;

public class avgOfArray {
    public static void main(String[] args) {
        int sum = 0;
        double avg;
        int marks[] = new int[6];

        marks[0] = 90;
        marks[1] = 89;
        marks[2] = 57;
        marks[3] = 84;
        marks[4] = 78;
        marks[5] = 86;

        // System.out.println(marks);
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        avg = sum / marks.length;

        System.out.println("the sum of the array is : " + sum);
        System.out.println("the avg of the array is : " + avg);

    }

}
