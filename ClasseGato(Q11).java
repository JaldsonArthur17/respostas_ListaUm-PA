public class Gato {
	private String nome;
	private String raca;
	private int idade;
	
	public Gato(String n, String r, int i) {
		this.nome = n;
		this.raca = r;
		this.idade = i;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getRaca() {
		return raca;
	}
	private void setRaca(String raca) {
		this.raca = raca;
	}
	private int getIdade() {
		return idade;
	}
	public String Miado() {
		return "Miau Miau!";
	}
}
	
	
