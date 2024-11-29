public enum ColorEnum {
    RESET("\u001B[0m"),
    GIALLO("\u001B[33m"), // utilizzo per nome del piatto
    ROSSO("\u001B[31m"), // utilizzo per prezzo
    BLU("\u001B[34m"), //utilizzo per ingredienti
    VERDE("\u001B[32m"),// field aggiuntivo in ogni classe figlia
    VIOLA("\u001B[35m");// utilizzo per nome Menù


    private String codiceColore;

    ColorEnum(String codiceColore){
        this.codiceColore = codiceColore;
    }

    public String getCodiceColore() {
        return codiceColore;
    }

    public void setCodiceColore(String codiceColore) {
        this.codiceColore = codiceColore;
    }
}
