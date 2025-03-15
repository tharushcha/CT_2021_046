package Q_08;

import java.util.Scanner;

public class Q8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter radius of the sphere: ");
            double r = scanner.nextDouble();

            double volume = (4.0 / 3) * Math.PI * Math.pow(r, 3);
            System.out.println("Volume of the sphere: " + volume);
            scanner.close();
        }
}


