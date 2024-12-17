import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {

    private String nomeCompleto;
    private Integer coperti;
    private LocalDateTime dataPrenotazione;
    private TipoMenuEnum tipoMenu;

    public Cliente(String nomeCompleto , Integer coperti, LocalDateTime dataPrenotazione, TipoMenuEnum tipoMenu) {
        this.dataPrenotazione = dataPrenotazione;
        this.coperti = coperti;
        this.nomeCompleto = nomeCompleto;
        this.tipoMenu = tipoMenu;
    }

    public TipoMenuEnum getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(TipoMenuEnum tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
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

}
