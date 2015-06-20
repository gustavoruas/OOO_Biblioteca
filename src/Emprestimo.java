import java.util.Date;


public class Emprestimo {
	
	private Date data_inicio;
	private Date data_fim;
	private Livro livro;
	private Aluno aluno;
	
	public Emprestimo(Livro livro, Date data_inicio, Date data_fim){
		this.setLivro(livro);
		this.setData_inicio(data_inicio);
	}
	
	
	public void para(Aluno aluno) {
									
		setAluno(aluno);
		
	}



	public Date getData_fim() {
		return data_fim;
	}



	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}



	public Date getData_inicio() {
		return data_inicio;
	}



	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}



	public Livro getLivro() {
		return livro;
	}



	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
		
	
}
