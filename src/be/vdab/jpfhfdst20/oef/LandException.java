package be.vdab.jpfhfdst20.oef;

public class LandException extends RuntimeException {
    public LandException(){}

    public LandException(String omschrijving){
        super(omschrijving);
    }
}
