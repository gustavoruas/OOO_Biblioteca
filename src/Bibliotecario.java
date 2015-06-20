
import java.util.Calendar;
import java.util.Date;


public class Bibliotecario {

	public Emprestimo empresta(Livro livro) {
		
		Calendar cal = Calendar.getInstance();
		
		//data efetuada no emprestimo
		Date today = cal.getTime();
		
		//data efetuada para devoluçao
		cal.add(Calendar.DATE, 7);
		Date entrega = cal.getTime();
		
		return new Emprestimo(livro,today,entrega);		
		
	}

}
