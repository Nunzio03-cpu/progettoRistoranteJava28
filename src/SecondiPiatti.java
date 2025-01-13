public class SecondiPiatti extends Portate{
    private String metodoCottura;

    public SecondiPiatti(String nomePortata, Double prezzo, String ingredienti, String metodoCottura) {
        super(nomePortata, prezzo, ingredienti);
        this.metodoCottura = metodoCottura;

    }

    public String getMetodoCottura() {
        return metodoCottura;
    }

    public void setMetodoCottura(String metodoCottura) {
        this.metodoCottura = metodoCottura;
    }

     /**
     * Stampa i dettagli della portata, e specifica il tipo di cottura
     */
    @Override
    public void stampaDettagliPortata() {
        super.stampaDettagliPortata();
        System.out.println(ColorEnum.VERDE.getCodiceColore() + "tipo di cottura: " + getMetodoCottura() + ColorEnum.RESET.getCodiceColore());
        System.out.println();
    }
}
