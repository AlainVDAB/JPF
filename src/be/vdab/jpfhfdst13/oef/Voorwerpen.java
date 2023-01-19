package be.vdab.jpfhfdst13.oef;

public class Voorwerpen {
    public static void main(String[] args) {
        var voorwerpen = new Voorwerp[2];
        voorwerpen[0] = new Boekenrek();
        voorwerpen[1] = new Boekenrek(150, 100, 125.6f);

        var totaal =0.0f;

        for (var voorwerp : voorwerpen) {
            voorwerp.gegevensTonen();
            totaal+=voorwerp.winstBerekenen();

        }
System.out.println("\nDe totale winst bedraagt €" + totaal);
    }
}
