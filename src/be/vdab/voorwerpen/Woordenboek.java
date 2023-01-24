package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

public class Woordenboek extends Boek implements Voorwerp {
    private String taal = "niet beschikbaar";
    private final float winstmarge = 1.5f;

    public Woordenboek(){}

    public Woordenboek(String taal) {
        this("niet beschikbaar", "niet beschikbaar", 0.0f, "niet beschikbaar", taal);

    }

    public Woordenboek(String titel, String auteur, float aankoopprijs, String genre, String taal) {
        super(titel, auteur, aankoopprijs, genre);
        setTaal(taal);

    }

    public void setTaal(String taal) {
        this.taal = taal==null ? "niet beschikbaar" : taal;
    }

    public String getTaal() {
        return taal;
    }

    @Override
    public float winstBerekenen() {
        return winstmarge * getAankoopprijs();

    }

    @Override
    public void gegevensTonen() {

        super.tonen();
        System.out.println("Taal: " + taal);
        System.out.println("winstmarge: " + winstmarge);
        System.out.println("winst: " + winstBerekenen());
        System.out.println("Eigenaar: " + EIGENAAR);
    }

    @Override
    public String toString(){
        return "Eigenaar: " + EIGENAAR + " ;" +super.toString() + " ;Winstmarge: " + winstmarge;
    }

}
