public class GestioneFinanziaria {
    private static final double COSTO_COPERTO = 2.5;
    /**
     * calcolaPrezzoBase calcola il conto
     * return totale + coperto;
     */
    private static double calcolaPrezzoBase(Menu menu) {
        double totale = 0;
        for (Portate portata : menu.getPortate()) {
            totale += portata.getPrezzo();

        }
        return totale + COSTO_COPERTO;
    }

    /**
     * calcolaTotale calcola il prezzo base per il numero di coperti
     */
    public static double calcolaTotale(Menu menu, int numeroCoperti) {
        double prezzoBase = calcolaPrezzoBase(menu);
        double totale = prezzoBase * numeroCoperti;
        System.out.println("Totale per " + numeroCoperti + " coperti/o (senza sconto): " + totale + " €" + " è compreso i 2.50 € coperto a persona");
        return totale;
    }

    /**
     *calcolaTotaleConSconto calcola il totale
     * ma applica una percentuale di scontistica
     */
    public static void calcolaTotaleConSconto(Menu menu, int numeroCoperti, double percentualeSconto) {
        double totale = calcolaTotale(menu, numeroCoperti);
        double sconto = totale * percentualeSconto / 100;
        double totaleConSconto = totale - sconto;

        System.out.println("Totale per " + numeroCoperti + " coperti con uno sconto del " + percentualeSconto + "%: " + totaleConSconto + " €"+ " è compreso i 2.50 € coperto a persona");
    }
}
