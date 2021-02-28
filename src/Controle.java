import java.util.ArrayList;

public class Controle implements CadastroConsulta{
	
	ArrayList<Pessoa> alunos;
	ArrayList<SalaDeEvento> salas;
	ArrayList<EspacoDeCafe> espacos;
	
	public Controle() {
		alunos = new ArrayList<Pessoa>();
		salas = new ArrayList<SalaDeEvento>();
		espacos = new ArrayList<EspacoDeCafe>();
	}
	
	@Override
	public void cadastraPessoa(String nome, String sobrenome, SalaDeEvento sala, EspacoDeCafe cafe) {
		Pessoa pessoa = new Pessoa(nome, sobrenome, sala, cafe);
		alunos.add(pessoa);		
	}

	@Override
	public void cadastraSala(String nome) {
		SalaDeEvento sala = new SalaDeEvento(nome);
		salas.add(sala);
	}

	@Override
	public void cadastraEspaco(String nome) {
		EspacoDeCafe cafe = new EspacoDeCafe(nome);
		espacos.add(cafe);
	}
	
	public void dividiAlunos() {
		int lotacao = alunos.size();
		if(salas.size() == 2) {
			
			int metade = lotacao / 2;
			for (int i = 0; i <= metade; i++) {
				SalaDeEvento sala = salas.get(1);
				sala.addAlunos(alunos.get(i));
				//System.out.println(i);
			}
			for(int i = (metade + 1); i < lotacao; i++) {
				SalaDeEvento sala = salas.get(2);
				sala.addAlunos(alunos.get(i));
				//System.out.println(i);
			}
		}
	}

	@Override
	public void consultaPessoa(String nome) {		
		for(int indice = 0; indice < alunos.size(); indice++) {
			Pessoa pessoa = alunos.get(indice);
			if(pessoa.getNome() == nome) {
				pessoa.mostraPessoa();
			}
		}		
	}

	@Override
	public void consultaSala(String nome) {		
		for(int indice = 0; indice < alunos.size(); indice++) {
			SalaDeEvento sala = salas.get(indice);
			if(sala.getNome() == nome) {
				sala.mostraSala();
			}
		}		
	}

	@Override
	public void consultaEspaco(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
