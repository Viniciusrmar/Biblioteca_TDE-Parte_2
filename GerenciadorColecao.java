import java.util.ArrayList;
import java.util.List;

public class GerenciadorColecao<T extends ItemBiblioteca> {
    private List<T> itens;

    public GerenciadorColecao() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        this.itens.add(item);
        System.out.println("Item '" + item.getTitulo() + "' adicionado com sucesso.");
    }

    public void removerItem(T item) {
        this.itens.remove(item);
        System.out.println("Item removido com sucesso.");
    }

    public List<T> buscarPorTitulo(String titulo) {
        List<T> encontrados = new ArrayList<>();
        for (T item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                encontrados.add(item);
            }
        }
        return encontrados;
    }

    public void listarTodos() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item na coleção.");
            return;
        }
        for (T item : itens) {
            item.exibirDetalhes();
        }
    }
}