package be.vdab.jpfhfdst12.oef;

public class Rekenaar {
    private String opgave;
public Rekenaar (String opgave){
    setOpgave(opgave);
}
    public void setOpgave(String opgave) {
        this.opgave = opgave;
    }

    public String getOpgave() {
        return opgave;
    }
}
