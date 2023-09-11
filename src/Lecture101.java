import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lecture101 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();   // Date
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:ma");   // Format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate = dt.format(df);  // Creating date string using date and format
        System.out.println(mydate);
    }
}
