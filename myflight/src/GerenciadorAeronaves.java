import java.util.ArrayList;
import java.util.*;  

public class GerenciadorAeronaves {

	private ArrayList<Aeronave> aeronaves;

	public GerenciadorAeronaves() {
		this.aeronaves = new ArrayList<Aeronave>();
	}

	public void adicionar(Aeronave aviao) {
		aeronaves.add(aviao);
	}

	public ArrayList<Aeronave> listarTodas() {
		System.out.println("\n === LISTAGEM DE AERONAVES === ");
		for (Aeronave aero : aeronaves) {
			System.out.println("Codigo: " + aero.getCodigo() + "\nAeronave: " + aero.getDescricao() + "\n");
		}
		return aeronaves;
	}

	public Aeronave buscarPorCodigo(String codigo) {
		System.out.println("\n === BUSCA POR CODIGO DE AERONAVE === ");
		for (Aeronave aero : aeronaves) {
			if (aero.getCodigo().equals(codigo)) System.out.println("Aeronave: " + aero.getDescricao());
		}
		return null;
	}

	public void ordenarDescricao() {
		Collections.sort(aeronaves);
	}

}
