package Q_01;

public class Q1 {
    public static void main(String[] args) {
        for (int i = 10; i <= 49; i++) {
            System.out.print(i + " ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}

