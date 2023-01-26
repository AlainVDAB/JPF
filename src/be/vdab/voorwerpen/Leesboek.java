package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

public class Leesboek extends Boek implements Voorwerp {
    private String onderwerp = "niet beschikbaar";
    private final float winstmarge = 1.5f;

    public Leesboek(){}

    public Leesboek(String onderwerp) {
        this("niet beschikbaar", "niet beschikbaar", 0.0f, "niet beschikbaar", "niet beschikbaar", onderwerp);

    }

    public Leesboek(String titel, String auteur, float aankoopprijs, String genre, String isbn, String onderwerp) {
        super(titel, auteur, aankoopprijs, genre, isbn);
      setOnderwerp(onderwerp);

    }

    public void setOnderwerp(String onderwerp) {
        this.onderwerp = onderwerp==null ? "niet beschikbaar" : onderwerp;
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    @Override
    public float winstBerekenen() {
        return winstmarge * getAankoopprijs();

    }

    @Override
    public void gegevensTonen() {

        super.tonen();
        System.out.println("Onderwerp: " + onderwerp);
        System.out.println("winstmarge: " + winstmarge);
        System.out.println("winst: " + winstBerekenen());
        System.out.println("Eigenaar: " + EIGENAAR);
    }

    @Override
    public String toString(){
        return "Eigenaar: " + EIGENAAR + " ;" +super.toString() + " ;Winstmarge: " + winstmarge;
    }

}
