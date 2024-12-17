import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Prenotazione {
    private ArrayList<Cliente> clienti;
    private Integer numeroMassimoCoperti;
    private Integer copertiDisponibili;

    public Prenotazione() {
        this.clienti = new ArrayList<>();
        this.numeroMassimoCoperti = 35;
        this.copertiDisponibili = numeroMassimoCoperti;
    }

    public ArrayList<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(ArrayList<Cliente> clienti) {
        this.clienti = clienti;
    }

    public Integer getNumeroMassimoCoperti() {
        return numeroMassimoCoperti;
    }

    public void setNumeroMassimoCoperti(Integer numeroMassimoCoperti) {
        this.numeroMassimoCoperti = numeroMassimoCoperti;
    }

    public Integer getCopertiDisponibili() {
        return copertiDisponibili;
    }

    public void setCopertiDisponibili() {
        this.copertiDisponibili = numeroMassimoCoperti;
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

    /*iterator serve per iterare le liste (anche ArrayList) e viene utilizzato per raggirare
    il currentModificationException l'ho utilizzato per poter cancellare la prenotazione
    del cliente in entrata*/
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

    public void stampaPrenotazioni() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for (Cliente cliente : clienti) {
            System.out.println("Cliente: " + cliente.getNomeCompleto());

            System.out.println(" prenotazione: " + cliente.getDataPrenotazione().format(formatter) +
                    ", per il " + cliente.getCoperti() + " persona/persone, " + " menu scelto: " + cliente.getTipoMenu());
        }

    }
}
