package sistemaescolar;

import java.util.ArrayList;

public class Disciplina {
	
	private String nomeDisciplina;
	private Avaliacao avaliacao;
	private Professor professor;
	private ArrayList<Aluno> alunosTurma = new ArrayList<Aluno>();

	
	//métodos acessores
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Aluno> getAlunosTurma() {
		return alunosTurma;
	}
	public void setAlunosTurma(ArrayList<Aluno> alunosTurma) {
		this.alunosTurma = alunosTurma;
	}
	
}
