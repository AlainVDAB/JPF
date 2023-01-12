package be.vdab.jpfhfdst7.oef;

import java.util.Arrays;

public class Randomgenerator2 {
    public static void main(String[] args) {
        var getallen = new int[100];
        for (var i = 0; i < 100; i++) {
            getallen[i] = (int) (Math.random() * 1000) + 1;
        }
        /*for (var i = 1; i <= 1000; i++) {
            for (var getal : getallen) {
                if(getal==i){
                System.out.println(getal);}
            }
        }*/
        /*for (var pos = 0; pos < getallen.length - 1; pos++) {
            for (var vgl = pos + 1; vgl < getallen.length; vgl++) {
                if (getallen[pos] > getallen[vgl]) {
                    var tempGetal = getallen[pos];
                    getallen[pos] = getallen[vgl];
                    getallen[vgl] = tempGetal;

                }

            }
        }*/
        Arrays.sort(getallen);
        for (int j : getallen) {
            System.out.print(j + "\t");
        }

    }


}

