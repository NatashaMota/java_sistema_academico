package fatec.java_sistema_academico;

public class Aluno {	
	
	private String ra;
	private String nome;
	private String curso;
	private String endereco; //tirar
	private String telefone;
	
	public Aluno(String ra, String nome, String curso, String endereco, String telefone) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
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