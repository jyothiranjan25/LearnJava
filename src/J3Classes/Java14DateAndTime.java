package J3Classes;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Java14DateAndTime {
    // Java 8 introduced the java.time package, which is part of the new date and time API.
    // The java.time package contains Java 8 Date and Time classes.
    // The java.time package has been introduced to fix the shortcomings of the earlier java.util.Date and java.util.Calendar classes.
    // The java.time package contains many classes. Some of the most important ones are:
    // LocalDate
    // LocalTime
    // LocalDateTime
    // ZonedDateTime
    // Instant
    // Duration
    // Period
    // The java.time classes are immutable and thread-safe.
    // The java.time classes provide methods to format and parse date and time.
    // The java.time classes are based on the ISO calendar system.

    public static void main(String[] args) {
        // LocalDate
        // The LocalDate class represents a date (year, month, day).
        LocalDate localDate = LocalDate.now(); // Create a date object
        System.out.println("LocalDate : " +localDate); // Display the current date

        // LocalTime
        // The LocalTime class represents a time (hour, minute, second, nanosecond).
         LocalTime localTime = LocalTime.now(); // Create a time object
        System.out.println("LocalTime : " +localTime); // Display the current time

        // LocalDateTime
        // The LocalDateTime class represents a date-time (year, month, day, hour, minute, second, nanosecond).
        LocalDateTime localDateTime = LocalDateTime.now(); // Create a date-time object
        System.out.println("LocalDateTime : " +localDateTime); // Display the current date-time

        // ZonedDateTime
        // The ZonedDateTime class represents a date-time with a time-zone in the ISO-8601 calendar system.
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // Create a date-time object
        System.out.println("ZonedDateTime : " +zonedDateTime); // Display the current date-time with time-zone

        // Instant
        // The Instant class represents a specific moment in time in the GMT time zone.
        Instant instant = Instant.now(); // Create an instant object
        System.out.println("Instant : " +instant); // Display the current instant

        // Duration
        // The Duration class represents a time span.
        Duration duration = Duration.ofDays(30); // Create a duration object
        System.out.println("Duration : " +duration); // Display the duration

        // Period
        // The Period class represents a date span.
        Period period = Period.ofMonths(6); // Create a period object
        System.out.println("Period : " +period); // Display the period

        // Display the current date
        System.out.println("Year : " +localDate.getYear());
        System.out.println("Month : " +localDate.getMonth());
        System.out.println("Day : " +localDate.getDayOfMonth());
        System.out.println("Day of Week : " +localDate.getDayOfWeek());
        System.out.println("Day of Year : " +localDate.getDayOfYear());
        System.out.println("Month Value : " +localDate.getMonthValue());

        // Display the current time
        System.out.println("Hour : " +localTime.getHour());
        System.out.println("Minute : " +localTime.getMinute());
        System.out.println("Second : " +localTime.getSecond());
        System.out.println("Nano : " +localTime.getNano());


        // Formatting Date and Time
        // The DateTimeFormatter class is used to format and parse date and time.
        // The ofPattern() method is used to specify the pattern of the date and time.
        // The format() method is used to format the date and time.
        // The parse() method is used to parse the date and time.

        // Create a date-time object
        LocalDateTime beforeFormatting = LocalDateTime.now();
        System.out.println("Before formatting: " + beforeFormatting); // Display the current date-time

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // Create a formatter object

        // The format() method is used to format the date and time.
        String formattedDateTime1 = beforeFormatting.format(formatter); // Format the date-time
        System.out.println("After formatting: " + formattedDateTime1); // Display the formatted date-time

        // The parse() method is used to parse the date and time.
        LocalDateTime afterFormatting = LocalDateTime.parse(formattedDateTime1, formatter); // Parse the formatted date-time
        System.out.println("After parsing: " + afterFormatting); // Display the parsed date-time
    }
}
