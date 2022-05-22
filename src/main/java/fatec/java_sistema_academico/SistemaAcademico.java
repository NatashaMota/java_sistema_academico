package fatec.java_sistema_academico;

import java.util.LinkedList;
import java.util.Iterator;

public class SistemaAcademico {

	private LinkedList<Professor> professores = new LinkedList<Professor>();
	private LinkedList<Aluno> alunos = new LinkedList<Aluno>();

	public void cadastraProfessor(Professor professor) {
		this.professores.add(professor);
	}
	
	public void cadastraAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	private Aluno pesquisaAluno(String ra) {
		Iterator<Aluno> iterator = this.alunos.iterator();
		Aluno aluno = null;
		
		while(iterator.hasNext()) {
			aluno = iterator.next();
			
			if(aluno.getRa() == ra)
				break;
		}
		return aluno;

	}
	
	private Professor pesquisaProfessor(String registro) {
		Iterator<Professor> iterator = this.professores.iterator();
		Professor professor = null;
		
		while(iterator.hasNext()) {
			professor = iterator.next();
			
			if(professor.getRegistro() == registro)
				break;
		}
		return professor;

	}
	
	public void excluiProfessor(String registro) {
		this.professores.remove(pesquisaProfessor(registro));
		
	}
	
	public void excluiAluno(String ra) {
		this.alunos.remove(pesquisaAluno(ra));
		
	}
	
	public void alteraProfessor(Professor professor) {
		int index = this.professores.indexOf(pesquisaProfessor(professor.getRegistro()));
		this.professores.add(index, professor);
		
	}
	
	public void alteraAluno(Aluno aluno) {
		int index = this.alunos.indexOf(pesquisaAluno(aluno.getRa()));
		this.alunos.add(index, aluno);
		
	}
	
}