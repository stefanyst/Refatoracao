


public class Aluno {

	private String RA;
	private String nome;
	private Emprestimo emprestimo;
	private Debito debito;

	public Aluno(String nome) {

		this.nome = nome;
		
	}

	public Aluno(String RA, String nome, Debito debito, Emprestimo emprestimo) {

		this.RA = RA;
		this.nome = nome;
		this.debito = debito;
		this.emprestimo = emprestimo;
		
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRA() {
		return this.RA;
	}

	public void setRA(String RA) {
		this.RA = RA;
	}

	public Debito getDebito() {
		return this.debito;
	}

	public void setDebito(Debito debito) {
		this.debito = debito;
	}

	public Emprestimo getEmprestimo(){
		return this.emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo){
		this.emprestimo = emprestimo;
	}



}
