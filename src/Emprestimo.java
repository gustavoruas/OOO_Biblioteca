import java.util.Calendar;
import java.util.Date;


public class Emprestimo {
	
	private Date data_inicio;
	private Date data_fim;
	private Livro livro;
	
	public Emprestimo(Livro livro){
		this.setLivro(livro);
	}
	
	
	public void para(Aluno aluno) {
		
		//***define datas de emprestimo
		//***cria um empr�stimo com essa data, para o aluno solicitado
		Calendar cal = Calendar.getInstance();
		Emprestimo emp = new Emprestimo();	
		
		emp.setData_inicio(cal.getTime());
				
		cal.add(Calendar.DATE, 7);
		
		emp.setData_fim(cal.getTime());
		//******************************
				
		aluno.AdicionarEmprestimo(emp);
		
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
		
	
}
