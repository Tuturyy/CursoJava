import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadeira {
    static List<Cadeira> listaCadeiras = new ArrayList<Cadeira>();
    String nomeCdr;
    int idCadeira;
    ArrayList<Aluno> alunosCdr;
    ArrayList<Docente> docentesCdr;
    ArrayList<Curso> cursosCdr;
    int mediaCdr;

    public Cadeira(String nomeCdr, int idCadeira){
        this.nomeCdr = nomeCdr;
        this.idCadeira = idCadeira;
    }

    public static Cadeira criarNovaCadeira(Scanner scanner) {
        System.out.println("Criar uma nova Cadeira:");
        System.out.print("Nome da Cadeira: ");
        String nomeCdr = scanner.nextLine();
        System.out.print("ID da Cadeira: ");
        int idCadeira = Integer.parseInt(scanner.nextLine());
        
    
        return new Cadeira(nomeCdr, idCadeira);
    }

    public static void listarCadeiras(){
        System.out.println("Lista de Cadeiras:");
        for (Cadeira cadeira : listaCadeiras){
            System.out.println("ID: " + cadeira.idCadeira + "  Nome: " + cadeira.nomeCdr);
        }    
    }

    public static Cadeira encontrarCadeiraPorID(int idCadeira) {
        for (Cadeira cadeira : listaCadeiras) {
            if (cadeira.idCadeira == idCadeira) {
                return cadeira;
            }
        }
        return null;
    }

}
