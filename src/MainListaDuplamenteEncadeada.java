import java.util.List;

public class MainListaDuplamenteEncadeada {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adicionar(1);
        lista.adicionar(23);
        lista.adicionar(-11);
        lista.adicionar(11);
        lista.adicionar(10);
        lista.remover(1);
        lista.remover(22);
        lista.remover(-11);
        lista.remover(10);
        lista.exibir();
        System.out.println("----");
        lista.exibirInverso();
    }
}
