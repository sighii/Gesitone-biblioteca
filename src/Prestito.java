public class Prestito {

    private String dataDiInizio;
    private String dataDiScadenza;
    private String dataDiRestituzione;

    public Prestito(String dataDiInizio, String dataDiScadenza, String dataDiRestituzione) {
        this.dataDiInizio = dataDiInizio;
        this.dataDiScadenza = dataDiScadenza;
        this.dataDiRestituzione = dataDiRestituzione;
    }

    public String getDataDiInizio() {
        return dataDiInizio;
    }
    public void setDataDiInizio(String dataDiInizio) {
        this.dataDiInizio = dataDiInizio;
    }


    public String getDataDiScadenza() {
        return dataDiScadenza;
    }
    public void setDataDiScadenza(String dataDiScadenza) {
        this.dataDiScadenza = dataDiScadenza;
    }


    public String getDataDiRestituzione() {
        return dataDiRestituzione;
    }
    public void setDataDiRestituzione(String dataDiRestituzione) {
        this.dataDiRestituzione = dataDiRestituzione;
    }

}