import java.util.ArrayList;

public class Portate {
    private String nomePortata;
    private Double prezzo;
    private final String ingredienti; // tutti gli ingredienti in una sola stringa



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
        //Il metodo System.out.printf() in Java è utilizzato per formattare e stampare stringhe seguendo specifici modificatori di formato
        //"%-n.s %s" --> %: Indica che è un segnaposto,
        // -n.s partendo da sinistra verso destra indica lo spazio(in caratteri) da occupare vuoto
        //n. indica il numero da inserire
        // % aggiunta di un'altro segnaposto + s cioe indica una stringa
        System.out.printf("%-170s %s",ColorEnum.GIALLO.getCodiceColore() + "- " + getNomePortata() + ColorEnum.RESET.getCodiceColore(),
                ColorEnum.ROSSO.getCodiceColore() + " Prezzo: "  + getPrezzo() +  " €" + ColorEnum.RESET.getCodiceColore());

        System.out.println();
//        System.out.print( ColorEnum.GIALLO.getCodiceColore() + "Nome: " + getNomePortata() + ColorEnum.RESET.getCodiceColore());
//        System.out.println(ColorEnum.ROSSO.getCodiceColore() +   " Prezzo: "  + getPrezzo() + " €" + ColorEnum.RESET.getCodiceColore());
        System.out.println(ColorEnum.BLU.getCodiceColore() + "(Ingredienti: " +  String.join(", ", ingredienti) + ")"  +  ColorEnum.RESET.getCodiceColore());


    }


}
