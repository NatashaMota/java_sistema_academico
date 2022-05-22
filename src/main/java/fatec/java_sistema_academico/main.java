package fatec.java_sistema_academico;

public class main {

	public static void main(String[] args) {
		SistemaAcademico sa = new SistemaAcademico();
		Aluno aluno1 = new Aluno("12345679", "natasha", "ads", "mogi das cruzes, sp", "11988887777");
		Aluno aluno2 = new Aluno("12345678", "heloisa", "ads", "mogi das cruzes, sp", "11977776666");
		Professor professor1 = new Professor("987654", "luciano", "java", "nao sei, ue", "1195555544444");
		
		sa.cadastraProfessor(professor1);
		sa.cadastraAluno(aluno1);
		sa.cadastraAluno(aluno2);
		
		sa.excluiAluno("2");
		System.out.println("terminado.");
		
	}

}
