package be.vdab.winkel;

import be.vdab.jpfhfdst21.oef.Gastenboek;

import java.util.Scanner;

public class GastenboekMain {
    public static void main(String[] args) {
        var opdracht = "";
        var scanner = new Scanner(System.in);
        var gastenboek = new Gastenboek();

        while (!opdracht.equals("E")) {
            System.out.println("Typ een gastenboek opdracht in (T= tonen, S=Schrijven, E=eindigen)");
            opdracht = scanner.next();
            switch (opdracht) {
                case "T" -> System.out.println("tonen");
                case "S" -> gastenboek.schrijven();
                case "E" -> System.out.println("Het programma werd beëindigd");
                default -> System.out.println("De opdracht werd niet herkent. Typ T, S of E.");
            }
          }
System.out.println(gastenboek.getGastenboek());
    }
}
