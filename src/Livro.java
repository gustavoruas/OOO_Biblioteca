
public class Livro {

	private String ISBN;
	private String titulo;
	private String assunto;
	private String autores; 
	private String editora; 
	private String edicao; 
	private int ano;
	private String idioma; 
	private String pais_de_origem; 
	private String pais_de_publicacao; 
	private String numero_de_paginas;
	
	private boolean emprestado;
	
	//construct
	public Livro(String Titulo){
		this.titulo = Titulo;
	}
	public Livro(){
		
	}
	
	public void EmprestarPara(Aluno aluno) {
		emprestado = true;
		/*
		Emprestimo emprestimo = new Emprestimo();		
		aluno.AdicionarEmprestimo(emprestimo);
		*/
	}
	
	public boolean EstaEmprestado() {
		return emprestado;
	}
	
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getPais_de_origem() {
		return pais_de_origem;
	}
	public void setPais_de_origem(String pais_de_origem) {
		this.pais_de_origem = pais_de_origem;
	}
	public String getPais_de_publicacao() {
		return pais_de_publicacao;
	}
	public void setPais_de_publicacao(String pais_de_publicacao) {
		this.pais_de_publicacao = pais_de_publicacao;
	}
	public String getNumero_de_paginas() {
		return numero_de_paginas;
	}
	public void setNumero_de_paginas(String numero_de_paginas) {
		this.numero_de_paginas = numero_de_paginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
