public class Livro extends Produto {

	private Titulo titulo;
	private int codigo;

	public Livro(int codigo) {
    	this.codigo = codigo;
	}

	public Livro(int codigo, Titulo titulo) {
    	this.titulo = titulo;
    	this.codigo = codigo;
	}

	public Titulo getTitulo() {
    	return this.titulo;
	}

	public void setTitulo(Titulo titulo) {
    	this.titulo = titulo;
	}

	public Integer getCodigo() {
    	return this.codigo;
	}

	public void setCodigo(Integer codigo) {
    	this.codigo = codigo;
	}
}
