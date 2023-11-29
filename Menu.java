import java.util.Scanner;



public class Menu {
    
    
    public static void mostrarMenu() {

            Scanner scanner = new Scanner(System.in);
            int opcao;
    
            do {
                    System.out.println("\n------------------------ MENU ------------------------\n");
                    System.out.println("1. Criar Aluno\n");
                    System.out.println("2. Criar Curso\n");
                    System.out.println("3. Criar Cadeira\n");
                    
                    System.out.println("0. Sair do Programa\n");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
    
                switch (opcao) {
                    case 1:
                        System.out.print("Quantos alunos deseja criar? ");
                        int quantidadeAlunos = Integer.parseInt(scanner.nextLine());
                    
                        for (int i = 0; i < quantidadeAlunos; i++) {
                            Aluno novoAluno = Aluno.criarNovoAluno(scanner);
                            Aluno.listaAlunos.add(novoAluno);
                        }
                    
                        Aluno.listarAlunos();
                            break;
                    case 2:
                        System.out.print("Quantos Cursos deseja criar? ");
                        int quantidadeCursos = Integer.parseInt(scanner.nextLine());
                        
                        for (int i = 0; i < quantidadeCursos; i++) {
                            Curso novoCurso = Curso.criarNovoCurso(scanner);
                            Curso.listaCursos.add(novoCurso);
                        }
                    
                        Curso.listarCursos();
                        break;
                    case 3:
                       System.out.print("Quantas Cadeiras deseja criar? ");
                        int quantidadeCadeiras = Integer.parseInt(scanner.nextLine());
                        
                        for (int i = 0; i < quantidadeCadeiras; i++) {
                            Cadeira novoCadeira = Cadeira.criarNovaCadeira(scanner);
                            Cadeira.listaCadeiras.add(novoCadeira);
                        } 
                    
                        Cadeira.listarCadeiras();
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