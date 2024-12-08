import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private String nome;
    private String cognome;
    private Integer coperti;
    private OffsetDateTime dataPrenotazione;

    public Cliente(String cognome, String nome , Integer coperti) {
        this.dataPrenotazione = OffsetDateTime.now();
        this.cognome = cognome;
        this.coperti = coperti;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public OffsetDateTime getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(OffsetDateTime dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public Integer getCoperti() {
        return coperti;
    }

    public void setCoperti(Integer coperti) {
        this.coperti = coperti;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void stampaDettagliData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Cliente: " + getNome() + " " + getCognome() + " - Coperti: " + getCoperti() + " - Prenotazione: " + dataPrenotazione.format(formatter));
    }
}
