public enum TipoMenuEnum {
    CARNIVORO("piatto carnivoro"),
    VEGETARIANO("Piatto vegetariano"),
    VEGANO("Piatto vegano"),
    DESSERT("Dessert");

    private String tipologia;

    TipoMenuEnum(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
}
