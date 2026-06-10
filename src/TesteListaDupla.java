public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        Livro livro1 = new Livro("978-85-430-0067-8", "Java: Como Programar", "Paul Deitel", 2017);
        Livro livro2 = new Livro("978-85-333-0227-3", "Dom Casmurro", "Machado de Assis", 1899);
        Livro livro3 = new Livro("978-85-359-0277-5", "O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        Livro livro4 = new Livro("978-65-5560-302-1", "Entendendo Algoritmos", "Aditya Bhargava", 2017);

        lista.insereInicio(livro1);
        lista.listarDoInicio();
        System.out.println("");
        lista.insereInicio(livro2);
        lista.listarDoInicio();
        System.out.println("");
        lista.listarDoFim();
        System.out.println("");
        lista.insereFim(livro3);
        lista.listarDoInicio();
        System.out.println("");
        lista.listarDoFim();
        System.out.println("");
        lista.removeInicio();
        lista.listarDoInicio();

        System.out.println(lista.buscarPorIsbn("978-65-5560-302-1"));
        System.out.println(lista.buscarPorIsbn("978-85-430-0067-8"));
        System.out.println(lista.tamanho());
        System.out.println("");
        lista.removeUltimo();
        lista.listarDoFim();
        lista.removeUltimo();
        lista.listarDoInicio();
        System.out.println(lista.removeInicio());



    }
}
