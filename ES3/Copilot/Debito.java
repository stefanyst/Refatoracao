public class Debito {
	private int codigoAluno;

	public Debito(int aluno) {
    	this.codigoAluno = aluno;
	}

	public Integer getCodigoAluno() {
    	return this.codigoAluno;
	}

	public void setCodigoAluno(Integer codigoAluno) {
    	this.codigoAluno = codigoAluno;
	}
}

public class DebitoService {
	private Debito debito;

	public DebitoService(Debito debito) {
    	this.debito = debito;
	}

	public Debito getDebito() {
    	return this.debito;
	}

	public void setDebito(Debito debito) {
    	this.debito = debito;
	}

	public boolean verificaDebito() {
    	return this.debito.getCodigoAluno() != 4;
	}
}
