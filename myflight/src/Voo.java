
import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {

	private LocalDateTime datahora;
	
	public Voo(LocalDateTime datahora) {
		this.datahora = datahora;
	}

	public LocalDateTime getDatahora() {
		return datahora;
	}

    public abstract Rota getRota();
    public abstract Duration getDuracao(Geo g1, Geo g2);   
}
