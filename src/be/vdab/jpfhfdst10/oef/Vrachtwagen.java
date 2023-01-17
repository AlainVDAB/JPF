package be.vdab.jpfhfdst10.oef;

public class Vrachtwagen extends Voertuig {
    private float maxLading = 10_000;

    public Vrachtwagen() {
    }

    ;

    public Vrachtwagen(float ml) {
        this(null, 0.0f, 0, 0.0f, null, ml);

    }

    public Vrachtwagen(String ph, float kp, int pk, float gv, String np, float ml) {
        super(ph, kp, pk, gv, np);
        setMaxLading(ml);

    }

    public void setMaxLading(float maxLading) {
        if (maxLading >= 0) {
            this.maxLading = maxLading;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; " + maxLading;
    }

    @Override
    public void toon() {
        super.toon();
        System.out.println("Maximum lading: " + maxLading);

    }

    @Override
    public double getKyotoScore() {
        return maxLading > 0 ? getGemVerbruik() * getPk()*1000 / maxLading : 0;
    }

    ;
}
