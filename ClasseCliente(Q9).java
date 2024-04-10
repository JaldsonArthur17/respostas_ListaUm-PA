public class Cliente {
	private String nome;
	private String cpf;
	private Data data;
	
	public Cliente (String n, String c, Data d) {
		this.nome = n;
		this.cpf = c;
		this.data = d;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getCpf() {
		return cpf;
	}
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	private Data getData() {
		return data;
	}
	private void setData(Data data) {
		this.data = data;
	}
	 public String toString() {
	        return "nome= " + nome + "\n cpf= " + cpf + "\ndata= " + data;
	 }
}
	 
