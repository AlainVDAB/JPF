package be.vdab.jpfhfdst6.oef;

public class Array5integers {
    public static void main(String[] args) {
        int [] vijfIntegers = new int[5];
        var totaal = 0;
        System.out.println("De waarden van de array zijn:");
        for (var i = 0; i<5;i++) {
            vijfIntegers[i] = (int) (Math.random() * 100) +1;
            System.out.println(vijfIntegers[i]);
            totaal +=  vijfIntegers[i];
        }
        float gemiddelde = (float) totaal/vijfIntegers.length;
        System.out.println("");
        System.out.println("De som van de getallen is: " + totaal);
        System.out.println("Het gemiddelde is: " + gemiddelde);



    }

}
