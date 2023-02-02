package be.vdab.jpfhfdst20.oef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Beginletter {
    public static void main(String[] args) {
        var woorden = new ArrayList<String>();
        var beginletters = new HashMap<Character,Integer>();
        woorden.addAll(List.of("kat","aap","paard","alain","karen","alissa","motor","xylofoon", "aardappel"));

        for (var woord : woorden){
            //System.out.println(woord.charAt(0));

            var aantal = beginletters.get(woord.charAt(0))==null? 1 :beginletters.get(woord.charAt(0))+1;
            beginletters.put(woord.charAt(0),aantal);


        }
        System.out.println("***aantal woorden per letter***");
        for(var letter : beginletters.keySet()){
            System.out.println( letter + ": "+beginletters.get(letter));
        }
        System.out.println("\n***Grote v d Hashmap***");
        System.out.println(beginletters.size());

        System.out.println("\n***Is de Hashmap leeg?***");
        System.out.println(beginletters.isEmpty());

        System.out.println("\n***alle keys***");
        System.out.println(beginletters.keySet());

        System.out.println("\n***alle values***");
        System.out.println(beginletters.values());

        System.out.println("\n***alle entries***");
        System.out.println(beginletters.entrySet());

    }
}
