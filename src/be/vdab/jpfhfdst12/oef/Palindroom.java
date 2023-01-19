package be.vdab.jpfhfdst12.oef;

public class Palindroom {
    private String opgave;
    private StringBuilder woord;
    private StringBuilder droow;


    public Palindroom(String woord) {
        setWoord(woord);
        setDroow(woord);


    }

    public void setWoord(String woord) {
        this.woord = new StringBuilder(woord.toLowerCase());
        opgave=woord;
    }

    public void setDroow(String woord) {
        this.droow = new StringBuilder(woord.toLowerCase()).reverse();
    }

    public String getOpgave() {
        return opgave;
    }


    public StringBuilder getWoord() {
        return woord;
    }

    public StringBuilder getDroow() {
        return droow;
    }

    public String resultaat() {
        //System.out.println(woord.reverse());
        return woord.toString().equals(droow.toString()) ? " een palindroom" : "geen palindroom";

    }


    @Override
    public String toString() {
        return opgave;
    }
}
