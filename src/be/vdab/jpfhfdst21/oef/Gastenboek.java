package be.vdab.jpfhfdst21.oef;

import java.io.Serializable;
import java.util.*;

public class Gastenboek implements Serializable {
    private final List<GastenboekEntry> gastenboek=new ArrayList<>();

    public Gastenboek (){

    }

    public void schrijven(){
        var scanner = new Scanner(System.in);
        System.out.println("Wat is jouw naam?");
        var auteur = scanner.next();
        System.out.println("Schrijf een boodschap?");
        var boodschap = scanner.next();
        gastenboek.add(new GastenboekEntry(auteur,boodschap));

   };

    public List<GastenboekEntry> getGastenboek() {
        return gastenboek;
    }
}
