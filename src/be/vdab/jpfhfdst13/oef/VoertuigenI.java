package be.vdab.jpfhfdst13.oef;

import be.vdab.jpfhfdst10.oef.*;

public class VoertuigenI {
    public static void main(String[] args) {
        var vervuilers = new Vervuiler[4];
        vervuilers[0]= new Personenwagen("Alain",8888.9f,40,4.3f,"3-mlo-458",5,4);
        vervuilers[1]= new Vrachtwagen("Eddy",12000.9f,120,18.3f,"2-lio-754",9523);
        vervuilers[2]= new Stookketel(2.5f);
        vervuilers[3]= new Stookketel(5.1f);

        System.out.println("Vervuiling:");

        for (var vervuiler : vervuilers){
            System.out.println(vervuiler.berekenVervuiling());

                   }
var privateGegevens = new Privaat[2];
        privateGegevens[0]= new Personenwagen("Alain",8888.9f,40,4.3f,"3-mlo-458",5,4);
        privateGegevens[1]= new Vrachtwagen("Eddy",12000.9f,120,18.3f,"2-lio-754",9523);

        System.out.println("\nPrivate data:");
        for (var privaatGegeven : privateGegevens){
            privaatGegeven.geefPrivateData();
        }


        var milieuGegevens = new Milieu[2];
        milieuGegevens[0]= new Personenwagen("Alain",8888.9f,40,4.3f,"3-mlo-458",5,4);
        milieuGegevens[1]= new Vrachtwagen("Eddy",12000.9f,120,18.3f,"2-lio-754",9523);


        System.out.println("\nMilieu data:");
        for (var milieuGegeven : milieuGegevens){
            milieuGegeven.geefMilieuData();
        }


    }
}
