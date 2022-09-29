import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo
{	
	private ArrayList<Rota> rotas;
	
	public VooEscalas(LocalDateTime datahora) {
		super(datahora);
		rotas = new ArrayList<Rota>();
    }

	public void adicionaRota(Rota rota) {
		rotas.add(rota);
	}

	public Rota getRota() {
		return null;
	}

	public ArrayList<Rota> getRotas() {
		for (Rota r : rotas) {
			System.out.println("Rota ORIGEM: " + r.getOrigem() + "\nRota DESTINO: " + r.getDestino());
		} 
		return rotas;
	}

	public Duration getDuracao(Geo g1, Geo g2) {
    	double tempoViagem = (Geo.distancia(g1, g2) / 805.0) + 30;
		Duration duracao = Duration.ofMinutes((long) tempoViagem);
    	return duracao;
	}

}