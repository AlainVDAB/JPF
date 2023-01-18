package be.vdab.jpfhfdst10.oef;

public abstract class Voertuig {
    private String polishouder;
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat;

    public Voertuig(){};
    public Voertuig(String ph, float kp, int pk, float gv, String np){
        setPolishouder(ph);
        setKostprijs(kp);
        setPk(pk);
        setGemVerbruik(gv);
        setNummerplaat(np);

    };

    public void setPolishouder(String polishouder) {
        if (checkTekst(polishouder)) {
            this.polishouder = polishouder;
        }
    }

    public void setKostprijs(float kostprijs) {
        if (checkGetal(kostprijs)){
            this.kostprijs = kostprijs;
        }
    }

    public void setPk(int pk) {
        if(checkGetal(pk)) {
            this.pk = pk;
        }
    }

    public void setGemVerbruik(float gemVerbruik) {
        if(checkGetal(gemVerbruik)){
        this.gemVerbruik = gemVerbruik;}
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public int getPk() {
        return pk;
    }

    public void setNummerplaat(String nummerplaat) {
        if(checkTekst(nummerplaat)){
        this.nummerplaat = nummerplaat;}
    }

    private boolean checkGetal(double getal) {
        return getal > 0.0;
    }

    private boolean checkTekst(String tekst) {
        return tekst != null && !tekst.isEmpty() ;
    }

    @Override
    public String toString(){
        return polishouder + "; " + kostprijs + "; " + pk + "; " + gemVerbruik + "; " + nummerplaat;
    }

    public void toon(){
        System.out.println("Polishouder: "+polishouder);
        System.out.println("Kostprijs: "+kostprijs);
        System.out.println("Pk: "+pk);
        System.out.println("Gemiddeld verbruik: "+gemVerbruik);
        System.out.println("Nummerplaat: "+nummerplaat);

    }

    public abstract double getKyotoScore();
}
