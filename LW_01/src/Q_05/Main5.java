package Q_05;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main5 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date();
        sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(sdf.format(today));
    }
}
