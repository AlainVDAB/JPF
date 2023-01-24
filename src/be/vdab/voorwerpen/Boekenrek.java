package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

public class Boekenrek implements Voorwerp {
    //private String eigenaar;
    private int hoogte;
    private int breedte;
    private float aankoopprijs;
    private final float winstmarge = 2.0f;

    public Boekenrek() {
    }

    ;

    public Boekenrek(int hoogte, int breedte, float aankoopprijs) {
        setHoogte(hoogte);
        setBreedte(breedte);
        setAankoopprijs(aankoopprijs);
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte >= 0 ? hoogte : 0;
    }

    public void setBreedte(int breedte) {
        this.breedte = breedte >= 0 ? breedte : 0;
    }

    public void setAankoopprijs(float aankoopprijs) {
        this.aankoopprijs = aankoopprijs >= 0 ? aankoopprijs : 0.0f;
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public float getWinstmarge() {
        return winstmarge;
    }

    public int getBreedte() {
        return breedte;
    }

    public int getHoogte() {
        return hoogte;
    }


    @Override
    public void gegevensTonen() {
        System.out.println("\n---Gegevens---");
        System.out.println("Eigenaar: " + EIGENAAR);
        System.out.println("Hoogte: " + hoogte);
        System.out.println("Breedte: " + breedte);
        System.out.println("Aankoopprijs: " + aankoopprijs);
        System.out.println("Winstmarge: " + winstmarge);
        System.out.println("Winst: " + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return aankoopprijs * winstmarge;
    }

    @Override
    public String toString(){
        return "Eigenaar: " + EIGENAAR + " ;Hoogte: " + hoogte + " ;Breedte: " + breedte + " ;Aankoopprijs: " + aankoopprijs + " ;Winstmarge: " + winstmarge;
    }
}
