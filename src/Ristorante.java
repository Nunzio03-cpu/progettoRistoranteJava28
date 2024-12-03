import java.util.ArrayList;
//todo implementare la stampa nella classe ristorante
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

    //todo reinserire il nome del ristorante e lo chef dentro stampaDettagliRistorante
    public void stampaDettagliRistorante(TipoMenuEnum tipo){

        for (Menu menu : listaMenu){
            if(menu.getTipo() == tipo){
                menu.stampaMenu();
            }
        }




    }

}
