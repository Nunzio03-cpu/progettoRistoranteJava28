import java.util.ArrayList;

public class Ordinazione {
    private Cliente cliente;
    private ArrayList<Portate> portateScelte;

    public Ordinazione(Cliente cliente) {
        this.cliente = cliente;
        this.portateScelte = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Portate> getPortateScelte() {
        return portateScelte;
    }

    public void setPortateScelte(ArrayList<Portate> portateScelte) {
        this.portateScelte = portateScelte;
    }

    public void aggiungiPortataScelta(Portate portata){
        portateScelte.add(portata);
        System.out.println(portata.getNomePortata() + " aggiunto all'ordinazione per " + cliente.getNomeCompleto());
    }

    public void stampaOrdinazioni (Cliente cliente) {
        System.out.println("Ordinazioni del tavolo prenotato da " + this.cliente.getNomeCompleto());
        if (this.cliente.getNomeCompleto().equals(cliente.getNomeCompleto())){
            for(Portate portate : portateScelte){
                portate.stampaDettagliPortata();
            }
        }
    }
}
