import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int searchElement;
        boolean founded = true;
        int array[] = { 10, 20, 30, 40, 50 };
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the search element : ");
        searchElement = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (searchElement == array[i]) {
                System.err.println("The element founded at index : " + i);
                founded = false;
            }
        }
        if (founded) {
            System.out.print("The Element not found: ");
        }

    }
}
