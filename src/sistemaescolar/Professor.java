package sistemaescolar;

public class Professor extends Pessoa {

	
	protected void lancarNota(Avaliacao avaliacao, Disciplina disciplina,  Aluno aluno, float nota) {
		avaliacao.setNota(nota);
		System.out.println("O professor lançou a nota " + nota + " do aluno " + aluno.getNome() + " no sistema.");
	}
	
	protected void ministrarDisciplina(Disciplina disciplina, Professor professor){
		System.out.println("O professor " + professor.getNome() + " está ministrando a disciplina "+ disciplina.getNomeDisciplina() +".");
	}

	protected void lancarFrequencia(Disciplina disciplina,  Aluno aluno) {
		aluno.setFrequencia(+1);
		System.out.println("O professor lançou frequencia no  sistema.");
	}
	
}
