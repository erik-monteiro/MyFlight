public class Aeronave implements Contavel, Comparable<Aeronave>
{
	private String codigo;
	private String descricao;
	public static int totalAeronaves;
  
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		totalAeronaves++;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int compareTo(Aeronave outra) {
		return this.descricao.compareTo(outra.descricao);
	}

	public void imprimir() {
		System.out.println("Total de aeronaves cadastradas: " + totalAeronaves);
	}

}
