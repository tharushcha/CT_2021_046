package Q_06;
import javax.swing. *;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width in pixels: ");
        int W = scanner.nextInt();

        System.out.print("Enter the height in pixels: ");
        int H = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the frame title: ");
        String frameTitle = scanner.nextLine();

        scanner.close();

        JFrame frame;
        frame = new JFrame(frameTitle);
        frame.setSize(W, H);
        frame.setVisible(true);

    }
}
