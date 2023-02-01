package be.vdab.jpfhfdst19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        var formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        var datumAlsString = "19/04/1983";
        var datum = LocalDate.parse(datumAlsString, formatter);
        System.out.println(datum);

    }
}
