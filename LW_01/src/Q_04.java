import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_04 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        System.out.println(today.format(formatter));
    }
}
