package sistemaescolar;

public class Turma {
	
	//classe criada somente para testes
	public static void main(String[] args) {
		Disciplina d1 = new Disciplina();
		Professor p1 = new Professor();
		AlunoGraduacao a1 = new AlunoGraduacao();
		Avaliacao av1 = new Avaliacao();
		
		a1.setNome("Miguel");
		d1.setNomeDisciplina("Prog 2");
		p1.setNome("Clayton");
		
		d1.setProfessor(p1);
		a1.insreverDisciplina(d1, a1);
		
		System.out.println(a1.getTipoCurso());
		
		p1.ministrarDisciplina(d1, p1);
		
		p1.lancarNota(av1, d1, a1, 5.5f);

	}

}
