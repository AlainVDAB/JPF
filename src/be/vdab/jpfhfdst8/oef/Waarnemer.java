package be.vdab.jpfhfdst8.oef;


public class Waarnemer {
    private int minimum = Integer.MAX_VALUE;
    private int maximum = Integer.MIN_VALUE;
    private int aantalWaarnemingen;

    private double somWaarnemingen;

    public int getMinimum() {
        return aantalWaarnemingen > 0 ? minimum : 0;
    }

    public int getMaximum() {
        return aantalWaarnemingen>0 ? maximum : 0;
    }

    public int getAantalWaarnemingen() {
        return aantalWaarnemingen;
    }

    public double getGemiddelde() {
        return aantalWaarnemingen>0 ? somWaarnemingen / aantalWaarnemingen : 0;
    }

    public void registreer(int temp) {
        if (temp < minimum) {
            minimum = temp;
        }
        ;
        if (temp > maximum) {
            maximum = temp;
        }
        ;
        aantalWaarnemingen++;
        somWaarnemingen += temp;


    }

}

