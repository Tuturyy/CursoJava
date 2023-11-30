import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class Curso {
    static List<Curso> listaCursos = new ArrayList<Curso>();
    String nomeCrs;
    int idCurso;
    int notaCrs;
    static ArrayList<Aluno> alunosCrs;
    ArrayList<Cadeira> cadeirasCrs;
    ArrayList<Docente> docentesCrs;
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

    public static Curso encontrarCursoPorID(int idCurso) {
        for (Curso curso : listaCursos) {
            if (curso.idCurso == idCurso) {
                return curso;
            }
        }
        return null;
    }

    public void adicionarAlunoCurso(Aluno aluno) {
        if (alunosCrs == null) {
            alunosCrs = new ArrayList<>();
        }
        alunosCrs.add(aluno);
    }

    public static void adicionarAlunoPorID(int idCurso, int idAluno) {

        Curso cursoEncontrado = encontrarCursoPorID(idCurso);

        Aluno alunoEncontrado = Aluno.encontrarAlunoPorID(idAluno);

        if (cursoEncontrado != null && alunoEncontrado != null) {
            cursoEncontrado.adicionarAlunoCurso(alunoEncontrado);
            System.out.println("Aluno inscrito com sucesso no curso!");
        } else {
            System.out.println("Curso ou aluno não encontrado. Não foi possível realizar a inscrição.");
        }
    }

    public static void mostrarAlunosDoCurso(int idCurso) {
        for (Curso curso : Curso.listaCursos) {
            if (curso.idCurso == idCurso) {
                System.out.println("Alunos matriculados no curso " + curso.nomeCrs + ":");
        if (alunosCrs != null) {
            for (Aluno aluno : alunosCrs) {
                System.out.println("ID do Aluno: " + aluno.getID() + " Nome do Aluno: " + aluno.getNome());
            }
        } else {
            System.out.println("Nenhum aluno matriculado neste curso.");
        }
            }
        }
    }

    public void adicionarDocenteCurso(Docente docente) {
        if (docentesCrs == null) {
            docentesCrs = new ArrayList<>();
        }
        docentesCrs.add(docente);
    }

    public static void adicionarDocentePorID(int idCurso, int idDocente) {

        Curso cursoEncontrado = encontrarCursoPorID(idCurso);

        Docente docenteEncontrado = Docente.encontrarDocentePorID(idDocente);

        if (cursoEncontrado != null && docenteEncontrado != null) {
            cursoEncontrado.adicionarDocenteCurso(docenteEncontrado);
            System.out.println("Docente adicionado com sucesso no curso!");
        } else {
            System.out.println("Curso ou docente não encontrado. Não foi possível realizar a adição.");
        }
    }

    public static void mostrarDocentesDoCurso(int idCurso) {
        for (Curso curso : Curso.listaCursos) {
            if (curso.idCurso == idCurso) {
                System.out.println("Docentes a lecionar no curso " + curso.nomeCrs + ":\n");
        if (alunosCrs != null) {
            for (Aluno aluno : alunosCrs) {
                System.out.println("ID do Docente: " + aluno.getID());
                System.out.println("Nome do Docente: " + aluno.getNome());
            }
        } else {
            System.out.println("Nenhum aluno matriculado neste curso.");
        }
            }
        }
    }












    public void adicionarCadeiraCurso(Cadeira cadeira) {
        if (cadeirasCrs == null) {
            cadeirasCrs = new ArrayList<>();
        }
        cadeirasCrs.add(cadeira);
    }

    public static void adicionarCadeiraPorID(int idCurso, int idCadeira) {
        Curso cursoEncontrado = encontrarCursoPorID(idCurso);
        Cadeira cadeiraEncontrada = Cadeira.encontrarCadeiraPorID(idCadeira);
    
        if (cursoEncontrado != null && cadeiraEncontrada != null) {
            cursoEncontrado.adicionarCadeiraCurso(cadeiraEncontrada);
            System.out.println("Cadeira adicionada com sucesso ao curso!");
        } else {
            System.out.println("Curso ou cadeira não encontrado. Não foi possível realizar a adição.");
        }
    }

    public static void mostrarCadeirasDoCurso(int idCurso) {
        Curso cursoEncontrado = encontrarCursoPorID(idCurso);
    
        if (cursoEncontrado != null) {
            System.out.println("Cadeiras do curso " + cursoEncontrado.nomeCrs + ":");
    
            if (cursoEncontrado.cadeirasCrs != null && !cursoEncontrado.cadeirasCrs.isEmpty()) {
                for (Cadeira cadeira : cursoEncontrado.cadeirasCrs) {
                    System.out.println("ID da Cadeira: " + cadeira.idCadeira + " Nome da Cadeira: " + cadeira.nomeCdr);
                }
            } else {
                System.out.println("Nenhuma cadeira cadastrada neste curso.");
            }
        } else {
            System.out.println("Curso não encontrado. Não foi possível mostrar as cadeiras.");
        }
    }












    public void AdicionarAlunoCadeirasCurso(Aluno aluno) {
        for (Cadeira cadeira : cadeirasCrs) {
            if (cadeira.alunosCdr == null) {
                cadeira.alunosCdr = new ArrayList<>();
            }
            cadeira.alunosCdr.add(aluno);
        }
    }

    public void AdicionarDocenteCadeirasCurso(Docente docente) {
        for (Cadeira cadeira : cadeirasCrs) {
            if (cadeira.docentesCdr == null) {
                cadeira.docentesCdr = new ArrayList<>();
            }
            cadeira.docentesCdr.add(docente);
        }
    }
}





