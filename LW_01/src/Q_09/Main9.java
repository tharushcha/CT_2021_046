package Q_09;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(input.length());
        System.out.println(input.charAt(0));
        System.out.println(input.charAt(input.length() - 1));
    }
}
