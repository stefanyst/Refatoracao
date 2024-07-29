public class Titulo {
private int codigo;
private String nomeTitulo;
private int prazo;
public Titulo(int codigo) {
this.codigo = codigo;
this.prazo = codigo + 1;
}
public Titulo(int codigo, String nomeTitulo) {
this.codigo = codigo;
this.nomeTitulo = nomeTitulo;
this.prazo = codigo + 1;
}
public Titulo(String nomeTitulo) {
this.nomeTitulo = nomeTitulo;
}
public int getPrazo() {
return prazo;
}
public void setPrazo(int prazo) {
this.prazo = prazo;
}
public int getCodigo() {
return codigo;
}
public void setCodigo(int codigo) {
this.codigo = codigo;
}
public String getNomeTitulo() {
return nomeTitulo;
}

public void setNomeTitulo(String nomeTitulo) {
this.nomeTitulo = nomeTitulo;
}
}