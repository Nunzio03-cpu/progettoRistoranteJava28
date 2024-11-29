import java.util.ArrayList;

public class Menu {
    private ArrayList<Portate> portate;
    private String nomeMenu;
    private TipoMenuEnum tipo;

    public Menu(String nomeMenu, TipoMenuEnum tipo) {
        this.nomeMenu = nomeMenu;
        this.tipo = tipo;
        this.portate = new ArrayList<>();
    }

    // Metodo per aggiungere una portata
    public void aggiungiPortata(Portate portata) {
        portate.add(portata);
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    public TipoMenuEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoMenuEnum tipo) {
        this.tipo = tipo;
    }

    // Metodo per stampare tutte le portate
    public void stampaMenu() {
        //stampa il Menù
        System.out.println(ColorEnum.VIOLA.getCodiceColore() + "Menù: " + nomeMenu + " (" + tipo + ")" + ColorEnum.RESET.getCodiceColore());
        for (Portate portata : portate) {
            portata.stampaDettagliPortata();
            }


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
