package be.vdab.jpfhfdst20.oef;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Land {
    private String landCode;
    private String landNaam;
    private String hoofdstad;

    private BigInteger aantalInwoners;
    private BigDecimal oppervlakte;

    Land(String landCode, String landNaam, String hoofdstad, BigInteger aantalInwoners, BigDecimal oppervlakte){
        this.landCode=landCode;
        this.landNaam= landNaam;
        this.hoofdstad= hoofdstad;
        this.aantalInwoners= aantalInwoners;
        this.oppervlakte=oppervlakte;
    }

    public boolean checkLand(){
        var test= true;
        if(landCode==null || landNaam==null|| hoofdstad==null||aantalInwoners.compareTo(BigInteger.ZERO)<=0||oppervlakte.compareTo(BigDecimal.ZERO)<=0){
        test=false;
        }
        return test;


}}
