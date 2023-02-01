package be.vdab.jpfhfdst12.oef;

import java.util.Scanner;

public class Rekenaar2Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Geef een berekening in");
        var input = scanner.nextLine();
        //var input = "17 + 38 * 2 - 22";
        var berekening = new Rekenaar2(input);
System.out.println(berekening.uitkomst());
    }
}
