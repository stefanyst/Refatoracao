

public class Titulo {

	private int codigo;
	private String nomeTitulo;
	private int prazo;

	public Titulo(int codigo)
	{
		
		this.codigo = codigo;
		this.prazo = codigo+1;
	
	}

	public Titulo(int codigo, String nomeTitulo)
	{
		
		this.codigo = codigo;
		this.prazo = codigo+1;
		this.nomeTitulo = nomeTitulo;

	}

	public Titulo(String nomeTitulo)
	{

		this.nomeTitulo = nomeTitulo;

	}

	public int getPrazo() {
		return this.prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeTitulo() {
		return this.nomeTitulo;
	}

	public void setNomeTitulo(String nomeTitulo) {
		this.nomeTitulo = nomeTitulo;
	}

}