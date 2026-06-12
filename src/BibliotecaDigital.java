import java.util.Scanner;

public class BibliotecaDigital {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        ListaDupla acervo = new ListaDupla();
        GestorEmprestimos gestor = new GestorEmprestimos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema da Biblioteca");
        int input = 10;

        while (input != 0) {
            System.out.println("\nEscolha o que deseja realizar:");
            System.out.println(
                    "[1] Cadastrar um livro\n[2] Buscar um livro pelo ISBN\n[3] Listar acervo do inicio ao fim\n[4] Listar acervo do fim ao inicio\n[5] Solicitar empréstimo\n[6] Devolver um livro\n[7] Ver a fila de espera de um livro\n[0] Sair do sistema");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    System.out.println("\nDigite os dados do Livro");
                    System.out.println("Digite o ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.println("Digite o titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o nome do autor: ");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o ano de publicação: ");
                    int anoPub = scanner.nextInt();

                    Livro livro = new Livro(isbn, titulo, autor, anoPub);

                    acervo.insereInicio(livro);
                    catalogo.cadastrar(livro);
                    System.out.println("Livro cadastrado com sucesso");
                    break;

                case 2:
                    System.out.println("\nDigite o ISBN do livro: ");
                    String isbnBusca = scanner.nextLine();
                    Livro livroBuscado = catalogo.buscar(isbnBusca);
                    if (livroBuscado != null) {
                        System.out.println(livroBuscado);
                    } else {
                        System.out.println("O livro não foi encontrado");
                    }

                    break;

                case 3:
                    System.out.println("\nLista:");
                    acervo.listarDoInicio();
                    System.out.println("-------------------------------");
                    break;

                case 4:
                    System.out.println("\nLista:");
                    acervo.listarDoFim();
                    System.out.println("-------------------------------");
                    break;

                case 5:
                    System.out.println("\nInforme os seus dados: ");
                    System.out.println("Matricula: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Seu nome: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.println("Seu e-mail: ");
                    String email = scanner.nextLine();

                    Usuario user = new Usuario(matricula, nomeUsuario, email);

                    System.out.println("Digite o ISBN do livro: ");
                    String isbnEmprestimo = scanner.nextLine();

                    Livro livroEmprestimo = catalogo.buscar(isbnEmprestimo);

                    if (livroEmprestimo == null) {
                        System.out.println("Livro não encontrado");
                    } else {
                        gestor.solicitarEmprestimo(livroEmprestimo, user);
                        System.out.println("Livro emprestado!");
                    }
                    break;

                case 6:
                    System.out.println("\nDigite o ISBN do livro: ");
                    String isbnDevolucao = scanner.nextLine();
                    Livro livroDevolucao = catalogo.buscar(isbnDevolucao);
                    if (livroDevolucao == null) {
                        System.out.println("LIvro não encontrado");
                    } else {
                        gestor.devolverLivro(livroDevolucao);
                        System.out.println("O livro foi devolvido");
                    }
                    break;

                case 7:
                    System.out.println("\nDigite o ISBN do livro: ");
                    String isbnFila = scanner.nextLine();
                    Livro livroFila = catalogo.buscar(isbnFila);
                    if (livroFila == null) {
                        System.out.println("Livro não encontrado");
                    } else {
                        gestor.listarFilaDeEspera(livroFila);
                    }
                    break;
            }
        }
        System.out.println("\nObrigado por utilizar o sistema");
    }
}
