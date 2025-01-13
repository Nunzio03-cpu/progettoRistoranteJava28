public enum TipoMenuEnum {
    /**
     * classe per indicare i tipi di menù
     */
    FISSO("menu fisso"),
    CARNIVORO("Piatti carnivori"),
    VEGETARIANO("Piatti vegetariani"),
    VEGANO("Piatti vegani");

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
