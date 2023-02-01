package be.vdab.jpfhfdst10.oef;

import java.util.HashSet;
import java.util.Set;

public class VoertuigenC
{
    public static void main(String[] args) {
        var wagens = new HashSet <Voertuig>();

        wagens.add(new Vrachtwagen("Alain",6002.3f,101,15.6f,"2-mpr-328",5213f));
        wagens.add(new Vrachtwagen("Karen",5004.3f,120,20.2f,"1-akp-069",8697f));
        wagens.add(new Personenwagen("Tilda",123f,69,45f,"2-klm-958",5,4));
        wagens.add(new Personenwagen("Alissa",93f,45,65.2f,"1-aya-123",3,4));


    }
}
