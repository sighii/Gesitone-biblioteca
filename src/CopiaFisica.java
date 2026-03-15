import java.util.ArrayList;

public class CopiaFisica {

    private ArrayList<Libro> LibriInBiblioteca;

    private String codiceInventario;
    private String statoConservazione;
    private Libro copiaLibro;
    private String ISBNlibroOriginale;

    public CopiaFisica(String codiceInventario, String statoConservazione, Libro copiaLibro, ArrayList<Libro> LibriInBiblioteca) {
        this.LibriInBiblioteca = LibriInBiblioteca;
        this.codiceInventario = codiceInventario;
        this.statoConservazione = statoConservazione;
        this.copiaLibro = copiaLibro;
        ISBNlibroOriginale = copiaLibro.getISBN();

        for(Libro libro : LibriInBiblioteca){
            if(libro.getISBN().equals(ISBNlibroOriginale)){
                libro.aumentaNumeroDiPrestiti();
            }
        }

    }


    public String getCodiceInventario() {
        return codiceInventario;
    }
    public void setCodiceInventario(String codiceInventario) {
        this.codiceInventario = codiceInventario;
    }


    public String getStatoConservazione() {
        return statoConservazione;
    }
    public void setStatoConservazione(String statoConservazione) {
        this.statoConservazione = statoConservazione;
    }


    public Libro getCopiaLibro() {
        return copiaLibro;
    }
    public void setCopiaLibro(Libro copiaLibro) {
        this.copiaLibro = copiaLibro;
    }
}