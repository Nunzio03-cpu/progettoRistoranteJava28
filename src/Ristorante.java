import java.util.ArrayList;

public class Ristorante {
    private String nomeRistorante;
    private String chef;
    private ArrayList<Menu> listaMenu;

    public Ristorante(String nomeRistorante, String chef) {
        this.nomeRistorante = nomeRistorante;
        this.chef = chef;
        this.listaMenu = new ArrayList<>();
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

    public void aggiungiMenu(Menu menu){
        this.listaMenu.add(menu);
    }

    public void rimuoviMenu(Menu menu){
        this.listaMenu.remove(menu);
    }

    public void stampaDettagliRistorante(){
        System.out.println("Nome ristorante: " +this.nomeRistorante);
        System.out.println("Nome dello chef: " +this.chef);
        System.out.println("Menù che offre il ristorante:");
        for (Menu menu : listaMenu){
            System.out.println(menu.getNomeMenu() +" "+menu.getTipo());
        }
    }
}
