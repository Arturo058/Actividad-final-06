package ACT_NUMERO_6;

public class Usuario {
    private String nombre;
    private String clave;
    private String tipo;
    private int librosPrestados;

    public Usuario(String nombre, String clave, String tipo) {
        this.nombre = nombre;
        this.clave = clave;
        this.tipo = tipo;
        this.librosPrestados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean puedePrestar() {
        return librosPrestados < limite();
    }

    public void sumarPrestamo() {
        librosPrestados++;
    }

    private int limite() {
        return switch (tipo.toLowerCase()) {
            case "maestro" -> 10;
            case "estudiante" -> 5;
            case "visitante" -> 2;
            default -> 1;
        };
    }
}
