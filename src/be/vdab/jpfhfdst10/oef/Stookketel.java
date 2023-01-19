package be.vdab.jpfhfdst10.oef;

public class Stookketel implements Vervuiler {
    private float CONorm;

    public Stookketel(float norm) {
        CONorm = norm;
    }


    @Override
    public double berekenVervuiling() {
        return CONorm*100;
    }
}
