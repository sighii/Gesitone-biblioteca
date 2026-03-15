import java.util.ArrayList;

public class Biblioteca {

    private String nomeBiblioteca;
    private String citta;
    private ArrayList<Autore> AutoriDiLibriInBiblioteca;
    private ArrayList<Libro> LibriInBiblioteca;
    private ArrayList<CopiaFisica> CopieInBiblioteca;
    private ArrayList<Socio> SociIscritti;

    public Biblioteca(String nomeBiblioteca, String citta, ArrayList<Autore> autoriDiLibriInBiblioteca, ArrayList<Libro> libriInBiblioteca, ArrayList<CopiaFisica> copieInBiblioteca, ArrayList<Socio> sociIscritti) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.citta = citta;
        this.AutoriDiLibriInBiblioteca = autoriDiLibriInBiblioteca;
        this.LibriInBiblioteca = libriInBiblioteca;
        this.CopieInBiblioteca = copieInBiblioteca;
        this.SociIscritti = sociIscritti;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }
    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }


    public String getCitta() {
        return citta;
    }
    public void setCitta(String citta) {
        this.citta = citta;
    }


    public ArrayList<Autore> getAutoriDiLibriInBiblioteca() {
        return AutoriDiLibriInBiblioteca;
    }
    public void setAutoriDiLibriInBiblioteca(ArrayList<Autore> autoriDiLibriInBiblioteca) {
        AutoriDiLibriInBiblioteca = autoriDiLibriInBiblioteca;
    }


    public ArrayList<Libro> getLibriInBiblioteca() {
        return LibriInBiblioteca;
    }
    public void setLibriInBiblioteca(ArrayList<Libro> libriInBiblioteca) {
        LibriInBiblioteca = libriInBiblioteca;
    }


    public ArrayList<CopiaFisica> getCopieInBiblioteca() {
        return CopieInBiblioteca;
    }
    public void setCopieInBiblioteca(ArrayList<CopiaFisica> copieInBiblioteca) {
        CopieInBiblioteca = copieInBiblioteca;
    }


    public ArrayList<Socio> getSociIscritti() {
        return SociIscritti;
    }
    public void setSociIscritti(ArrayList<Socio> sociIscritti) {
        SociIscritti = sociIscritti;
    }


    public int numeroLibriScrittiDaAutore(Autore autore){
        for(Autore scrittore : AutoriDiLibriInBiblioteca){
            if(scrittore.getNome().equals(autore.getNome()) && scrittore.getCognome().equals(autore.getCognome())){
                return scrittore.getLibriScritti().size();
            }
        }
        return 0;
    }

    public ArrayList<Libro> listaLibriScrittiDaAutore(Autore autore){
        for(Autore scrittore : AutoriDiLibriInBiblioteca){
            if(scrittore.getNome().equals(autore.getNome()) && scrittore.getCognome().equals(autore.getCognome())){
                return scrittore.getLibriScritti();
            }
        }
        return null;
    }

    public Libro libroPiuPrestato(){
        Libro libroPiuPrestato = null;
        int numeroMassimoDiPrestiti = 0;
        for(Libro libro : LibriInBiblioteca){
            if(libro.getNumeroDiPrestiti() > numeroMassimoDiPrestiti){
                numeroMassimoDiPrestiti = libro.getNumeroDiPrestiti();
                libroPiuPrestato = libro;
            }
        }
        return libroPiuPrestato;
    }
}