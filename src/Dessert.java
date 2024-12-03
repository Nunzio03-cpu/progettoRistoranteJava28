public class Dessert extends Portate{

    private String tipoProdotto;

    //Costruttore
    public Dessert(String nomePortata, Double prezzo, String ingredienti, String tipoProdotto) {
        super(nomePortata, prezzo, ingredienti);
        this.tipoProdotto = tipoProdotto;
    }

    public String getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(String tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    //Metodo in override
    @Override
    public void stampaDettagliPortata() {
        super.stampaDettagliPortata();
        System.out.println(ColorEnum.VERDE.getCodiceColore() +"Tipo di prodotto: " + getTipoProdotto() + ColorEnum.RESET.getCodiceColore());
        System.out.println();
    }
}
