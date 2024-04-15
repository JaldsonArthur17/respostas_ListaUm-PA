package Questões;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	
	public Aluno(String n, String m, String c) {
		this.nome = n;
		this.matricula = m;
		this.curso = c;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getMatricula() {
		return matricula;
	}
	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	private String getCurso() {
		return curso;
	}
	private void setCurso(String curso) {
		this.curso = curso;
	}
	public String infoAluno() {
		return "Aluno se chama: " + nome + "matrícula: " + matricula + "faz curso de: " + curso;
	}
}

