package Questões;

public class Disciplina {
	private String nome;
	private String codigo;
	
	public Disciplina(String n, String c) {
		this.nome = nome;
		this.codigo = codigo;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getCodigo() {
		return codigo;
	}
	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String infoDisciplina() {
		return "Disciplina [nome=" + nome + ", codigo=" + codigo + "]";
	}
}
