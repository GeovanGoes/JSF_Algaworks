package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Livro;

@ManagedBean
@ViewScoped
public class LivrosBean {
	
	private List<Livro> livros;
	private Livro livroNovo;
	
	public LivrosBean() {
		this.livros = new ArrayList<>();
		this.livros.add(new Livro("Java e Orientação a Objetos",
		"Thiago Faria"));
		this.livros.add(new Livro("JPA 2 e Hibernate", "Thiago Faria"));
		this.livros.add(new Livro("JavaServer Faces", "Thiago Faria"));
		this.livros.add(new Livro("Test Driven Development", "Kent Beck"));
		this.livros.add(new Livro("Start Small, Stay Small",
		"Rob Walling"));
		this.livros.add(new Livro("Trabalhe 4 Horas Por Semana",
		"Timothy Ferris"));
		this.livros.add(new Livro("Getting Real", "Jason Fried"));
		this.livros.add(new Livro("Rework", "Jason Fried"));
		
		this.livroNovo =  new Livro ();
		}
	
	public void adicionarLivro(){
		this.livros.add(this.livroNovo);
		this.livroNovo = new Livro();
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro getLivroNovo() {
		return livroNovo;
	}

	public void setLivroNovo(Livro livroNovo) {
		this.livroNovo = livroNovo;
	}	
	
	
}
