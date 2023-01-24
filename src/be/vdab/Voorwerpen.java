package be.vdab;

import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

public class Voorwerpen {
    public static void main(String[] args) {
        var voorwerpen = new Voorwerp[6];
        voorwerpen[0] = new Boekenrek();
        voorwerpen[1] = new Boekenrek(150, 100, 125.6f);
        voorwerpen[2]= new Leesboek();
        voorwerpen[3]=new Leesboek("This s*cks","Hilithan",52.11f,"Horror","It theorie");
        voorwerpen[4]= new Woordenboek();
        voorwerpen[5]= new Woordenboek("C zeer sharp","Robin", 11.11f, "woordenboek", "C++");

        var totaal =0.0f;

        for (var voorwerp : voorwerpen) {
            voorwerp.gegevensTonen();
            totaal+=voorwerp.winstBerekenen();

        }
System.out.println("\nDe totale winst bedraagt €" + totaal);
    }
}
