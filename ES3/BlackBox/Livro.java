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

return titulo;
}
public void setTitulo(Titulo titulo) {
this.titulo = titulo;
}
public int getCodigo() {
return codigo;
}
public void setCodigo(int codigo) {
this.codigo = codigo;
}
}