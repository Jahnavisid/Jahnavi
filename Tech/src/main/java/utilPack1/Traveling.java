package utilPack1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Traveling{
    public static void main(String[] args) {
       
        System.out.println("Count: " + countSundaysBetween("1900 1 1", "1902 1 1"));
        System.out.println();
        System.out.println("Count: " + countSundaysBetween("1000000000000 2 2", "1000000001000 3 2"));
    }

    static int countSundaysBetween(String strStartDate, String strEndDate) {
        DateTimeFormatter dtfInput = DateTimeFormatter.ofPattern("uuuu M d", Locale.ENGLISH);
        DateTimeFormatter dtfOutput = DateTimeFormatter.ofPattern("d MMMM uuuu", Locale.ENGLISH);
        int count = 0;
        LocalDate start, end;

        System.out.printf("Processing start date: %s and end date: %s%n", strStartDate, strEndDate);

        try {
            start = LocalDate.parse(strStartDate, dtfInput);
        } catch (DateTimeParseException e) {
            System.out.printf("The start date %s can not be processed%n", strStartDate);
            return 0;
        }

        try {
            end = LocalDate.parse(strEndDate, dtfInput);
        } catch (DateTimeParseException e) {
            System.out.printf("The end date %s can not be processed%n", strEndDate);
            return 0;
        }

        for (LocalDate date = start.with(TemporalAdjusters.firstDayOfMonth()); !date.isAfter(end); date = date
                .plusMonths(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println(date.format(dtfOutput));
                count++;
            }
        }

        return count;
    }
}