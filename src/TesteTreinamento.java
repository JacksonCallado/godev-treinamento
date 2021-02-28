
public class TesteTreinamento {

	public static void main(String[] args) {
		
		Controle controle = new Controle();
		SalaDeEvento sala1 = new SalaDeEvento(3, "sala1");
		EspacoDeCafe cafe1 = new EspacoDeCafe("cafe1");
		
		controle.cadastraPessoa("a", "b", sala1, cafe1);
		controle.cadastraPessoa("c", "d", sala1, cafe1);
		controle.cadastraPessoa("e", "f", sala1, cafe1);
		controle.cadastraPessoa("g", "h", sala1, cafe1);
		
		//controle.consultaPessoa("a");
		sala1.setAlunos(controle.alunos);
		//sala1.mostraSala();
		controle.cadastraSala("sala");
		controle.cadastraSala("sala2");
		controle.dividiAlunos();
		
			
		
	}
	
}
