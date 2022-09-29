import java.util.ArrayList;
import java.util.*;

public class GerenciadorAeroportos {
	
	private ArrayList<Aeroporto> aeroportos;

	public GerenciadorAeroportos() {
		aeroportos = new ArrayList<Aeroporto>();
	}

	public void adicionar(Aeroporto aeroporto) {
		aeroportos.add(aeroporto);
	}

	public ArrayList<Aeroporto> listarTodos() {
		System.out.println("\n === LISTAGEM DE AEROPORTOS === ");
		for (Aeroporto aero : aeroportos) {
			System.out.println("Codigo: " + aero.getCodigo() + 
							   "\nNome: " + aero.getNome() + 
							   "\nLocalização: " + aero.getLocal() + "\n");
		}
		return aeroportos;
	}

	public Aeroporto buscarPorCodigo(String codigo) {
		System.out.println("\n === LISTAGEM POR CODIGO DE AEROPORTOS === ");
		for (Aeroporto aero : aeroportos) {
			if (aero.getCodigo().equals(codigo)) 
				System.out.println("Aeroporto: " + aero.getNome() + "\nLocalização: " + aero.getLocal() + "\n");	
		}
		return null;
	}

	public void ordenarAeroportos() {
		Collections.sort(aeroportos);
	}

}
