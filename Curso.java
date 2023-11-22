import java.util.ArrayList;

public class Curso {
    String nomeCrs;
    int idCurso;
    int notaCrs;
    ArrayList<Aluno> alunosCrs;
    ArrayList<Cadeira> cadeirasCrs;
    int mediaCrs;

    public Curso(String nomeCrs){
        this.nomeCrs = nomeCrs;
        this.cadeirasCrs = new ArrayList<Cadeira>();
    }
}
