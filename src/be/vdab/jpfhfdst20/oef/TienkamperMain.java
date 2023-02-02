package be.vdab.jpfhfdst20.oef;

import java.util.ArrayList;
import java.util.TreeSet;

public class TienkamperMain {
    public static void main(String[] args) {
        var atletenList = new ArrayList<Tienkamper>();
        atletenList.add(new Tienkamper("Alain",11));
        atletenList.add(new Tienkamper("Tilda",1235));
        atletenList.add(new Tienkamper("Karen",61));
        atletenList.add(new Tienkamper("Alissa",40));
        atletenList.add(new Tienkamper("Alain",69));

        System.out.println("Atleten volgens de ArrayList:");
        for (var atleet : atletenList){

            System.out.println(atleet);
        }

        var atletenSet = new TreeSet<Tienkamper>();
        atletenSet.addAll(atletenList);

        System.out.println("\nAtleten volgens de TreeSet:");
        for(var atleet:atletenSet){

            System.out.println(atleet);
        }

    }
}
