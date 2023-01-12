package be.vdab.jpfhfdst7.oef;

import java.util.Scanner;

public class Huisdieren {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Hoeveel huisdieren heb je?");
        var aantal = scanner.next();
        System.out.println(aantal);

        while (aantal != "stop") {
            switch (aantal) {
                case "0" -> System.out.println("je hebt geen huisdieren");
                case "1" -> System.out.println("je hebt 1 huisdier");
                case "2", "3" -> System.out.println("je hebt " + aantal + " huisdieren");
                default -> System.out.println("je hebt huisdieren");
            }

            System.out.println("Hoeveel huisdieren heb je?");
            aantal = scanner.next();

        }

        //eindeFunctie
    }
}
