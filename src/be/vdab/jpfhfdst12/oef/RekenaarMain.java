package be.vdab.jpfhfdst12.oef;

public class RekenaarMain {
    public static void main(String[] args) {
        var opgave = new Rekenaar("17 + 38 * 2 - 22");
        var stukjes = opgave.getOpgave().split(" ");
        var teken = "+";
        var resultaat = 0;
        //System.out.println(stukjes.length);
        for (var i = 0; i < stukjes.length; i = i + 2) {
            if (i > 0) {
                teken = stukjes[i - 1];
            }
            System.out.println(teken);
            switch (teken) {
                case "+" -> resultaat += Integer.parseInt(stukjes[i]);
                case "-" -> resultaat -= Integer.parseInt(stukjes[i]);
                case "/" -> resultaat /= Integer.parseInt(stukjes[i]);
                case "*" -> resultaat *= Integer.parseInt(stukjes[i]);


            }

            System.out.println(resultaat);


        }
    }
}

