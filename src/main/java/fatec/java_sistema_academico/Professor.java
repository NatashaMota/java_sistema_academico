package fatec.java_sistema_academico;


public class Professor {
	
	private String registro;
	private String nome;
	private String disciplina;
	private String endereco; //tirar
	private String telefone;
	
	public Professor(String registro, String nome, String disciplina, String endereco, String telefone) {
		this.registro = registro;
		this.nome = nome;
		this.disciplina = disciplina;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}
	
	
	public String getRegistro()
	{
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}