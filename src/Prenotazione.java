import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Prenotazione {
    private ArrayList<Cliente> clienti;

    public Prenotazione() {
       this.clienti = new ArrayList<>();
    }

    public ArrayList<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(ArrayList<Cliente> clienti) {
        this.clienti = clienti;
    }
    public void aggiungiCliente(Cliente cliente) {
        clienti.add(cliente);
    }

    public void stampaPrenotazioni() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for (Cliente cliente : clienti) {
            System.out.println("Cliente: " + cliente.getNomeCompleto());

            System.out.println(" prenotazione: " + cliente.getDataPrenotazione().format(formatter) +
                    ", per il " + cliente.getCoperti() + " persona/persone, " + " menu scelto: " + cliente.getTipoMenu());
        }

    }
}
