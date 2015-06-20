import static org.junit.Assert.*;

import java.awt.List;

import org.mockito.Spy;
import static org.mockito.Mockito.*;
import org.junit.Test;


public class bilioteca {

	@Test
	public void cadastrarLivro() {
		
		Livro novoLivro = new Livro();
	
		Acervo acervo = new Acervo();
		
		acervo.adicionar(novoLivro);
		
		assertEquals(1, acervo.QuantidadeLivro());
	}
	
	@Test
	public void pesquisaLivro(){
		
		Livro novoLivro = new Livro("Iracema");
		Acervo acervo = new Acervo();
		
		acervo.adicionar(novoLivro);
				
		assertEquals(acervo.procuraLivro("Iracema").getTitulo(), "Iracema");
		
	}
	
	@Test
	public void pesquisaLivroParaEmprestimo(){
		
		Livro novoLivro = new Livro("Iracema");
		Acervo acervo = new Acervo();
		
		acervo.adicionar(novoLivro);
		
		Livro livro = acervo.procuraLivro("Iracema");
		Aluno aluno = new Aluno();	
		Bibliotecario biblio = new Bibliotecario();
		
		biblio.empresta(livro).para(aluno);
		
		livro.EmprestarPara(aluno);
		
		assertTrue(livro.EstaEmprestado());
		assertEquals(1, aluno.QuantidadeEmpestimo());
		
	}
	
	@Test
	public void renovarEmprestimoLivro(){
		Livro novoLivro = new Livro("Iracema");
		Acervo acervo = new Acervo();
		
		acervo.adicionar(novoLivro);
				
		Aluno alu = new Aluno();
		Bibliotecario biblio = new Bibliotecario();
		
		biblio.empresta(novoLivro).para(alu);
		
		alu.renovaEmprestimo();
		
		//Fazer com que mais uma semana seja adicionado, valida assert se � maior que mais uma data
		//declarar aqui Calendar 
		assertEquals(1, alu.QuantidadeEmpestimo());
		
	}
	
	@Test
	//Test with Mock
	public void deveCadastrarMilLivors(){
		Acervo acervo = new Acervo();
		
		Acervo acervSpy = spy(acervo);
		
		when(acervSpy.QuantidadeLivro()).thenReturn(1000);
		assertEquals(0, acervo.QuantidadeLivro());
		assertEquals(1000, acervSpy.QuantidadeLivro());
		
		
	}

			

}
