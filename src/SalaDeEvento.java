import java.util.ArrayList;

public class SalaDeEvento {
	
	private int lotacao;
	private String nome;
	private ArrayList<Pessoa> alunos;
	
	public SalaDeEvento(int lotacao, String nome) {	
		this.lotacao = lotacao;
		this.nome = nome;
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

	public void addAlunos(Pessoa aluno) {
		alunos.add(aluno);
	}	
	
	
	
}
