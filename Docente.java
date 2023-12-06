import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Docente extends Pessoa {
    static List<Docente> listaDocentes = new ArrayList<Docente>();
    ArrayList<Curso> cursoD;
    ArrayList<Cadeira> cadeirasD;

    public Docente(String nomeP, String dataNascimento, int idPessoa){
        super(nomeP, dataNascimento, idPessoa);
        
    }

    public static Docente criarNovoDocente(Scanner scanner) {
        System.out.println("Criar um novo Docente:");
        System.out.print("Nome do docente: ");
        String nomeDocente = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimentoDocente = scanner.nextLine();
        System.out.print("ID do docente: ");
        int idDocente = Integer.parseInt(scanner.nextLine());
        
    
        return new Docente(nomeDocente, dataNascimentoDocente, idDocente);
    }
    

    public static void listarDocentes(){
        System.out.println("Lista de Docentes:");
        for (Docente docente : listaDocentes){
            System.out.println("ID: " + docente.getID() + "  Nome: " + docente.getNome() + "  Data de Nascimento: " + docente.getData());
        }    
    }

    public static Docente encontrarDocentePorID(int idDocente) {
        for (Docente docente : listaDocentes) {
            if (docente.getID() == idDocente) {
                return docente;
            }
        }
        return null;
    }

    public void adicionarCadeiraDocente(Cadeira cadeira) {
        if (cadeirasD == null) {
            cadeirasD = new ArrayList<>();
        }
        cadeirasD.add(cadeira);
    }
    
    public static void MostarCadeirasdeDocente(int idDocente){
        Docente docenteEncontrado = encontrarDocentePorID(idDocente);

        if(docenteEncontrado != null){
            System.out.println("Cadeiras do Docente " + "ID:" + docenteEncontrado.idPessoa + " Nome:" + docenteEncontrado.nomeP);

            if (docenteEncontrado.cadeirasD != null && !docenteEncontrado.cadeirasD.isEmpty()) {
                for (Cadeira cadeira : docenteEncontrado.cadeirasD) {
                    System.out.println("ID da Cadeira: " + cadeira.idCadeira + " Nome da Cadeira: " + cadeira.nomeCdr);
                }
            } else {
                System.out.println("O Docente não está inscrito a nenhuma cadeira.");
            }
        } else {
            System.out.println("Docente não encontrado. Não foi possível mostrar as cadeiras.");
        }
    }

    public ArrayList<Curso> getCursosD() { 
        if (this.cursoD == null) {
            this.cursoD = new ArrayList<>();
        }
        return this.cursoD;
    }

    public static void mostrarCursosDeDocente(int idDocente) {
        Docente docente = encontrarDocentePorID(idDocente);

        System.out.println("Cursos do Docente " + docente.getNome() + ":");
        
        for (Curso curso : docente.getCursosD()) {
            if (curso.docentesCrs.contains(docente)) {
                System.out.println("- " + curso.nomeCrs);
            }
        }
    }
}
