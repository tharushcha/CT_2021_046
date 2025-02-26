import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        System.out.print("Enter your first name: ");
        firstName = scanner.next();
        String middleName;
        System.out.print("Enter your middle name: ");
        middleName = scanner.next();
        String lastName;
        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        scanner.close();

        System.out.println(firstName + " " + middleName.charAt(0) + "." + lastName);
        scanner.close();
    }
}


