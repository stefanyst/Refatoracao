public class Item {
private String titulo;
private String autor;

public Item(String titulo, String autor) {
this.titulo = titulo;
this.autor = autor;
}
public String getTitulo() {
return this.titulo;
}
public void setTitulo(String titulo) {
this.titulo = titulo;
}
public String getAutor() {
return this.autor;
}
public void setAutor(String autor) {
this.autor = autor;
}
}