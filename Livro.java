public class Livro extends ItemBiblioteca implements Emprestavel {
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        super(titulo, autor, anoPublicacao);
        this.disponivel = true;
    }

    @Override
    public void emprestar() {
        if (estarDisponivel()) {
            this.disponivel = false;
            System.out.println("O livro '" + getTitulo() + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + getTitulo() + "' nao esta disponivel para emprestimo.");
        }
    }

    @Override
    public void devolver() {
        this.disponivel = true;
        System.out.println("O livro '" + getTitulo() + "' foi devolvido.");
    }

    @Override
    public boolean estarDisponivel() {
        return disponivel;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titular: " + getTitulo() + ", Autor: " +
                getAutor() + ", Ano: " + getAnoPublicacao() + ", Status: " + (disponivel ? "Disponivel" : "Emprestimo"));
    }
}