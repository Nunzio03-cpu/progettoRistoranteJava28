public class Antipasti extends Portate {
    //Fields della classe
    private boolean surgelato;
    private boolean fresco;

    //Costruttore con super
    public Antipasti(boolean surgelato, boolean fresco, String nomePortata, Double prezzo, String ingredienti) {
        super(nomePortata, prezzo, ingredienti);
        this.surgelato = surgelato;
        this.fresco = fresco;
    }

    //Getter
    public boolean getSurgelato() {
        return surgelato;
    }

    //Setter
    public void setSurgelato(boolean surgelato) {
        this.surgelato = surgelato;
    }

    public boolean getFresco() {
        return fresco;
    }

    public void setFresco(boolean fresco) {
        this.fresco = fresco;
    }

    // Stampa i dettagli della portata, evidenziando se il prodotto è surgelato o fresco
    @Override
    public void stampaDettagliPortata() {
        super.stampaDettagliPortata();
        // Controlla se il prodotto e surgelato
        if (surgelato) {
            //se è surgelato, stampa il dettaglio in verde
            System.out.println(ColorEnum.VERDE.getCodiceColore() + "Prodotto surgelato " + getSurgelato() + ColorEnum.RESET.getCodiceColore());
        }
        //Controlla se il prodotto è fresco
        if (fresco) {
            // Se fresco, stampa il dettaglio in giallo
            System.out.println(ColorEnum.GIALLO.getCodiceColore() + "Prodotto Fresco " + getFresco() + ColorEnum.RESET.getCodiceColore());
        }
        System.out.println();
    }
}
