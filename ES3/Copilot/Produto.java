public class Produto {
    private Titulo titulo;
    private boolean ilustrado;

    public Produto(Titulo titulo, boolean ilustrado) {
        this.titulo = titulo;
        this.ilustrado = ilustrado;
    }

    public Titulo getTitulo() {
        return this.titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public boolean isIlustrado() {
        return this.ilustrado;
    }

    public void setIlustrado(boolean ilustrado) {
        this.ilustrado = ilustrado;
    }
}
