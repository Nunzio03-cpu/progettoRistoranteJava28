public class Portate {
    private String nomePortata;
    private Double prezzo;
    private String[] ingredienti;


    public Portate(String nomePortata, Double prezzo, String[] ingredienti) {
        this.nomePortata = nomePortata;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
    }

    public String getNomePortata() {
        return nomePortata;
    }

    public void setNomePortata(String nomePortata) {
        this.nomePortata = nomePortata;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String[] getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String[] ingredienti) {
        this.ingredienti = ingredienti;
    }



}
