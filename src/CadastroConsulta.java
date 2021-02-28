
public interface CadastroConsulta {
	
	public void cadastraPessoa(String nome, String sobrenome);
	
	public void cadastraSala(int lotacao, String nome);
	
	public void cadastraEspaco(String nome);
	
	public void consultaPessoa(String nome);
	
	public SalaDeEvento consultaSala();
	
	public EspacoDeCafe consultaEspaco();
	
}
