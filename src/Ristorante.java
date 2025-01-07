import java.util.ArrayList;
import java.util.Iterator;

public class Ristorante {
    private String nomeRistorante;
    private String chef;
    private ArrayList<Menu> listaMenu;
    private Integer copertiDisponibili;
    private ArrayList<Cliente> clienti;

    public Ristorante(String nomeRistorante, String chef) {
        this.nomeRistorante = nomeRistorante;
        this.chef = chef;
        this.listaMenu = new ArrayList<>();
        this.copertiDisponibili = 35;
        this.clienti = new ArrayList<>();
    }

    public ArrayList<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(ArrayList<Cliente> clienti) {
        this.clienti = clienti;
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

    public void prenotaCliente(Cliente cliente) {
        if (copertiDisponibili >= cliente.getCoperti()) {
            this.clienti.add(cliente);
            copertiDisponibili -= cliente.getCoperti();
            System.out.println("Prenotazione effettuata per " + cliente.getNomeCompleto() );
        } else {
            System.out.println("Prenotazione non effettuata numero massimo di coperti gia raggiunto");
            System.out.println();
        }
    }

    public void cancellaPrenotazioneCliente (Cliente cliente){
        Iterator<Cliente> iter = clienti.iterator();
        while (iter.hasNext()){
            Cliente clienteC = iter.next();
            if (clienteC.getNomeCompleto().equalsIgnoreCase(cliente.getNomeCompleto())){
                iter.remove();
                System.out.println("Prenotazione di " + clienteC.getNomeCompleto() + " è stata cancellata");
            }
        }
    }

    public void stampaDettagliRistorante() {
        System.out.println();
        System.out.println(ColorEnum.CYAN.getCodiceColore() + "Nome ristorante: " + this.nomeRistorante + ", nome dello chef: " + this.chef + ColorEnum.RESET.getCodiceColore());
        System.out.println();
    }

    public void sceltaMenu (TipoMenuEnum menu){
        System.out.println("Menu scelto: " + menu);
        for (Menu menu1 : listaMenu) {
            if (menu1.getTipo() == menu) {
                menu1.stampaMenu();
                break;
            }
        }
        System.out.printf("%-151s %s", " ", "Coperto a persona: 2.50 €");
        System.out.println();
    }
}