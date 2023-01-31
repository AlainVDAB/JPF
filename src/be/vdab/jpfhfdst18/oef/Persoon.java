package be.vdab.jpfhfdst18.oef;

public class Persoon {
    private String voornaam;
    private String familienaam;
    private Geslacht geslacht;
    public Persoon (String voornaam, String familienaam, Geslacht geslacht){
        this.voornaam=voornaam;
        this.familienaam= familienaam;
        this.geslacht=geslacht;
    }
    @Override
    public String toString(){return voornaam+ "; " +familienaam+ "; " +geslacht;}

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }
}
