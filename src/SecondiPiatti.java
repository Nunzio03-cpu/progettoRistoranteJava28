import java.util.ArrayList;

public class SecondiPiatti extends Portate{
    private String metodoCottura;

    public SecondiPiatti(String nomePortata, Double prezzo, String metodoCottura) {
        super(nomePortata, prezzo);
        this.metodoCottura = metodoCottura;
    }

    public String getMetodoCottura() {
        return metodoCottura;
    }

    public void setMetodoCottura(String metodoCottura) {
        this.metodoCottura = metodoCottura;
    }



    @Override
    public void stampaDettagliPortata() {
        System.out.println();
        System.out.println("Secondi Piatti: ");
        super.stampaDettagliPortata();
        System.out.println(Color.VERDE + "tipo di cottura: " + getMetodoCottura() + Color.RESET);

    }
}
