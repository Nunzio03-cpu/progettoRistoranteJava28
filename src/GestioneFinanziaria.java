public class GestioneFinanziaria {
    // Calcola il prezzo base come somma dei prezzi delle portate nel menu
    public double calcolaPrezzoBase(Menu menu) {
        double totale = 0;
        for (Portate portata : menu.getPortate()) {
            totale += portata.getPrezzo();

        }
//        System.out.println("Prezzo base per il menu " + menu.getTipo() + ": " + totale + " €");

        return totale + 2.5;
    }

    // Metodo per calcolare il totale senza sconto
    public double calcolaTotale(Menu menu, int numeroCoperti) {
        double prezzoBase = calcolaPrezzoBase(menu);
        double totale = prezzoBase * numeroCoperti;
        System.out.println("Totale per " + numeroCoperti + " coperti/o (senza sconto): " + totale + " €" + " è compreso i 2.50 € coperto a persona");
        return totale;
    }

    // Metodo per calcolare il totale con sconto
    public void calcolaTotaleConSconto(Menu menu, int numeroCoperti, double percentualeSconto) {
        double totale = calcolaTotale(menu, numeroCoperti);
        double sconto = totale * percentualeSconto / 100;
        double totaleConSconto = totale - sconto;

        System.out.println("Totale per " + numeroCoperti + " coperti con uno sconto del " + percentualeSconto + "%: " + totaleConSconto + " €"+ " è compreso i 2.50 € coperto a persona");
    }

}
