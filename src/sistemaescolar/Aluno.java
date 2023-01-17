package sistemaescolar;

public abstract class Aluno extends Pessoa {
	
	private int frequencia;
	protected String duracaoCurso;
	protected String avaliacao;
	protected String tipoCurso;
	

	//métodos específicos
	
	protected void insreverDisciplina(Disciplina disciplina, Aluno aluno){
		System.out.println("Os alunos " + aluno.getNome() + " se inscreveu na disciplina "+ disciplina.getNomeDisciplina() +".");
	}
	
	protected void solicitarBoleto() {
		System.out.println("O boleto foi enviado para o email.");
	}
	
	protected void solicitarHistorico() {
		System.out.println("O historico do aluno foi enviado para o email.");
	}
	
	//métodos acessores	
	public String getDuracaoCurso() {
		return duracaoCurso;
	}
	public void setDuracaoCurso(String duracaoCurso) {
		this.duracaoCurso = duracaoCurso;
	}
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String getTipoCurso() {
		return tipoCurso;
	}
	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
	

}
