import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class Curso {
    static List<Curso> listaCursos = new ArrayList<Curso>();
    String nomeCrs;
    int idCurso;
    int notaCrs;
    ArrayList<Aluno> alunosCrs;
    ArrayList<Cadeira> cadeirasCrs;
    int mediaCrs;

    public Curso(String nomeCrs, int idCurso){
        this.nomeCrs = nomeCrs;
        this.idCurso = idCurso;
    }

    public static Curso criarNovoCurso(Scanner scanner) {
        System.out.println("Criar um novo Curso:");
        System.out.print("Nome do Curso: ");
        String nomeCrs = scanner.nextLine();
        System.out.print("ID do Curso: ");
        int idCurso = Integer.parseInt(scanner.nextLine());
        
    
        return new Curso(nomeCrs, idCurso);
    }

    public static void listarCursos(){
        System.out.println("Lista de Cursos:");
        for (Curso curso : listaCursos){
            System.out.println("ID: " + curso.idCurso + "  Nome: " + curso.nomeCrs);
        }    
    }



}





