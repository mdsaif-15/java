import java.util.Scanner;

public class searchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the length of the array !!!");

        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter elements of array : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the Element you want to search : ");
        int searchElement = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Index of searched element is : " + i);
            }
        }

    }

}
