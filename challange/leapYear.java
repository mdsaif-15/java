import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.err.print("enter the year : ");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.print("this is a leap year!!!\n");
            } else {
                System.out.print("this is not a leap year!!!\n");
            }
        } else if (year % 4 == 0) {
            System.out.print("This is a leap year!!!\n");
        } else {
            System.out.print("This is not a leap year!!!\n");
        }
    }

}