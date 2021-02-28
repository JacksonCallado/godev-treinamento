
public class TesteTreinamento {

	public static void main(String[] args) {
		
		Controle controle = new Controle();
		Pessoa pessoa = new Pessoa();
		
		controle.cadastraPessoa("a", "b");
		controle.cadastraPessoa("c", "d");
		controle.cadastraPessoa("e", "f");
		
		controle.consultaPessoa("");
		
		pessoa.mostraPessoa();	
		
	}
	
}
