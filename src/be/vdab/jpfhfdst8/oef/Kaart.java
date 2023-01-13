package be.vdab.jpfhfdst8.oef;

public class Kaart {

    private String[] kleur = new String[]{"harten", "ruiten", "klaveren", "schoppen"};
    private String[] rang = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer", "aas"};

    private int kleurIndex;
    private int rangIndex;



    private String kleurWaarde;
    private String rangWaarde;

    public int getKleurIndex() {
        return kleurIndex;
    }

    public int getRangIndex() {
        return rangIndex;
    }

    public Kaart() {
        kleurIndex = (int) (Math.random() * 4);
        rangIndex = (int) (Math.random() * 13);
    }

    public void printKaart(){
      System.out.println(kleur[kleurIndex]+" "+rang[rangIndex]);
    }

    public boolean isHogerDan(Kaart tweede){
        var check = false;
        if (kleurIndex > tweede.getKleurIndex()){ check= true;}
        else{if (kleurIndex == tweede.getKleurIndex() && rangIndex > tweede.getRangIndex()){check= true;}

        }
        return check;

    }


}
