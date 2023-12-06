import java.util.Scanner;

public class Menu {

    public static void mostrarMenu(Scanner scanner) {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Submenu Alunos");
            System.out.println("2. Submenu Docentes");
            System.out.println("3. Submenu Cadeiras");
            System.out.println("4. Submenu Cursos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    mostrarSubmenuAlunos(scanner);
                    break;
                case 2:
                    mostrarSubmenuDocentes(scanner);
                    break;
                case 3:
                    mostrarSubmenuCadeiras(scanner);
                    break;
                case 4:
                    mostrarSubmenuCurso(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void mostrarSubmenuAlunos(Scanner scanner){
        int opcao;
        do
        {
            System.out.println("1. Criar novo Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Inscrever Aluno a Cadeira");
            System.out.println("4. Inscrever Aluno a todas as cadeiras de um curso");
            System.out.println("5. Listar Cadeiras de Alunos");
            System.out.println("6. Inscrever Aluno a Curso");
            System.out.println("7. Listar Cursos de Aluno");
            System.out.println("0. Voltar ao Menu Principal");
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
                    System.out.print("ID do Aluno: ");
                    int idAlunoCadeira = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID da Cadeira: ");
                    int idCadeiraAluno = Integer.parseInt(scanner.nextLine());

                    Aluno AlunoCadeira = Aluno.encontrarAlunoPorID(idAlunoCadeira);
                    Cadeira CadeiraAluno = Cadeira.encontrarCadeiraPorID(idCadeiraAluno);

                    if (AlunoCadeira != null && CadeiraAluno != null) {
                        AlunoCadeira.adicionarCadeiraAluno(CadeiraAluno);
                        System.out.println("Cadeira adicionada ao aluno com sucesso!");
                    } else {
                        System.out.println("Aluno ou cadeira não encontrado. Não foi possível realizar a inscrição.");
                    }
                    break;
                case 4:
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
                case 5:
                    System.out.print("ID do Aluno: ");
                    int idAlunoMostrarCadeiras = Integer.parseInt(scanner.nextLine());
                    Aluno.MostarCadeirasdeAluno(idAlunoMostrarCadeiras);
                case 6:
                    System.out.print("ID do Curso: ");
                    int idCursoAluno = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID do Aluno: ");
                    int idAluno = Integer.parseInt(scanner.nextLine());
                    Curso.adicionarAlunoPorID(idCursoAluno, idAluno);
                    break;
                case 7:
                    System.out.print("ID do Aluno: ");
                    int idAlunoMostrarCurso = Integer.parseInt(scanner.nextLine());
                    Aluno.mostrarCursosDeAluno(idAlunoMostrarCurso);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal");
                    break;
            }
        }
        while(opcao != 0);
    }

    public static void mostrarSubmenuDocentes(Scanner scanner){
        int opcao;
        do
        {
            System.out.println("1. Criar novo Docente");
            System.out.println("2. Listar Docentes");
            System.out.println("3. Inscrever Docente a Cadeira");
            System.out.println("4. Inscrever Docente a todas as cadeiras de um curso");
            System.out.println("5. Listar Cadeiras de Docente");
            System.out.println("6. Inscrever Docente a Curso");
            System.out.println("7. Listar Cursos de Docente");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    Docente novoDocente = Docente.criarNovoDocente(scanner);
                    Docente.listaDocentes.add(novoDocente);
                    break;
                case 2:
                    Docente.listarDocentes();
                    break;
                case 3:
                    System.out.print("ID do Docente: ");
                    int idDocenteCadeira = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID da Cadeira: ");
                    int idcadeiraDocente = Integer.parseInt(scanner.nextLine());

                    Docente DocenteCadeira = Docente.encontrarDocentePorID(idDocenteCadeira);
                    Cadeira CadeiraDocente = Cadeira.encontrarCadeiraPorID(idcadeiraDocente);

                    if (DocenteCadeira != null && CadeiraDocente != null) {
                        DocenteCadeira.adicionarCadeiraDocente(CadeiraDocente);
                        System.out.println("Cadeira adicionada ao Docente com sucesso!");
                    } else {
                        System.out.println("Docente ou cadeira não encontrado. Não foi possível realizar a inscrição.");
                    }
                    break;
                case 4:
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
                case 5:
                    System.out.print("ID do Docente: ");
                    int idDocenteMostrarCadeira = Integer.parseInt(scanner.nextLine());
                    Aluno.MostarCadeirasdeAluno(idDocenteMostrarCadeira);
                    break;
                case 6:
                    System.out.print("ID do Curso: ");
                    int idCursoDocente = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID do Docente: ");
                    int idDocente = Integer.parseInt(scanner.nextLine());
                    Curso.adicionarDocentePorID(idCursoDocente, idDocente);
                    break;
                case 7:
                    System.out.print("ID do Docente: ");
                    int idDocenteMostrarCurso = Integer.parseInt(scanner.nextLine());
                    Docente.mostrarCursosDeDocente(idDocenteMostrarCurso);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal");
                    break;
            }
        }
        while(opcao != 0);
    }

    public static void mostrarSubmenuCadeiras(Scanner scanner){
        int opcao;
        do
        {
            System.out.println("5. Criar nova Cadeira");
            System.out.println("6. Mostrar Cadeiras");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    Cadeira novaCadeira = Cadeira.criarNovaCadeira(scanner);
                    Cadeira.listaCadeiras.add(novaCadeira);
                    break;
                case 2:
                    Cadeira.listarCadeiras();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal");
                    break;
            }
        }
        while(opcao != 0);
    }

    public static void mostrarSubmenuCurso(Scanner scanner){
        int opcao;
        do
        {
            System.out.println("1. Criar novo Curso");
            System.out.println("2. Listar Cursos");
            System.out.println("3. Inscrever Aluno a Curso");
            System.out.println("4. Listar Alunos de um Curso");
            System.out.println("5. Inscrever Docente a Curso");
            System.out.println("6. Listar Docentes de um Curso");
            System.out.println("7. Adicionar Cadeira a Curso");
            System.out.println("8. Listar Cadeiras de um Curso");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    Curso novoCurso = Curso.criarNovoCurso(scanner);
                    Curso.listaCursos.add(novoCurso);
                    break;
                case 2:
                    Curso.listarCursos();
                    break;
                case 3:
                    System.out.print("ID do Curso: ");
                    int idCursoAluno = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID do Aluno: ");
                    int idAluno = Integer.parseInt(scanner.nextLine());
                    Curso.adicionarAlunoPorID(idCursoAluno, idAluno);
                    break;
                case 4:
                    System.out.print("ID do Curso: ");
                    int idCursoMostrarAlunos = Integer.parseInt(scanner.nextLine());
                    Curso.mostrarAlunosDoCurso(idCursoMostrarAlunos);
                    break;
                case 5:
                    System.out.print("ID do Curso: ");
                    int idCursoDocente = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID do Docente: ");
                    int idDocente = Integer.parseInt(scanner.nextLine());
                    Curso.adicionarDocentePorID(idCursoDocente, idDocente);
                    break;
                case 6:
                    System.out.print("ID do Curso: ");
                    int idCursoMostrarDocentes = Integer.parseInt(scanner.nextLine());
                    Curso.mostrarDocentesDoCurso(idCursoMostrarDocentes);
                    break;
                 case 7:
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
                case 8:
                    System.out.print("ID do Curso: ");
                    int idCursoMostrarCadeiras = Integer.parseInt(scanner.nextLine());
                    Curso.mostrarCadeirasDoCurso(idCursoMostrarCadeiras);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal");
                    break;
            }
        }
        while(opcao != 0);
    }
}