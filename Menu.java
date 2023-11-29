import java.util.Scanner;



public class Menu {
    
    
    public static void mostrarMenu() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("\n------------------------ MENU ------------------------\n");
            System.out.println("1. Criar Aluno\n");
            System.out.println("2. Mostrar lista de Alunos\n");
            System.out.println("3. Criar Curso\n");
            System.out.println("4. Mostrar lista de Cursos\n");
            System.out.println("5. Criar Cadeira\n");
            System.out.println("6. Mostrar lista de Cadeiras\n");
            System.out.println("7. Criar Docente\n");
            System.out.println("8. Mostrar lista de Docente\n");

            System.out.println("0. Sair do Programa\n");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());
    
            do {
                switch (opcao) {
                    case 1:
                        System.out.print("Quantos alunos deseja criar? ");
                        int quantidadeAlunos = Integer.parseInt(scanner.nextLine());
                    
                        for (int i = 0; i < quantidadeAlunos; i++) {
                            Aluno novoAluno = Aluno.criarNovoAluno(scanner);
                            Aluno.listaAlunos.add(novoAluno);
                        }
                        mostrarMenu();
                        break;
                    case 2:
                        Aluno.listarAlunos();
                        mostrarMenu();
                       break;
                    case 3:
                        System.out.print("Quantos Cursos deseja criar? ");
                        int quantidadeCursos = Integer.parseInt(scanner.nextLine());
                        
                        for (int i = 0; i < quantidadeCursos; i++) {
                            Curso novoCurso = Curso.criarNovoCurso(scanner);
                            Curso.listaCursos.add(novoCurso);
                        }
                        mostrarMenu();
                        break;
                    case 4:
                        Curso.listarCursos();
                        mostrarMenu();
                        break;
                    case 5:
                       System.out.print("Quantas Cadeiras deseja criar? ");
                        int quantidadeCadeiras = Integer.parseInt(scanner.nextLine());
                        
                        for (int i = 0; i < quantidadeCadeiras; i++) {
                            Cadeira novoCadeira = Cadeira.criarNovaCadeira(scanner);
                            Cadeira.listaCadeiras.add(novoCadeira);
                        } 
                        mostrarMenu();
                        break;
                    case 6:
                        Cadeira.listarCadeiras();
                        mostrarMenu();
                        break;
                    case 7:
                        System.out.print("Quantos Docentes deseja criar? ");
                        int quantidadeDocentes = Integer.parseInt(scanner.nextLine());
                    
                        for (int i = 0; i < quantidadeDocentes; i++) {
                            Docente novoDocente = Docente.criarNovoDocente(scanner);
                            Docente.listaDocentes.add(novoDocente);
                        }
                        mostrarMenu();
                        break;
                    case 8:
                        Docente.listarDocentes();
                        mostrarMenu();
                        break;
                    case 0:
                        System.out.println("A sair do programa. Adeus!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        
                }
    
            } while (opcao != 0);
    
            scanner.close();
        
    }
    









}

//Criar alunos
        /* Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos deseja criar? ");
        int quantidadeAlunos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantidadeAlunos; i++) {
            Aluno novoAluno = Aluno.criarNovoAluno(scanner);
            Aluno.listaAlunos.add(novoAluno);
        }

        Aluno.listarAlunos();

        scanner.close(); */