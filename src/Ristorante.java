import java.util.ArrayList;
public class Ristorante {
    private String nomeRistorante;
    private String chef;
    private ArrayList<Menu> listaMenu;
    private Integer numeroMassimoCoperti;

    public Ristorante(String nomeRistorante, String chef, Integer numeroMassimoCoperti) {
        this.nomeRistorante = nomeRistorante;
        this.chef = chef;
        this.listaMenu = new ArrayList<>();
        this.numeroMassimoCoperti = numeroMassimoCoperti;
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

    //todo reinserire il nome del ristorante e lo chef dentro stampaDettagliRistorante
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

}
