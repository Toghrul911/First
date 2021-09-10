import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(ZoneId.of("UTC"));
        System.out.println(localDate);
    }

    public static class LocalDateEx {
        public static void main(String[] args) {
            LocalDate localDate = LocalDate.now(ZoneId.of("UTC"));
            System.out.println(localDate);

            localDate = LocalDate.of(2020, 11, 8);
            System.out.println(localDate);

            localDate = LocalDate.of(2020, Month.APRIL, 8);
            System.out.println(localDate);


            System.out.println(LocalDate.now().toString());



        }
    }

    public static class LocalTimeExp {
        public static void main(String[] args) {
            LocalTime localTime = LocalTime.now();
            System.out.println(localTime);
        }
    }
}

