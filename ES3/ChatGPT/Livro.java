public class Livro extends Produto {
    private String autor;

    public Livro(Titulo titulo, boolean ilustrado, String autor) {
        super(titulo, ilustrado);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

