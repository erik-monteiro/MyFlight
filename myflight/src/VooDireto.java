import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo
{
	private Rota rota;
	
	public VooDireto(LocalDateTime datahora, Rota rota) {
		super(datahora);
		this.rota = rota;
	}
  
	public Rota getRota() {
		return rota;
	}

	public Duration getDuracao(Geo g1, Geo g2) {
		double tempoViagem = (Geo.distancia(g1, g2) / 805.0) + 30;
		Duration duracao = Duration.ofMinutes((long)tempoViagem);
    	return duracao;
	}
}