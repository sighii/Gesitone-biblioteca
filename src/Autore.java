import java.util.ArrayList;

public class Autore {

    private String nome;
    private String cognome;
    private String nazionalita;
    private ArrayList<Libro> libriScritti;

    public Autore(String nome, String cognome, String nazionalita, ArrayList<Libro> libriScritti){
        this.nome = nome;
        this.cognome = cognome;
        this.nazionalita = nazionalita;
        this.libriScritti = libriScritti;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    public String getNazionalita() {
        return nazionalita;
    }
    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public ArrayList<Libro> getLibriScritti() {
        return libriScritti;
    }
    public void setLibriScritti(ArrayList<Libro> libriScritti) {
        this.libriScritti = libriScritti;
    }

}