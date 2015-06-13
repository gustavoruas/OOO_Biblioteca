import java.util.ArrayList;
import java.util.List;

public class Acervo {

	List<Livro> Livros;	

	public Acervo(){
		Livros = new ArrayList<Livro>();
	}
	
	
	public void Adicionar(Livro novoLivro) {		
		Livros.add(novoLivro);		
	}

	public int QuantidadeLivro() {
		return Livros.size();
	}


	public Livro procuraLivro(String titulo) {
		
		for(int i = 0; i < Livros.size(); i++){
			
			if(Livros.get(i).getTitulo().equals(titulo)){
				return Livros.get(i);
			}
			
		}
		
		return null;
	
	}
	
		
	
}
