
public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private SalaDeEvento sala;
	private EspacoDeCafe cafe;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void mostraPessoa() {
		System.out.println(this.nome);
		System.out.println(this.sobrenome);
		System.out.println(sala.getNome());
		System.out.println(cafe.getNome());			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public EspacoDeCafe getCafe() {
		return cafe;
	}

	public void setCafe(EspacoDeCafe cafe) {
		this.cafe = cafe;
	}

	public SalaDeEvento getSala() {
		return sala;
	}

	public void setSala(SalaDeEvento sala) {
		this.sala = sala;
	}
	
	
	
}
