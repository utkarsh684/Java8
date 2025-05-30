package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dateAndTime {
    public static void main(String[] args) {
        // use of local date
        LocalDate now =LocalDate.now();
        LocalDate myDate =LocalDate.of(2011, 3, 12);
        System.out.println(now);
        LocalDate yesterday=now.minusDays(1);
        LocalDate past=now.minusMonths(1);
        System.out.println(yesterday);
        System.out.println(past);

        // use of local time
        LocalTime now2 =LocalTime.now();
        LocalTime myTime =LocalTime.of(23, 23,45);
        LocalTime now3=now2.minusHours(1);

        // localdate&time
        LocalDateTime now4= LocalDateTime.now();
        LocalDateTime parse =LocalDateTime.parse("2025-01-11T13:48");
        System.out.println(parse);
    }

}
