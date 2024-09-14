package BasicPrograms;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Daysbetweentodates {

    public static long getDaysBetween(String date1, String date2) {
        // Parse the input dates as LocalDate
        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate secondDate = LocalDate.parse(date2);

        // Calculate the number of days between the two dates
        return ChronoUnit.DAYS.between(firstDate, secondDate);
    }

    public static void main(String[] args) {
        String date1 = "2023-09-01";
        String date2 = "2023-09-15";

        long daysBetween = getDaysBetween(date1, date2);
        System.out.println("Days between the two dates: " + daysBetween);
    }

}
