package be.vdab.voorwerpen;

import be.vdab.util.Isbn13Exception;

public abstract class Boek {
    private String titel = "niet beschikbaar";
    private String auteur = "niet beschikbaar";
    private float aankoopprijs = 0.0f;
    private String genre = "niet beschikbaar";
    private String isbn13 = "niet beschikbaar";

    public Boek() {

    }

    ;

    public Boek(String titel, String auteur, float aankoopprijs, String genre, String isbn13) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);
        setIsbn13(isbn13);

    }

    public void setTitel(String titel) {
        this.titel = titel == null ? "niet beschikbaar" : titel;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur == null ? "niet beschikbaar" : auteur;
    }

    public void setAankoopprijs(float aankoopprijs) {
        this.aankoopprijs = aankoopprijs < 0 ? 0 : aankoopprijs;
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public void setGenre(String genre) {
        this.genre = genre == null ? "niet beschikbaar" : genre;
    }

    public void setIsbn13(String isbn13) {
        if(checkIsbn(isbn13)){
            this.isbn13=isbn13;
        } else {
            throw new Isbn13Exception("Het isbn-nummer is niet correct");
        }
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void tonen() {
        System.out.println("\n---Gegevens---");
        System.out.println("Titel: " + titel);
        System.out.println("Auteur: " + auteur);
        System.out.println("Aankoopprijs: " + aankoopprijs);
        System.out.println("Genre: " + genre);
        System.out.println("Isbn: " + isbn13);
    }

    @Override
    public String toString() {
        return "Titel: " + titel + "; Auteur: " + auteur + "; Aankoopprijs: " + aankoopprijs + "; Genre: " + genre + "; Isbn: " + isbn13;
    }

    public boolean checkIsbn(String isbn) {
        isbn = isbn.replaceAll("-", "");
        if (isbn.length() != 13) {
            return false;
        } else {
            try{
            var totaal = 0;

            for (var i = 0; i < isbn.length() - 1; i++) {
                var cijfer = Integer.parseInt(isbn.substring(i, i + 1));

                var eenOfDrie = i % 2 * 2 + 1;
                totaal += cijfer * eenOfDrie;
            }

            return Integer.parseInt(isbn.substring(12)) == (totaal % 10 == 0 ? 1 : 10 - totaal % 10);}
            catch (NumberFormatException ex){return false;}


        }

    }
}

