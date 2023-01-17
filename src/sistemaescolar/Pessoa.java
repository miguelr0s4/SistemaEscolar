package sistemaescolar;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private int matrícula;
	private int telefone;
	private String email;
	private String endereco;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getMatrícula() {
		return matrícula;
	}
	public void setMatrícula(int matrícula) {
		this.matrícula = matrícula;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
}

