import java.util.ArrayList;

public class GerenciadorRotas {
	public ArrayList<Rota> rotas;

	public GerenciadorRotas() {
		rotas = new ArrayList<Rota>();
	}

	public void inserir(Rota rota) {
		rotas.add(rota);
	}

	public ArrayList<Rota> listarTodas() {
		for (int i = 0; i < rotas.size(); i++) {
			System.out.println("Rotas: " + rotas.get(i) + "\n");
		}
		return rotas;
	}

	/*
	public ArrayList<Rota> buscaPorOrigem(Aeroporto origem) {
		
	}
	*/
	
}
