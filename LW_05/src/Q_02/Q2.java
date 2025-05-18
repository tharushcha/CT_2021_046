package Q_02;

import java.util.Scanner;

public class Q2 {
    public static int countDigits(int number) {
        int count = 0;
        if (number == 0) return 1;
        number = Math.abs(number);
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            num = input.nextInt();
            if (num < 0) break;
            System.out.println("Number of digits: " + countDigits(num));
        }
    }
}
