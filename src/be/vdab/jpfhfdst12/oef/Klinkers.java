package be.vdab.jpfhfdst12.oef;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("\nTyp een zin");
        var zin = scanner.nextLine();
        var werkzin = zin.toLowerCase();

        var klinkers = "aeiou";
        var aantalKlinkers = 0;

        for(var i = 0 ; i < klinkers.length();i++){
            //System.out.println(String.valueOf(klinkers.charAt(i)));
            werkzin=werkzin.replaceAll(String.valueOf(klinkers.charAt(i)),"");
        }
        //System.out.println(zin);
        //System.out.println(werkzin);
        var lengte = zin.length()-werkzin.length();
        System.out.print("Er zijn " + lengte + " klinkers in de zin.");


    }
}
