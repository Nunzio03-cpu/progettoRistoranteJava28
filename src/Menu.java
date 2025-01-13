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

    public ArrayList<Portate> getPortate() {
        return portate;
    }

    public void setPortate(ArrayList<Portate> portate) {
        this.portate = portate;
    }

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

    /**
     * stampaMenu stampa le portate di un menu tramite instanceof
     */
    public void stampaMenu() {
        System.out.println(ColorEnum.VIOLA.getCodiceColore() + "Menù: " + nomeMenu + ColorEnum.RESET.getCodiceColore());


        System.out.println("Antipasti:");
        for (Portate portata : portate) {
            if (portata instanceof Antipasti) {
                portata.stampaDettagliPortata();
            }
        }

        System.out.println("Primi piatti:");
        for (Portate portata : portate) {
            if (portata instanceof PrimiPiatti) {
                portata.stampaDettagliPortata();
            }
        }

        System.out.println("Secondi piatti:");
        for (Portate portata : portate) {
            if (portata instanceof SecondiPiatti) {
                portata.stampaDettagliPortata();
            }
        }
        System.out.println("Dessert:");
        for (Portate portata : portate) {
            if (portata instanceof Dessert) {
                portata.stampaDettagliPortata();
            }
        }
        System.out.println();
    }
}
