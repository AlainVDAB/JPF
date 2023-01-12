package be.vdab.jpfhfdst8.oef;

public class Getal {
    private int x;
    public Getal(int a){
        x=a;

    }
    public void print(){
        System.out.println("x :" + x);

    }
    public int absoluut(){
        return Math.abs(x);
    }
    public int som(int a){
        return x=x+a;
    }

    public void add(int a){
        x=x+a;
    }


}
