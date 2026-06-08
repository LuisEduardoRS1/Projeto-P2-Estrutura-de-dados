public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anoPub;
    private boolean disponivel;

    public Livro(String isnb, String titulo, String autor, int anoPub){
        this.isbn = isnb;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        disponivel = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    @Override
    public String toString(){
        String textoDisponivel = "";
        if(disponivel){
            textoDisponivel = "DISPONIVEL";
        }else{
            textoDisponivel = "NÃO DISPONIVEL";
        }
        return "[" + isbn + "]" + " " + titulo + " - " + autor + " (" + anoPub + ") [" + textoDisponivel + "]";
    }

    public boolean equals(String isbn){
        if(this.isbn.equals(isbn)){
            return true;
        }
        return false;
    }
}
