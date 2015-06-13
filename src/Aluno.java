import java.util.ArrayList;
import java.util.List;


public class Aluno {

	private List<Emprestimo> emprestimos;
	
	public Aluno(){
		emprestimos = new ArrayList<Emprestimo>();		
	}
	
	public int QuantidadeEmpestimo() {
		return emprestimos.size();
	}

	public void AdicionarEmprestimo(Emprestimo emprestimo) {
		
		emprestimos.add(emprestimo);
		
	}

}
