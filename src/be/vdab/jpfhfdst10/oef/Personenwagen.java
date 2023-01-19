package be.vdab.jpfhfdst10.oef;

public class Personenwagen  extends Voertuig implements Vervuiler {
    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;
    public Personenwagen(){};
    public Personenwagen(int ad, int ap){
        this(null,0.0f,0,0.0f,null,ad,ap);

    }

    public Personenwagen(String ph, float kp, int pk, float gv, String np, int ad, int ap){
        super(ph,kp,pk,gv,np);
        setAd(ad);
        setAp(ap);

    }
    public void setAd(int ad) {
        if(ad>=0){
            aantalDeuren = ad;}
    }
    public void setAp(int ap) {
        if(ap>=0){
            aantalPassagiers = ap;}
    }

    @Override
    public String toString(){
        return super.toString() + "; " + aantalDeuren + "; " + aantalPassagiers;
    }

    @Override
    public void toon(){
        super.toon();
        System.out.println("Aantal deuren: " +aantalDeuren);
        System.out.println("Aantal passagiers: " +aantalPassagiers);
    }@Override
    public double getKyotoScore(){
     return aantalPassagiers>0? getGemVerbruik()*getPk()/aantalPassagiers : 0;
    };

    @Override
    public double berekenVervuiling() {
        return getKyotoScore()*5;
    }



}
