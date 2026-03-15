import java.util.ArrayList;

public class Libro {

    private String ISBN;
    private String titolo;
    private String autore;
    private String editore;
    private ArrayList<Autore> Autori;
    private int numeroDiPrestiti = 0;

    public Libro(String ISBN, String titolo, String autore, String editore, ArrayList<Autore> Autori) {
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
        this.Autori = Autori;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }


    public String getEditore() {
        return editore;
    }
    public void setEditore(String editore) {
        this.editore = editore;
    }


    public ArrayList<Autore> getAutori() {
        return Autori;
    }
    public void setAutori(ArrayList<Autore> Autori) {
        this.Autori = Autori;
    }


    public int getNumeroDiPrestiti() {
        return numeroDiPrestiti;
    }
    public void setNumeroDiPrestiti(int numeroDiPrestiti) {
        this.numeroDiPrestiti = numeroDiPrestiti;
    }

    public void aumentaNumeroDiPrestiti(){
        this.numeroDiPrestiti++;
    }

}