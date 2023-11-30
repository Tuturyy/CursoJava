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
        System.out.println("\n");
        for (Aluno aluno : listaAlunos){
            System.out.println("ID: " + aluno.getID());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Data de Nascimento: " + aluno.getData());
            System.out.println("Numero de aluno: " + aluno.numAluno);
        }    
    }

    public static Aluno encontrarAlunoPorID(int idAluno) {
        for (Aluno aluno : Aluno.listaAlunos) {
            if (aluno.getID() == idAluno) {
                return aluno;
            }
        }
        return null;
    }
    

}
