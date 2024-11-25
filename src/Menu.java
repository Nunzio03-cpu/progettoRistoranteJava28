import java.util.ArrayList;

public class Menu {
    private ArrayList<Portate> portate;

    public Menu() {
        this.portate = new ArrayList<>();
    }

    // Metodo per aggiungere una portata
    public void aggiungiPortata(Portate portata) {
        portate.add(portata);
    }



    // Metodo per stampare tutte le portate
    public void stampaMenu() {
        // Stampa Antipasti
        System.out.println("Antipasti:");
        for (Portate portata : portate) {
            if (portata instanceof Antipasti) {
                portata.stampaDettagliPortata();
            }
        }

        // Stampa Primi Piatti
        System.out.println("Primi piatti:");
        for (Portate portata : portate) {
            if (portata instanceof PrimiPiatti) {
                portata.stampaDettagliPortata();
            }
        }

        // Stampa Secondi Piatti
        System.out.println("Secondi piatti:");
        for (Portate portata : portate) {
            if (portata instanceof SecondiPiatti) {
                portata.stampaDettagliPortata();
            }
        }
        // Stampa Dessert
        System.out.println("Dessert:");
        for (Portate portata : portate) {
            if (portata instanceof Dessert) {
                portata.stampaDettagliPortata();
            }
        }
        System.out.printf("%-151s %s"," ", "Coperto a persona: 2,50 €");
    }
}
