public class NoDuplo {
    private NoDuplo proximo;
    private NoDuplo anterior;
    private Livro livro;

    public NoDuplo(Livro livro){
        this.livro = livro;
    }

    public NoDuplo getProximo(){
        return proximo;
    }

    public NoDuplo getAnterior(){
        return anterior;
    }

    public void setProximo(NoDuplo proximo){
        this.proximo = proximo;
    }

    public void setAnterior(NoDuplo anterior){
        this.anterior = anterior;
    }

    public Livro getLivro(){
        return livro;
    }
}
