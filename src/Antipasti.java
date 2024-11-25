public class Antipasti extends Portate {
    //Fields della classe
    private String KmZero;

    //Costruttore con super
    public Antipasti(String KmZero, String nomePortata, Double prezzo, String ingredienti) {
        super(nomePortata, prezzo, ingredienti);
        this.KmZero = KmZero;
    }

    public String getKmZero() {
        return KmZero;
    }

    public void setKmZero(String kmZero) {
        KmZero = kmZero;
    }

    // Stampa i dettagli della portata, evidenziando se il prodotto è fresco
    @Override
    public void stampaDettagliPortata() {
        super.stampaDettagliPortata();
        System.out.println(ColorEnum.VERDE.getCodiceColore() + "Prodotto KmZero: " + getKmZero() + ColorEnum.RESET.getCodiceColore());
        System.out.println();
    }
}
