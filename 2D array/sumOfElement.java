import java.util.*;

public class sumOfElement {
    public static void main(String[] args) {
        int[][] inArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum = 0;
        int count = 0;
        int subCount = 0;
        System.out.println("the elements are ->" + "\n");

        for (int i = 0; i < inArray.length; i++) {
            for (int j = 0; j < inArray[i].length; j++) {
                System.out.print(inArray[i][j] + "\t");
                sum = sum + inArray[i][j];
                count++;
                subCount++;
                if (subCount == 3) {
                    System.out.println("\n");
                    subCount = 0;
                }

            }
            System.out.println();

        }
        System.out.println("the sum is : " + sum + "\n");
        System.out.println("The average is : " + sum / count + "\n");
    }
}