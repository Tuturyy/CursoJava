import java.util.Scanner;

public class Menu {

    public static void mostrarMenu(Scanner scanner) {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Criar novo Aluno");
            System.out.println("2. Mostrar Alunos");
            System.out.println("3. Criar novo Docente");
            System.out.println("4. Mostrar Docentes");
            System.out.println("5. Criar nova Cadeira");
            System.out.println("6. Mostrar Cadeiras");
            System.out.println("7. Criar novo Curso");
            System.out.println("8. Mostrar Curso");
            System.out.println("9. Adicionar Aluno a Curso");
            System.out.println("10. Mostrar Alunos de um Curso");
            System.out.println("11. Adicionar Docente a Curso");
            System.out.println("12. Mostrar Docentes de um Curso");
            System.out.println("13. Adicionar Cadeira a Curso");
            System.out.println("14. Mostrar Cadeiras de um Curso");
            System.out.println("15. Adicionar Aluno a todas as cadeiras de um curso");
            System.out.println("16. Adicionar Docente a todas as cadeiras de um curso");
            System.out.println("17. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    Aluno novoAluno = Aluno.criarNovoAluno(scanner);
                    Aluno.listaAlunos.add(novoAluno);
                    break;
                case 2:
                    Aluno.listarAlunos();
                    break;
                case 3:
                    Docente novoDocente = Docente.criarNovoDocente(scanner);
                    Docente.listaDocentes.add(novoDocente);
                    break;
                case 4:
                    Docente.listarDocentes();
                    break;
                case 5:
                    Cadeira novaCadeira = Cadeira.criarNovaCadeira(scanner);
                    Cadeira.listaCadeiras.add(novaCadeira);
                    break;
                case 6:
                    Cadeira.listarCadeiras();
                    break;
                case 7:
                    Curso novoCurso = Curso.criarNovoCurso(scanner);
                    Curso.listaCursos.add(novoCurso);
                    break;
                case 8:
                    Curso.listarCursos();
                    break;
                case 9:
                    System.out.print("ID do Curso: ");
                    int idCursoAluno = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID do Aluno: ");
                    int idAluno = Integer.parseInt(scanner.nextLine());
                    Curso.adicionarAlunoPorID(idCursoAluno, idAluno);
                    break;
                case 10:
                    System.out.print("ID do Curso: ");
                    int idCursoMostrarAlunos = Integer.parseInt(scanner.nextLine());
                    Curso.mostrarAlunosDoCurso(idCursoMostrarAlunos);
                    break;
                case 11:
                    System.out.print("ID do Curso: ");
                    int idCursoDocente = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID do Docente: ");
                    int idDocente = Integer.parseInt(scanner.nextLine());
                    Curso.adicionarDocentePorID(idCursoDocente, idDocente);
                    break;
                case 12:
                    System.out.print("ID do Curso: ");
                    int idCursoMostrarDocentes = Integer.parseInt(scanner.nextLine());
                    Curso.mostrarDocentesDoCurso(idCursoMostrarDocentes);
                    break;
                case 13:
                    System.out.print("ID do Curso: ");
                    int idCursoCadeira = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID da Cadeira: ");
                    int idCadeiraCurso = Integer.parseInt(scanner.nextLine());

                    Curso cursoCadeira = Curso.encontrarCursoPorID(idCursoCadeira);
                    Cadeira cadeiraCurso = Cadeira.encontrarCadeiraPorID(idCadeiraCurso);

                    if (cursoCadeira != null && cadeiraCurso != null) {
                        cursoCadeira.adicionarCadeiraCurso(cadeiraCurso);
                        System.out.println("Cadeira adicionada ao curso com sucesso!");
                    } else {
                        System.out.println("Curso ou cadeira não encontrado. Não foi possível realizar a adição.");
                    }
                    break;
                case 14:
                    System.out.print("ID do Curso: ");
                    int idCursoMostrarCadeiras = Integer.parseInt(scanner.nextLine());
                    Curso.mostrarCadeirasDoCurso(idCursoMostrarCadeiras);
                    break;
                case 15:
                    System.out.print("ID do Curso: ");
                    int idCursoAlunoCadeiras = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID do Aluno: ");
                    int idAlunoCadeiras = Integer.parseInt(scanner.nextLine());
                    
                    Curso cursoAlunoCadeiras = Curso.encontrarCursoPorID(idCursoAlunoCadeiras);
                    Aluno alunoCadeiras = Aluno.encontrarAlunoPorID(idAlunoCadeiras);
                    
                    if (cursoAlunoCadeiras != null && alunoCadeiras != null) {
                        cursoAlunoCadeiras.AdicionarAlunoCadeirasCurso(alunoCadeiras);
                        System.out.println("Aluno adicionado a todas as cadeiras do curso!");
                    } else {
                        System.out.println("Curso ou aluno não encontrado. Não foi possível realizar a adição.");
                    }
                    break;
                case 16:
                    System.out.print("ID do Curso: ");
                    int idCursoDocenteCadeiras = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID do Docente: ");
                    int idDocenteCadeiras = Integer.parseInt(scanner.nextLine());

                    Curso cursoDocenteCadeiras = Curso.encontrarCursoPorID(idCursoDocenteCadeiras);
                    Docente docenteCadeiras = Docente.encontrarDocentePorID(idDocenteCadeiras);

                    if (cursoDocenteCadeiras != null && docenteCadeiras != null) {
                        cursoDocenteCadeiras.AdicionarDocenteCadeirasCurso(docenteCadeiras);
                        System.out.println("Docente adicionado a todas as cadeiras do curso!");
                    } else {
                        System.out.println("Curso ou docente não encontrado. Não foi possível realizar a adição.");
                    }
                    break;
                case 17:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 17);
    }
}