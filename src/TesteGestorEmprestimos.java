public class TesteGestorEmprestimos {
    public static void main(String[] args) {
        Usuario user1 = new Usuario(001, "Carlos", "carlos@gmail.com");
        Usuario user2 = new Usuario(002, "Manoel", "manoel@gmail.com");
        Usuario user3 = new Usuario(003, "Amanda", "amanda@outlook.com");

        Livro livro1 = new Livro("978-85-430-0067-8", "Java: Como Programar", "Paul Deitel", 2017);
        Livro livro2 = new Livro("978-85-333-0227-3", "Dom Casmurro", "Machado de Assis", 1899);
        Livro livro3 = new Livro("978-85-359-0277-5", "O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        Livro livro4 = new Livro("978-65-5560-302-1", "Entendendo Algoritmos", "Aditya Bhargava", 2017);

        GestorEmprestimos gestor = new GestorEmprestimos();

        gestor.solicitarEmprestimo(livro1, user3);
        gestor.solicitarEmprestimo(livro1, user1);
        gestor.listarFilaDeEspera(livro1);

        gestor.solicitarEmprestimo(livro4, user2);
        gestor.solicitarEmprestimo(livro2, user3);
        gestor.solicitarEmprestimo(livro3, user1);

        gestor.devolverLivro(livro1);
        gestor.listarFilaDeEspera(livro1);
        gestor.devolverLivro(livro1);

        gestor.solicitarEmprestimo(livro4, user3);
        gestor.solicitarEmprestimo(livro4, user2);

        gestor.listarFilaDeEspera(livro4);

        gestor.devolverLivro(livro4);
        gestor.listarFilaDeEspera(livro4);

        gestor.devolverLivro(livro4);
        gestor.listarFilaDeEspera(livro4);




    }
}
