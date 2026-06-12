public class GestorEmprestimos {
    private NossoHash<String, Fila<Usuario>> hmap;

    public GestorEmprestimos(){
        hmap = new NossoHash<>();
    }

    public void solicitarEmprestimo(Livro livro, Usuario u){
        if(livro.getDisponivel()){
            livro.setDisponivel(false);
        }else{
            Fila<Usuario> fila = hmap.get(livro.getIsbn());
            if(fila == null){
                fila = new Fila<>();
            }
            fila.enfileira(u);
        }
    }

    public void devolverLivro(Livro livro){
        Fila<Usuario> fila = hmap.get(livro.getIsbn());
        if(fila == null || fila.estaVazio()){
            System.out.println("Fila vazia");
        }else{
            fila.desenfileira();
        }
        livro.setDisponivel(true);
    }

    public void listarFilaDeEspera(Livro livro){
        Fila<Usuario> fila = hmap.get(livro.getIsbn());
        if(fila == null || fila.estaVazio()){
            System.out.println("Fila vazia");
        }else{
            System.out.println(fila);
        }
    }
}
