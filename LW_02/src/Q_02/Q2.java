package Q_02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in centimeters: ");
        double cm_value = scanner.nextDouble();

        double totalInches = cm_value / 2.54;
        int feet = (int) (totalInches / 12);
        double inches =totalInches % 12;


        System.out.println(cm_value + " cm is " + feet + " feet and " + inches + " inches.");
        scanner.close();

    }
}
