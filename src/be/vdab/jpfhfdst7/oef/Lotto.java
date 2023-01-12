package be.vdab.jpfhfdst7.oef;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {

        var ballen= new int[6];
        ballen[0]=(int)(Math.random()*42)+1;
        for (var i=1;i<ballen.length;i++){
            //var uniek = true;
            var randomBal = (int)(Math.random()*42)+1;
            for (var j=0;j<i;j++){
                if(ballen[j]==randomBal){
                    randomBal = (int)(Math.random()*42)+1;
                    j=-1;
                }
             ballen[i]=randomBal;     
                
            }

        }
        Arrays.sort(ballen);
        for (var j:ballen
        ) {System.out.println(j);

        }
        var randomBal = (int)(Math.random()*42)+1;
        for (var j=0;j<6;j++){
            if(ballen[j]==randomBal){
                randomBal = (int)(Math.random()*42)+1;
                j=-1;
            }}
            System.out.println("\nreservecijfer: "+randomBal);







        //eindeFunctie
    }
}
