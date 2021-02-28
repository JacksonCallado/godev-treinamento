import java.util.ArrayList;

public class Controle implements CadastroConsulta{
	
	private ArrayList<Pessoa> alunos;
	private ArrayList<SalaDeEvento> salas;
	private ArrayList<EspacoDeCafe> espacos;
	
	public Controle() {
		alunos = new ArrayList<Pessoa>();
		salas = new ArrayList<SalaDeEvento>();
		espacos = new ArrayList<EspacoDeCafe>();
	}
	
	@Override
	public void cadastraPessoa(String nome, String sobrenome) {
		Pessoa pessoa = new Pessoa(nome, sobrenome);
		alunos.add(pessoa);		
	}

	@Override
	public void cadastraSala(int lotacao, String nome) {
		SalaDeEvento sala = new SalaDeEvento(lotacao, nome);
		salas.add(sala);
	}

	@Override
	public void cadastraEspaco(String nome) {
		EspacoDeCafe cafe = new EspacoDeCafe(nome);
		espacos.add(cafe);
	}

	@Override
	public void consultaPessoa(String nome) {		
		for(int indice = 0; indice < alunos.size(); indice++) {
			Pessoa pessoa = alunos.get(indice);
			if(pessoa.getNome() == nome) {
				pessoa.mostraPessoa();
			}else if(pessoa.getNome() != null) {
				System.out.println("Pessoa não encontrada!");
			}
		}		
	}

	@Override
	public SalaDeEvento consultaSala() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EspacoDeCafe consultaEspaco() {
		// TODO Auto-generated method stub
		return null;
	}

}
