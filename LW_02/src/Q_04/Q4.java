package Q_04;

import java.util.Scanner;

public class Q4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter weight in pounds: ");
            double bodyWeight = scanner.nextDouble();

            double calories = bodyWeight * 19;
            System.out.println("Daily caloric needs: " + calories);
            scanner.close();
        }
}


