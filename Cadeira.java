import java.util.ArrayList;

public class Cadeira {
    String nomeCdr;
    int idCadeira;
    ArrayList<Aluno> alunosCdr;
    ArrayList<Docente> docentesCdr;
    ArrayList<Curso> cursosCdr;
    int mediaCdr;

    public Cadeira(String nomeCdr, int idCadeira){
        this.nomeCdr = nomeCdr;
        this.idCadeira = idCadeira;
        this.alunosCdr = new ArrayList<Aluno>();
        this.docentesCdr = new ArrayList<Docente>();
    }
}
