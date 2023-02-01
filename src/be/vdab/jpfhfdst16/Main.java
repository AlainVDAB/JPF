package be.vdab.jpfhfdst16;

public class Main {
    public static void main(String[] args) {
        try {
            var tekst = "abc";
            var tekstInGetalwaarde = Integer.parseInt(tekst);
            var result = tekstInGetalwaarde / 4;
            System.out.println(result);
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
