package ACT_NUMERO_6;

public class Libro {
    private String titulo;
    private String autor;
    private String codigo;

    public Libro(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String toString() {
        return "[" + codigo + "] " + titulo + " - " + autor;
    }
}
