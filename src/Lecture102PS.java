import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Lecture102PS {
    public static void main(String[] args) {
        // Question 1
//        ArrayList ar = new ArrayList();
//        ar.add("Student 1");
//        ar.add("Student 2");
//        ar.add("Student 3");
//        ar.add("Student 4");
//        ar.add("Student 5");
//        ar.add("Student 6");
//        ar.add("Student 7");
//        ar.add("Student 8");
//        ar.add("Student 9");
//        ar.add("Student 10");
//        for(Object o: ar){
//            System.out.println(o);
//        }
        // Question 2
//        Date dt = new Date();
//        System.out.println(dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds());
        // Question 3
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        // Question 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);
        // Question 5
//        HashSet<Integer> s = new HashSet<>();
//        s.add(5);
//        s.add(6);
//        s.add(46);
//        s.add(60);
//        s.add(9);
//        s.add(6);
//        System.out.println(s);
    }
}
