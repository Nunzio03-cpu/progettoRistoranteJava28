import java.util.ArrayList;

public abstract class Portate {
    private String nomePortata;
    private Double prezzo;
    private String ingredienti; // tutti gli ingredienti in una sola stringa



    public Portate(String nomePortata, Double prezzo, String ingredienti) {
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

    public String getIngredienti() {
        return ingredienti;
    }


    public  void stampaDettagliPortata(){
        System.out.print(ColorEnum.GIALLO.getCodiceColore() + "Nome: " + getNomePortata() + ColorEnum.RESET.getCodiceColore());
        System.out.println(ColorEnum.ROSSO.getCodiceColore() + " Prezzo: " + getPrezzo() + " €" + ColorEnum.RESET.getCodiceColore());
        System.out.println(ColorEnum.BLU.getCodiceColore() + "Ingredienti: " +  String.join(", ", ingredienti)  +  ColorEnum.RESET.getCodiceColore());


    }


}
