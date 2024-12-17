import java.time.format.DateTimeFormatter;
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

    public void aggiungiMenu(Menu menu) {
        this.listaMenu.add(menu);
    }

    public void rimuoviMenu(Menu menu) {
        this.listaMenu.remove(menu);
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