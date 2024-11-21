public class Dessert extends Portate{

    private boolean vegetariano;

    //Costruttore
    public Dessert(String nomePortata, Double prezzo, String ingredienti,boolean vegetariano) {
        super(nomePortata, prezzo, ingredienti);
        this.vegetariano = vegetariano;
    }


    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }
    //Metodo in override
    @Override
    public void stampaDettagliPortata() {
        super.stampaDettagliPortata();
        System.out.println(ColorEnum.VERDE.getCodiceColore() + "Prodotto vegetariano: "+ (isVegetariano() ? "Si":"No") + ColorEnum.RESET.getCodiceColore());
        System.out.println();
    }
}
