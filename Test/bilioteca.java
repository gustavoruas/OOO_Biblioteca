import static org.junit.Assert.*;

import org.junit.Test;


public class bilioteca {

	@Test
	public void CadastrarLivro() {
		
		Livro novoLivro = new Livro();
	
		Acervo acervo = new Acervo();
		
		acervo.Adicionar(novoLivro);
		
		assertEquals(1, acervo.QuantidadeLivro());
	}
	
	@Test
	public void pesquisaLivro(){
		
		Livro novoLivro = new Livro("Iracema");
		Acervo acervo = new Acervo();
		
		acervo.Adicionar(novoLivro);
				
		assertEquals(acervo.procuraLivro("Iracema").getTitulo(), "Iracema");
		
	}
	@Test
	public void pesquisaLivroParaEmprestimo(){
		
		Livro novoLivro = new Livro("Iracema");
		Acervo acervo = new Acervo();
		
		acervo.Adicionar(novoLivro);
		
		Livro livro = acervo.procuraLivro("Iracema");
		Aluno aluno = new Aluno();	
		Bibliotecario biblio = new Bibliotecario();
		
		biblio.empresta(livro).para(aluno);
		
		livro.EmprestarPara(aluno);
		
		assertTrue(livro.EstaEmprestado());
		assertEquals(1, aluno.QuantidadeEmpestimo());
	}
			

}
