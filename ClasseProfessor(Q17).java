package Questões;

public class Professor {
	private String nome;
	private String dept;
	private String titulacao;
	
	public Professor(String n, String d, String t) {
		this.nome = n;
		this.dept = d;
		this.titulacao = t;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getDept() {
		return dept;
	}
	private void setDept(String dept) {
		this.dept = dept;
	}
	private String getTitulacao() {
		return titulacao;
	}
	private void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public String infoProf() {
		return "Professor" + nome + ", dept=" + dept + ", titulacao=" + titulacao + "]";
	}
}
