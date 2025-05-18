package Q_06;

import java.util.Scanner;
import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        System.out.println("Welcome to the number guessing game!");

        while (guess != secretNumber) {
            System.out.println("Guess a number between 1 and 100: ");
            guess = input.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low!,Try again");
            } else if (guess > secretNumber) {
                System.out.println("Too high!,Try again");
            } else {
                System.out.println("Congratulations..! You guessed the number.");
            }
        }
    }
}
