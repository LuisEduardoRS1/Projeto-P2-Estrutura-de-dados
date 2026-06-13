public class Fila<T> {
    private T info;
    private No<T> primeiro;
    private No<T> ultimo;
    private int ocupacao = 0;

    public boolean estaVazio(){
        return primeiro == null;
    }

    public void enfileira(T info){
        No<T> novo = new No<>(info);
        if (estaVazio()) {
            primeiro = novo;
        }else{
            ultimo.setProximo(novo);
        }
        ultimo = novo;
        ocupacao++;
    }

    public T desenfileira(){
        if (estaVazio()) {
            throw new FilaVaziaException("Fila vazia");
        }
        T aux = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if(primeiro == null){
            ultimo = null;
        }
        ocupacao--;
        return aux;
    }

    public T primeiro(){
        return primeiro.getInfo();
    }

    public int tamanho(){
        return ocupacao;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (estaVazio()) {
            return "Lista vazia";
        }
        No<T> runner = primeiro;
        while (runner != null) {
            sb.append("[" + runner.getInfo() + "] -> ");
            runner = runner.getProximo();
        }
        sb.append("//");
        return new String(sb);
    }
}
