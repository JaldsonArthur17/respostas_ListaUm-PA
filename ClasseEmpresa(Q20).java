package Questões;

public class Empresa {
	private String nome;
	private String cnpj;
	
	public Empresa(String n, String c) {
		this.nome = n;
		this.cnpj = c;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getCnpj() {
		return cnpj;
	}
	private void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String toString() {
		return "Empresa [nome=" + nome + ", cnpj=" + cnpj + "]";
	}	
}
