import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leitura {
    
	private Scanner entrada;
	private String nomeAluno;
	private int num;
	private List<Integer> codigos;

	public Leitura() {
    	this.entrada = new Scanner(System.in);
    	this.codigos = new ArrayList<>();
	}

	public void readData() {
    	System.out.print("Digite o RA do Aluno: ");
    	this.nomeAluno = entrada.nextLine();
    	System.out.print("Digite o número de Livros a ser Emprestado: ");
    	this.num = entrada.nextInt();
    	int aux;
    	for (int i = 0; i < num; i++) {
        	System.out.print("Digite o código do livro " + (i + 1) + ": ");
        	aux = this.entrada.nextInt();
        	this.codigos.add(aux);
    	}
	}

	// Getters and setters...
}
