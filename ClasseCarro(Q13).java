public class Carro {
	private String Modelo;
	private String Marca;
	private int Ano;
	private String placa;
	
	public Carro(String md, String mc, int a, String p) {
		Modelo = md;
		Marca = mc;
		Ano = a;
		this.placa = p;
	}
	private String getModelo() {
		return Modelo;
	}
	private void setModelo(String modelo) {
		Modelo = modelo;
	}
	private String getMarca() {
		return Marca;
	}
	private void setMarca(String marca) {
		Marca = marca;
	}
	private int getAno() {
		return Ano;
	}
	private void setAno(int ano) {
		Ano = ano;
	}
	private String getPlaca() {
		return placa;
	}
	private void setPlaca(String placa) {
		this.placa = placa;
	}
	public String buzina() {
		return "BEEEP!";
	}
