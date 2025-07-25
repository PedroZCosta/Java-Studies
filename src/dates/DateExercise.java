package dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateExercise {

    public static void main(String[] args) {
        LocalDate localDateWithoutTimezone = LocalDate.now();
        LocalDateTime dateTimeWithTimezone = LocalDateTime.now();
        Instant instant = Instant.now();
        LocalDate localDateParse = LocalDate.parse("2025-07-09");
        Instant instantParseISO = Instant.parse("2025-07-09T01:12:30-03:00");

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDateFormatted = LocalDate.parse("20/07/2025", formatter);

        DateTimeFormatter formatterWithHour = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime localDateFormattedWithHour = LocalDateTime.parse("20/07/2025 01:20", formatterWithHour);

        LocalDate dateOf = LocalDate.of(2022, 07, 20);
        LocalDateTime dateTimeOf = LocalDateTime.of(2022, 07, 20, 10, 20);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Para classes Instant
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        DateTimeFormatter formatter3 = DateTimeFormatter.ISO_DATE_TIME;




        System.out.println("Without timezone: " + localDateWithoutTimezone);
        System.out.println("w/ timezone: " +  dateTimeWithTimezone);
        System.out.println("Instant: " + instant);
        System.out.println("Parse: " + localDateParse);
        System.out.println("ISO parse: " + instantParseISO);
        System.out.println("format: " + localDateFormatted.format(formatter));
        System.out.println("format with hour: " + localDateFormattedWithHour.format(formatterWithHour));
        System.out.println("dateOf: " + dateOf);
        System.out.println("dateTimeOf: " + dateTimeOf);

        System.out.println("Formatter: " + localDateWithoutTimezone.format(formatter1));

        // Para instant
        System.out.println("Formatter with timezone: " + formatter2.format(instant));

        System.out.println("ISO formatter: " + formatter3.format(dateTimeOf));


        // Conversao de global para local
        System.out.println(ZoneId.getAvailableZoneIds());
        LocalDate instantTolocalDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        LocalDate instantTolocalDateOtherLocal = LocalDate.ofInstant(instant, ZoneId.of("Asia/Shanghai"));

        System.out.println("global para local: " + instantTolocalDate);
        System.out.println("global para local outra localidade: " + instantTolocalDateOtherLocal);

        System.out.println("dia da semana: " + localDateWithoutTimezone.getDayOfWeek());
        System.out.println("dia do mes: " + localDateWithoutTimezone.getDayOfMonth());
        System.out.println("dia do ano: " + localDateWithoutTimezone.getDayOfYear());
        System.out.println("mes do ano: " + localDateWithoutTimezone.getMonth());
        System.out.println("ano: " + localDateWithoutTimezone.getYear());

        System.out.println("Minutos: " + dateTimeWithTimezone.getMinute());
        System.out.println("Horas: " + dateTimeWithTimezone.getHour());


        // calculos com data



    }

}

