public class Animal {
	private String nome;
	private String tipo;
	private boolean emitesom;
	
	public Animal(String n, String t) {
		this.nome = n;
		this.tipo = t;
	}
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public void seteEmiteSom(boolean s) {
		this.emitesom = s;
	}
	public void emitirSom() {
		this.emitesom = true;
	}	
	public String toString() {
		return "o animal é: " + nome + "\n e seu tipo é: " + tipo;	}
    }
