package Q_07;

import java.util.Scanner;

public class Q7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter weight in kg: ");
            int w = scanner.nextInt();

            System.out.print("Enter height in cm: ");
            int h = scanner.nextInt();

            double bmi = w / Math.pow(h / 100.0, 2);
            System.out.println("Your BMI is: " + bmi);
            scanner.close();
        }
}

