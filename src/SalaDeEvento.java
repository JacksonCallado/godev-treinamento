import java.util.ArrayList;

public class SalaDeEvento {
	
	private int lotacao;
	private String nome;
	private ArrayList<Pessoa> alunos;
	
	public SalaDeEvento(String nome) {
		this.nome = nome;
	}
	
	public SalaDeEvento(int lotacao, String nome) {
		this.nome = nome;
		this.lotacao = lotacao;
	}
	
	public void mostraSala() {
		System.out.println(this.getNome());
		for(int indice = 0; indice < alunos.size(); indice++) {
			Pessoa pessoa = alunos.get(indice);
			System.out.println(pessoa.getNome());
		}
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Pessoa> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Pessoa> alunos) {
		this.alunos = alunos;
	}

	public void addAlunos(Pessoa aluno) {
		alunos.add(aluno);
	}	
	
	
	
}
