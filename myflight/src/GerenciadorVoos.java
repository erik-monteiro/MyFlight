import java.util.ArrayList;
import java.time.LocalDateTime;

public class GerenciadorVoos {

	private ArrayList<Voo> voos;

	public GerenciadorVoos() {
		this.voos = new ArrayList<Voo>();
	}

	public void adicionar(Voo voo) {
		voos.add(voo);
	}

	public ArrayList<Voo> listarTodas() {
		for (int i = 0; i < voos.size(); i++) {
			System.out.println("Aeronave: " + voos.get(i) + "\n");
		}
		return voos;
	}

	public Voo buscarData(LocalDateTime data) {
		for (Voo voo : voos) {
			if (voo.getDatahora() == data) return voo;
		}
		return null;
	}

}
