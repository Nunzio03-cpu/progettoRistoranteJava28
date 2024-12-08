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

    public void aggiungiMenu(Menu menu){
        this.listaMenu.add(menu);
    }

    public void rimuoviMenu(Menu menu){
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

    public void stampaDettagliRistorante(TipoMenuEnum tipo){
        System.out.println();
        System.out.println("Nome ristorante: " + this.nomeRistorante + ", nome dello chef: " + this.chef);
        System.out.println();
        System.out.println("Menù che offre il ristorante:");
        for (Menu menu : listaMenu){
            if(menu.getTipo() == tipo){
                menu.stampaMenu();
            }
        }
        System.out.printf("%-151s %s"," ", "Coperto a persona: 2,50 €");
    }

    public boolean prenotaCliente (Cliente cliente){
        if (copertiDisponibili >= cliente.getCoperti()){
            clienti.add(cliente);
            copertiDisponibili -= cliente.getCoperti();
            System.out.println("Prenotazione effettuata per " + cliente.getNome() + " " + cliente.getCognome());
            return true;
        } else {
            System.out.println("Prenotazione non effettuata.");
            return false;
        }
    }
}
