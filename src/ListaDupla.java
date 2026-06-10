public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    private int ocupacao = 0;

    private boolean estaVazio() {
        return primeiro == null;
    }

    public void insereInicio(Livro livro) {
        NoDuplo novo = new NoDuplo(livro);
        if (estaVazio()) {
            ultimo = novo;
        } else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
        ocupacao++;
    }

    public void insereFim(Livro livro) {
        NoDuplo novo = new NoDuplo(livro);
        if (estaVazio()) {
            primeiro = novo;
        } else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
        ocupacao++;
    }

    public Livro removeInicio() {
        if (estaVazio()) {
            return null;
        }
        Livro aux = primeiro.getLivro();
        primeiro = primeiro.getProximo();
        if (primeiro == null) {
            ultimo = null;
        } else {
            primeiro.setAnterior(null);
        }
        ocupacao--;
        return aux;
    }

    public Livro removeUltimo() {
        if (estaVazio()) {
            return null;
        }
        Livro aux = ultimo.getLivro();
        ultimo = ultimo.getAnterior();
        if (ultimo == null) {
            primeiro = null;
        } else {
            ultimo.setProximo(null);
        }
        ocupacao--;
        return aux;
    }

    public Livro buscarPorIsbn(String isbn) {
        NoDuplo runner = primeiro;
        while (runner != null) {
            Livro aux = runner.getLivro();
            if (aux.getIsbn().equals(isbn)) {
                return aux;
            }
            runner = runner.getProximo();
        }
        return null;
    }

    public void listarDoInicio(){
        if(estaVazio()){
            System.out.println("A lista está vazia");
        }else{
            NoDuplo runner = primeiro;
            while (runner != null) {
                System.out.println(runner.getLivro());
                runner = runner.getProximo();
            }
        }
    }

    public void listarDoFim(){
        if(estaVazio()){
            System.out.println("A lista está vazia");
        }else{
            NoDuplo runner = ultimo;
            while (runner != null) {
                System.out.println(runner.getLivro());
                runner = runner.getAnterior();
            }
        }
    }

    public int tamanho(){
        return ocupacao;
    }
}
