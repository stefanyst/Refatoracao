

import java.util.List;
import java.util.Scanner;

public class Leitura {
    
    public Scanner entrada;
    public String nomeAluno;
    public int num;
    public List<Integer> codigos;

    public  void readData(){

        this.entrada = new Scanner(System.in);
        System.out.print("Digite o RA do Aluno: ");
        this.nomeAluno = entrada.nextLine();
        System.out.print("Digite o n�mero de Livros a ser Emprestado: ");
        this.num = entrada.nextInt();
        int aux;
        for(int i=0;i<num;i++)
        {
            System.out.print("Digite o codigo do livro: "+(i+1));
            aux = this.entrada.nextInt();
            this.codigos.add(aux);
        }

    }

}
