import java.util.ArrayList;

public abstract class Portate {
    private String nomePortata;
    private Double prezzo;
    private ArrayList<String> ingredienti;


    public Portate(String nomePortata, Double prezzo) {
        this.nomePortata = nomePortata;
        this.prezzo = prezzo;
        this.ingredienti = new ArrayList<>();
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

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }


    public void aggiungiIngredienti(String ingrediente){
        if(!this.ingredienti.contains(ingrediente)){
            this.ingredienti.add(ingrediente);
        } else {
            System.out.println("Ingrediente non presente");
        }
    }

    public void rimuoviIngredienti(String ingrediente){
        this.ingredienti.remove(ingrediente);
    }

    public  void stampaDettagliPortata(){
        System.out.println(Color.GIALLO + "Nome: " + getNomePortata() + Color.RESET);
        System.out.println(Color.ROSSO + "Prezzo: " + getPrezzo() + " €" + Color.RESET);
        System.out.println(Color.BLU + "Ingredienti: " +    Color.RESET);
        for(String ingrediente : ingredienti){
            System.out.print(Color.BLU + ingrediente  +  Color.RESET);
        }
        System.out.println();



    }

}
