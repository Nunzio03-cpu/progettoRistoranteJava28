import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Ristorante {
    private String nomeRistorante;
    private String chef;
    private ArrayList<Menu> listaMenu;
    private Integer numeroMassimoCoperti;
    private Integer copertiDisponibili;
    private ArrayList<Cliente> clienti;

    public Ristorante(String nomeRistorante, String chef, Integer numeroMassimoCoperti) {
        this.nomeRistorante = nomeRistorante;
        this.chef = chef;
        this.listaMenu = new ArrayList<>();
        this.numeroMassimoCoperti = numeroMassimoCoperti;
        this.copertiDisponibili = numeroMassimoCoperti;
        this.clienti = new ArrayList<>();
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public ArrayList<Menu> getListaMenu() {
        return listaMenu;
    }

    public void setListaMenu(ArrayList<Menu> listaMenu) {
        this.listaMenu = listaMenu;
    }

    public Integer getNumeroMassimoCoperti() {
        return numeroMassimoCoperti;
    }

    public void setNumeroMassimoCoperti(Integer numeroMassimoCoperti) {
        this.numeroMassimoCoperti = numeroMassimoCoperti;
    }

    public void aggiungiMenu(Menu menu) {
        this.listaMenu.add(menu);
    }

    public void rimuoviMenu(Menu menu) {
        this.listaMenu.remove(menu);
    }

    public Integer getCopertiDisponibili() {
        return copertiDisponibili;
    }

    public void setCopertiDisponibili(Integer copertiDisponibili) {
        this.copertiDisponibili = copertiDisponibili;
    }

    public ArrayList<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(ArrayList<Cliente> clienti) {
        this.clienti = clienti;
    }

    // (Biagio) elimino imput (TipoMenuEnum tipo) e commento lo switch
    public void stampaDettagliRistorante() {
        System.out.println();
        System.out.println(ColorEnum.CYAN.getCodiceColore() + "Nome ristorante: " + this.nomeRistorante + ", nome dello chef: " + this.chef + ColorEnum.RESET.getCodiceColore());
        System.out.println();
        //todo eliminare il commento
       // System.out.println("Menù che offre il ristorante:");
/*

        // Utilizzo di switch-case per stampare il menu in base al tipo
        switch (tipo) {
            case VEGANO:
                for (Menu menu : listaMenu) {
                    if (menu.getTipo() == TipoMenuEnum.VEGANO) {
                        menu.stampaMenu();
                    }
                }
                break;

            case VEGETARIANO:
                for (Menu menu : listaMenu) {
                    if (menu.getTipo() == TipoMenuEnum.VEGETARIANO) {
                        menu.stampaMenu();
                    }
                }
                break;

            case CARNIVORO:
                for (Menu menu : listaMenu) {
                    if (menu.getTipo() == TipoMenuEnum.CARNIVORO) {
                        menu.stampaMenu();
                    }
                }
                break;

            default:
                System.out.println("Tipo di menu non riconosciuto.");
        }


        System.out.println(); */
    }

    //todo aggiungi un metodo per rimuovere le prenotazioni
    //todo creare una classe prenotazione
    //todo creare una classe per la gestione finanziaria del ristorante
    public void prenotaCliente(Cliente cliente) {
        if (copertiDisponibili >= cliente.getCoperti()) {
            clienti.add(cliente);
            copertiDisponibili -= cliente.getCoperti();
            System.out.println("Prenotazione effettuata per " + cliente.getNome() + " " + cliente.getCognome());
        } else {
            System.out.println("Prenotazione non effettuata numero massimo di coperti gia raggiunto");
            System.out.println();
        }
    }

    //todo ridurre il numero di azioni fatte da stampaPrenotazioni
    //todo creare un metodo per scegliere il menu per il cliente
    public void stampaPrenotazioni() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for (Cliente cliente : clienti) {
            System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getCognome());

            System.out.println(" prenotazione: " + cliente.getDataPrenotazione().format(formatter) +
                    ", per il " + cliente.getCoperti() + " persona/persone, " + " menu scelto: " + cliente.getTipoMenu());

            System.out.println("Menu scelto: " + cliente.getTipoMenu());
            for (Menu menu : listaMenu) {
                if (menu.getTipo() == cliente.getTipoMenu()) {
                    menu.stampaMenu();
                    break;
                }

            }
            System.out.printf("%-151s %s", " ", "Coperto a persona: 2,50 €");
            System.out.println();
        }

    }
}