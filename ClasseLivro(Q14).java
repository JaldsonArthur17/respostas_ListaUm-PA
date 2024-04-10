public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	
	
	public Livro(String t, String a, String e, int ap) {
		this.titulo = t;
		this.autor = a;
		this.editora = e;
		this.anoPublicacao = ap;
	}
	private String getTitulo() {
		return titulo;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	private String getAutor() {
		return autor;
	}
	private void setAutor(String autor) {
		this.autor = autor;
	}
	private String getEditora() {
		return editora;
	}
	private void setEditora(String editora) {
		this.editora = editora;
	}
	private int getAnoPublicacao() {
		return anoPublicacao;
	}
	private void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
public String infoLivro() {
		return "o titulo do livro é: " + titulo + "o autor se chama: " + autor + 
				"a editora é: " + editora + "o ano de publicação foi: " + anoPublicacao;
	}
  package Questões;

public class Main {
    public static void main(String[] args) {
    Livro l = new Livro("Harry Potter","J.K Rowling", "Magic", 2005);
    System.out.println(l.infoLivro());
    }
}+
}
