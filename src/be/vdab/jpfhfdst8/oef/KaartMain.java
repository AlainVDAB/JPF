package be.vdab.jpfhfdst8.oef;

public class KaartMain {
    public static void main(String[] args) {
        var getrokkenA = new Kaart();
        System.out.println("De eerste kaart is:");
        getrokkenA.printKaart();
        var getrokkenB = new Kaart();
        System.out.println("De tweede kaart is:");
        getrokkenB.printKaart();

        System.out.println(getrokkenA.isHogerDan(getrokkenB) ? "De eerste kaart is groter dan de tweede" : "De eerste kaart is niet groter dan de tweede");
    }
}
