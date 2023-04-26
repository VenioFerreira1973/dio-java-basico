package one.digitalinovattion.oo.fundamentos;

public class Livro {
    private Long id;
    private String autor;
    private String editora;
    private String titulo;
    private String isbn;
    private String assunto;
    private int quantidadePaginas;

    public Livro(String autor, String editora, String titulo, String isbn, String assunto, int numeroPaginas) {

        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
        this.isbn = isbn;
        this.assunto = assunto;

    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return String return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return String return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    /**
     * @return int return the quantidadePaginas
     */
    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    /**
     * @param quantidadePaginas the quantidadePaginas to set
     */
    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

}