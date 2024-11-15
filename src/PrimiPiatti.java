public class PrimiPiatti extends Portate{
    private String tipoPasta;

    public PrimiPiatti(String nomePortata, Double prezzo, String ingredienti, String tipoPasta) {
        super(nomePortata, prezzo, ingredienti);
        this.tipoPasta = tipoPasta;
    }

    public String getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(String tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    @Override
    public void stampaDettagliPortata(){
        System.out.println();
        System.out.println("Primi Piatti: ");
        super.stampaDettagliPortata();
        System.out.println(ColorEnum.VERDE + "tipo di pasta: " + getTipoPasta() + ColorEnum.RESET);
    }
}