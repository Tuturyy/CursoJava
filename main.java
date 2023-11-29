import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        
        //Criar alunos
         Scanner scanner = new Scanner(System.in);

        /*System.out.print("Quantos alunos deseja criar? ");
        int quantidadeAlunos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantidadeAlunos; i++) {
            Aluno novoAluno = Aluno.criarNovoAluno(scanner);
            Aluno.listaAlunos.add(novoAluno);
        }

        Aluno.listarAlunos();
        
        System.out.print("Quantos Cursos deseja criar? ");
        int quantidadeCursos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantidadeCursos; i++) {
            Curso novoCurso = Curso.criarNovoCurso(scanner);
            Curso.listaCursos.add(novoCurso);
        }

        Curso.listarCursos();

        */


        System.out.print("Quantas Cadeiras deseja criar? ");
        int quantidadeCadeiras = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantidadeCadeiras; i++) {
            Cadeira novoCadeira = Cadeira.criarNovaCadeira(scanner);
            Cadeira.listaCadeiras.add(novoCadeira);
        }

        Cadeira.listarCadeiras();

        scanner.close(); 



    }

}