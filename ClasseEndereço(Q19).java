package Questões;

public class Endereço {
	private String rua;
	private int numero;
	private String complemento;
	private String Bairro;
	private String cidade;
	private String cep;
	
	public Endereço(String r, int n, String ct, String b, String cd, String cep) {
		this.rua = r;
		this.numero = n;
		this.complemento = ct;
		Bairro = b;
		this.cidade = cd;
		this.cep = cep;
	}
	private String getRua() {
		return rua;
	}
	private void setRua(String rua) {
		this.rua = rua;
	}
	private int getNumero() {
		return numero;
	}
	private void setNumero(int numero) {
		this.numero = numero;
	}
	private String getComplemento() {
		return complemento;
	}
	private void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	private String getBairro() {
		return Bairro;
	}
	private void setBairro(String bairro) {
		Bairro = bairro;
	}
	private String getCidade() {
		return cidade;
	}
	private void setCidade(String cidade) {
		this.cidade = cidade;
	}
	private String getCep() {
		return cep;
	}
	private void setCep(String cep) {
		this.cep = cep;
	}
	public String infoCidade() {
		return "Endereço [rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", Bairro=" + Bairro
				+ ", cidade=" + cidade + ", cep=" + cep + "]";
	}
}
