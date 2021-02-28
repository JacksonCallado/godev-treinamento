
public interface CadastroConsulta {
	
	public void cadastraPessoa(String nome, String sobrenome, SalaDeEvento sala, EspacoDeCafe cafe);
	
	public void cadastraSala(String nome);
	
	public void cadastraEspaco(String nome);
	
	public void consultaPessoa(String nome);
	
	public void consultaSala(String nome);
	
	public void consultaEspaco(String nome);
	
}
