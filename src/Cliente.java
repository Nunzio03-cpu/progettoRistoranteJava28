import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private String nome;
    private String cognome;
    private Integer coperti;
    private LocalDateTime dataPrenotazione;
    private TipoMenuEnum tipoMenu;

    public Cliente(String cognome, String nome , Integer coperti, LocalDateTime dataPrenotazione, TipoMenuEnum tipoMenu) {
        this.dataPrenotazione = dataPrenotazione;
        this.cognome = cognome;
        this.coperti = coperti;
        this.nome = nome;
        this.tipoMenu = tipoMenu;
    }

    public TipoMenuEnum getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(TipoMenuEnum tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDateTime dataPrenotazione) {
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

}
