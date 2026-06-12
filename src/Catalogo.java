public class Catalogo {
    private NossoHash<String, Livro> hmap;

    public Catalogo(){
        hmap = new NossoHash<>();
    }

    public void cadastrar(Livro livro){
        hmap.put(livro.getIsbn(), livro);
    }

    public Livro buscar(String isbn){
        return hmap.get(isbn);
    }

    public boolean existe(String isbn){
        Livro livro = hmap.get(isbn);
        if (livro == null) {
            return false;
        }
        return true;
    }

    public void exibirCatalogo(){
        hmap.exibeMapa();
    }
}
