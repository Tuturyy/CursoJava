import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Aluno extends Pessoa{
    static List<Aluno> listaAlunos = new ArrayList<Aluno>();
    int numAluno;
    ArrayList<Curso> CursosA;
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

    public void adicionarCadeiraAluno(Cadeira cadeira) {
        if (cadeirasA == null) {
            cadeirasA = new ArrayList<>();
        }
        cadeirasA.add(cadeira);
    }
    
    public static void MostarCadeirasdeAluno(int idAluno){
        Aluno AlunoEncontrado = encontrarAlunoPorID(idAluno);

        if(AlunoEncontrado != null){
            System.out.println("Cadeiras do Aluno " + "ID:" + AlunoEncontrado.idPessoa + " Nome:" + AlunoEncontrado.nomeP);

            if (AlunoEncontrado.cadeirasA != null && !AlunoEncontrado.cadeirasA.isEmpty()) {
                for (Cadeira cadeira : AlunoEncontrado.cadeirasA) {
                    System.out.println("ID da Cadeira: " + cadeira.idCadeira + " Nome da Cadeira: " + cadeira.nomeCdr);
                }
            } else {
                System.out.println("O aluno não está inscrito a nenhuma cadeira.");
            }
        } else {
            System.out.println("Aluno não encontrado. Não foi possível mostrar as cadeiras.");
        }
    }

    public ArrayList<Curso> getCursosA() { 
        if (this.CursosA == null) {
            this.CursosA = new ArrayList<>();
        }
        return this.CursosA;
    }

    public static void mostrarCursosDeAluno(int idAluno) {
        Aluno aluno = encontrarAlunoPorID(idAluno);

        System.out.println("Cursos do Aluno " + aluno.getNome() + ":");
        
        for (Curso curso : aluno.getCursosA()) {
            if (curso.alunosCrs.contains(aluno)) {
                System.out.println("- " + curso.nomeCrs);
            }
        }
    }
}


