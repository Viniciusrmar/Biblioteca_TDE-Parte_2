import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int id;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.estarDisponivel()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
            System.out.println(nome + " emprestou o livro '" + livro.getTitulo() + "'.");
        } else {
            System.out.println("O livro '" + livro.getTitulo() + "' não está disponível.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
            System.out.println(nome + " devolveu o livro '" + livro.getTitulo() + "'.");
        } else {
            System.out.println(nome + " não possui esse livro emprestado.");
        }
    }

    public void listarLivrosEmprestados() {
        System.out.println("\nLivros emprestados por " + nome + ":");
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
            for (Livro livro : livrosEmprestados) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }
}
