import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Docente extends Pessoa {
    static List<Docente> listaDocentes = new ArrayList<Docente>();
    int numDocente;
    ArrayList<Curso> cursoD;
    ArrayList<Cadeira> cadeirasD;

    public Docente(String nomeP, String dataNascimento, int idPessoa, int numDocente){
        super(nomeP, dataNascimento, idPessoa);
        this.numDocente = numDocente;
    }

    public static Docente criarNovoDocente(Scanner scanner) {
        System.out.println("Criar um novo Docente:");
        System.out.print("Nome do docente: ");
        String nomeDocente = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimentoDocente = scanner.nextLine();
        System.out.print("ID do docente: ");
        int idDocente = Integer.parseInt(scanner.nextLine());
        System.out.print("Número do docente: ");
        int numDocente = Integer.parseInt(scanner.nextLine());
    
        return new Docente(nomeDocente, dataNascimentoDocente, idDocente, numDocente);
    }
    

    public static void listarDocentes(){
        System.out.println("Lista de Docentes:");
        for (Docente docente : listaDocentes){
            System.out.println("ID: " + docente.getID() + "  Nome: " + docente.getNome() + "  Data de Nascimento: " + docente.getData() + "  Numero de aluno: " + docente.numDocente);
        }    
    }
}
