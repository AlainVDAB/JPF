package be.vdab.jpfhfdst12.oef;

public class Rekenaar2 {
    private String opgave;

    public Rekenaar2(String opgave) {
        setOpgave(opgave);

    }

    ;

    public void setOpgave(String opgave) {
        this.opgave = opgave;
    }

    public String getOpgave() {
        return opgave;
    }

    public int uitkomst() {
        var stukjes = this.getOpgave().split(" ");
        var teken = "+";
        var resultaat = 0;
        for (var i = 0; i < stukjes.length; i = i + 2) {
            if (i > 0) {
                teken = stukjes[i - 1];
            }
            switch (teken) {
                case "+" -> resultaat += Integer.parseInt(stukjes[i]);
                case "-" -> resultaat -= Integer.parseInt(stukjes[i]);
                case "*" -> resultaat *= Integer.parseInt(stukjes[i]);
                case "/" -> resultaat /= Integer.parseInt(stukjes[i]);

            }

        }
        return resultaat;
    }
}

