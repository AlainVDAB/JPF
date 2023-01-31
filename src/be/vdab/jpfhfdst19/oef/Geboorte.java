package be.vdab.jpfhfdst19.oef;

import java.awt.desktop.SystemEventListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Geboorte {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var belgie = new Locale("nl","BE");
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy",belgie);
        System.out.println("Geef je geboortedatum op (dag/maand/jaar):");
        var geboorteString = scanner.next();
        var geboorte = LocalDate.parse(geboorteString, formatter);
        var heden = LocalDate.now();

        formatter = DateTimeFormatter.ofPattern("EEEE",belgie);

        System.out.println("Je bent geboren op een " + formatter.format(geboorte));
        var leeftijd = ChronoUnit.YEARS.between(geboorte, heden);
        System.out.println("Je bent " + leeftijd + " jaar oud.");




    }
}
