import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Aluno extends Pessoa{
    static List<Aluno> listaAlunos = new ArrayList<Aluno>();
    int numAluno;
    String cursoA;
    ArrayList<Cadeira> cadeirasA;
    int mediaA;

    public Aluno(String nomeP, String dataNascimento, int idPessoa, int numAluno){
        super(nomeP, dataNascimento, idPessoa);
        this.numAluno = numAluno;
    }

    public static Aluno criarNovoAluno(Scanner scanner) {
        System.out.println("Criar um novo Aluno:");
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimentoAluno = scanner.nextLine();
        System.out.print("ID do aluno: ");
        int idAluno = Integer.parseInt(scanner.nextLine());
        System.out.print("Número do aluno: ");
        int numAluno = Integer.parseInt(scanner.nextLine());
    
        return new Aluno(nomeAluno, dataNascimentoAluno, idAluno, numAluno);
    }
    

    public static void listarAlunos(){
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : listaAlunos){
            System.out.println("ID: " + aluno.getID() + "  Nome: " + aluno.getNome() + "  Data de Nascimento: " + aluno.getData() + "  Numero de aluno: " + aluno.numAluno);
        }    
    }

}
