public class Main {
    public static void main(String[] args) {
        GerenciadorColecao<Livro> gerenciadorLivros = new GerenciadorColecao<>();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, true);
        Livro livro2 = new Livro("O jogo", "Geovani Oliveira Mezariz", 2025, true);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899, true);

        gerenciadorLivros.adicionarItem(livro1);
        gerenciadorLivros.adicionarItem(livro2);
        gerenciadorLivros.adicionarItem(livro3);

        Usuario usuario1 = new Usuario("Vinicius", 1);
        Usuario usuario2 = new Usuario("Ana", 2);

        System.out.println("\n--- Lista inicial de livros ---");
        gerenciadorLivros.listarTodos();

        System.out.println("\n--- Empréstimos ---");
        usuario1.emprestarLivro(livro1);
        usuario2.emprestarLivro(livro2);

        System.out.println("\n--- Situação após empréstimos ---");
        gerenciadorLivros.listarTodos();

        usuario1.listarLivrosEmprestados();
        usuario2.listarLivrosEmprestados();

        System.out.println("\n--- Devoluções ---");
        usuario1.devolverLivro(livro1);
        usuario2.devolverLivro(livro2);

        System.out.println("\n--- Situação final da coleção ---");
        gerenciadorLivros.listarTodos();
    }
}
