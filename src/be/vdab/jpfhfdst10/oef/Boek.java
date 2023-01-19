package be.vdab.jpfhfdst10.oef;

public abstract class Boek {
    private String titel;
    private String auteur;
    private float aankoopprijs;
    private String genre;

    public Boek(){
            };
    public Boek(String titel, String auteur,float aankoopprijs, String genre){
        setTitel(titel);
        setAuteur(auteur);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);

    }

    public void setTitel(String titel) {
        this.titel = titel.equals(null)?"niet beschikbaar":titel;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur.equals(null)?"niet beschikbaar":auteur;
    }

    public void setAankoopprijs(float aankoopprijs) {
        this.aankoopprijs = aankoopprijs<0?0:aankoopprijs;
    }

    public void setGenre(String genre) {
        this.genre = genre.equals(null)?"niet beschikbaar":genre;
    }
    public void tonen(){
        System.out.println("Titel: " + titel);
        System.out.println("Auteur: " + auteur);
        System.out.println("Aankoopprijs: " + aankoopprijs);
        System.out.println("Genre: " + genre);
    }
}
