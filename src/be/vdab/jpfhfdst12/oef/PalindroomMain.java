package be.vdab.jpfhfdst12.oef;

public class PalindroomMain {
    public static void main(String[] args) {
        var woord = new Palindroom("Lepelblad");
        System.out.println(woord.getOpgave() + " is " +woord.resultaat());
    }
}
