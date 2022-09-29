

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia) {
		empresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas() {
		System.out.println("\n === LISTAGEM DE CIAS AEREAS === ");
		for (CiaAerea cia : empresas) {
			System.out.println("Codigo: " + cia.getCodigo() + "\nNome: " + cia.getNome() + "\n");
		}
		return empresas;
	}

	public CiaAerea buscarCodigo(String codigo) {
		System.out.println("\n === BUSCAR POR CODIGO DE CIAS AEREAS === ");
		for (CiaAerea cia : empresas) {
			if (cia.getCodigo().equals(codigo)) System.out.println("Nome: " + cia.getNome());
		}
		return null;
	}

	public CiaAerea buscarNome(String nome) {
		System.out.println("\n === BUSCAR POR NOME DE CIAS AEREAS === ");
		for (CiaAerea cia : empresas) {
			if (cia.getNome().equals(nome)) 
				System.out.println("Codigo: " + cia.getCodigo() + "\nNome: " + cia.getNome() + "\n");
		}
		return null;
	}
}
