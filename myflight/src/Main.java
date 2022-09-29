import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nMyFlight project...");

		GerenciadorAeronaves g1 = new GerenciadorAeronaves();
		Aeronave a1 = new Aeronave("01", "Bristol Brabazon");
		Aeronave a2 = new Aeronave("02", "Airbus A320");
		g1.adicionar(a1);
		g1.adicionar(a2);
		g1.listarTodas();
		g1.buscarPorCodigo("01");

		Geo loca1 = new Geo(-51.230000, -30.033056);
		GerenciadorAeroportos ga = new GerenciadorAeroportos();
		Aeroporto aeroporto = new Aeroporto("688", "Salgado Filho", loca1);
		ga.adicionar(aeroporto);
		Geo loca2 = new Geo(-23.4322, -46.4692);
		Aeroporto aeroporto2 = new Aeroporto("125", "Aeroporto de Guarulhos", loca2);
		Geo loca3 = new Geo(-32.655, -34.644);
		Aeroporto aeroporto3 = new Aeroporto("243", "Aeroporto de teste", loca3);
		ga.adicionar(aeroporto2);
		ga.listarTodos();
		ga.buscarPorCodigo("125");

		System.out.printf("Distancia entre os aeroportos: %s e %s eh de %.2fkm \n", 
						  aeroporto.getNome(), 
						  aeroporto2.getNome(), 
						  Geo.distancia(loca1, loca2));

		GerenciadorCias gc = new GerenciadorCias();
		CiaAerea c1 = new CiaAerea("222", "Azul");
		gc.adicionar(c1);
		gc.listarTodas();
		gc.buscarCodigo("222");
		gc.buscarNome("Azul");

		System.out.println("Total de empresas cadastradas: " + CiaAerea.getTotalCia());
		a1.imprimir();

		g1.ordenarDescricao();
		System.out.println("\n*** Lista ordenada das aeronaves pela DESCRICAO... ***");
		g1.listarTodas();

		ga.ordenarAeroportos();
		System.out.println("\n*** Lista ordenada dos aeroportos pelo NOME... ***");
		ga.listarTodos();
		
		GerenciadorRotas gr = new GerenciadorRotas();
		Rota r1 = new Rota(c1, aeroporto, aeroporto2, a1);
		Rota r2 = new Rota(c1, aeroporto2, aeroporto3, a1);
		LocalDateTime lc = LocalDateTime.of(2020, 05, 10, 15, 45);
		VooDireto vd = new VooDireto(lc, r1);
		VooEscalas ve = new VooEscalas(lc);

		System.out.println(" --- VOO ESCALA --- \n");
		ve.adicionaRota(r1);
		ve.getRotas();
		System.out.println("Duracao: " + ve.getDuracao(loca1, loca2));

		
		System.out.println("\n --- VOO DIRETO --- \n");
		System.out.println("Rota: " + vd.getRota());
		System.out.println("Duracao: " + vd.getDuracao(loca1, loca2));
    
	}
}
