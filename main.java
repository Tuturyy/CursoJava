import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        
        //Criar alunos
         Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos deseja criar? ");
        int quantidadeAlunos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantidadeAlunos; i++) {
            Aluno novoAluno = Aluno.criarNovoAluno(scanner);
            Aluno.listaAlunos.add(novoAluno);
        }

        Aluno.listarAlunos();

        scanner.close(); 
    }
}