import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Leitura {
private Scanner entrada;
private String nomeAluno;
private int num;

private List<Integer> codigos;
public void readData() {
this.entrada = new Scanner(System.in);
System.out.print("Digite o RA do Aluno: ");
this.nomeAluno = entrada.nextLine();
System.out.print("Digite o número de Livros a ser Emprestado: ");
this.num = entrada.nextInt();
this.codigos = new ArrayList<>();
for (int i = 0; i < num; i++) {
System.out.print("Digite o código do livro " + (i + 1) + ": ");
int aux = this.entrada.nextInt();
this.codigos.add(aux);
}
}
public String getNomeAluno() {
return nomeAluno;
}
public int getNum() {
return num;
}
public List<Integer> getCodigos() {
return codigos;
}
}