package primery.HFJ_2012.chapter4_2_3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar_1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);
        DayOfWeek dayWeek = date.getDayOfWeek();
        int dayValue = dayWeek.getValue();
        System.out.println(" Пн. Вт. Ср. Чт. Пт. Сб. Вс.");
        for (int i = 1; i < dayValue; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (date.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
            date = date.plusDays(1);

        }
    }
}
