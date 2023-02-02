package be.vdab.jpfhfdst20.oef;

import java.util.Objects;

public class Tienkamper implements Comparable<Tienkamper> {
    private String naam ="";
    private int punten;

    public Tienkamper(String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }

    public void setNaam(String naam) {
        if (naam!=null){
        this.naam = naam;}
    }

    public void setPunten(int punten) {
        if (punten >= 0){
        this.punten = punten;}
    }

    public String getNaam() {
        return naam;
    }

    public int getPunten() {
        return punten;
    }

    @Override
    public String toString() {
        return  "naam=" + naam + "; punten=" + punten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tienkamper that)) return false;
        return getNaam().equals(that.getNaam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNaam());
    }

    @Override
    public int compareTo(Tienkamper a){
        return naam.compareTo(a.getNaam());
    }
}
