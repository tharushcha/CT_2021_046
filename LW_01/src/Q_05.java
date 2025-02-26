import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_05 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        System.out.println(today.format(formatter));
    }
}
