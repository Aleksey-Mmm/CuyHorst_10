package primery;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarTest {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); //задание даты первого дня месяца
        DayOfWeek weekDay = date.getDayOfWeek();
        int wDValue = weekDay.getValue();

        System.out.println(" Пн. Вт. Ср. Чт. Пт. Сб. Вс.");
        for (int i = 1; i < wDValue; i++) {
            System.out.print("    ");
        }
        while (month == date.getMonthValue()) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            //weekDay = date.getDayOfWeek();
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

        System.out.println();
        //System.out.println(wDValue);

    }
}
