package be.vdab.main;

import be.vdab.util.Isbn13Exception;
import be.vdab.voorwerpen.Leesboek;

public class BoekMain {
    public static void main(String[] args) {
        try {
            var test = new Leesboek("Expect the exception", "Alain", 52.35f, "non fictie", "978-0-306-40615-7", "It");
        //System.out.println("test");
        }
        catch (Isbn13Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
