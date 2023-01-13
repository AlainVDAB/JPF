package be.vdab.jpfhfdst8.oef;

import java.util.Scanner;

public class WaarnemerMain {
    public static void main(String[] args) {
        var temperatuur= new Waarnemer();
        var scanner = new Scanner(System.in) ;
        System.out.println("Geef een temperatuur in. Typ 999 om te stoppen");
        var waarde= scanner.nextInt();
        while(waarde != 999){
            temperatuur.registreer(waarde);
            System.out.println("Geef een temperatuur in");
            waarde= scanner.nextInt();
        }
        System.out.println("Er waren "+temperatuur.getAantalWaarnemingen()+" waarnemingen");
        System.out.println("De minimumtemperatuur bedroeg "+ temperatuur.getMinimum()+ "°C");
        System.out.println("De maximumtemperatuur bedroeg "+ temperatuur.getMaximum()+ "°C");
        System.out.println("De gemiddelde temperatuur bedroeg "+ temperatuur.getGemiddelde()+ "°C");


    }

}
