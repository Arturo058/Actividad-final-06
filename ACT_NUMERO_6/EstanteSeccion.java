package ACT_NUMERO_6;

import java.util.Scanner;

public class EstanteSeccion {
    private Libro[][] estantes = new Libro[3][10]; // 3 secciones, 10 libros máx

    public void colocarLibro(Scanner sc) {
        System.out.print("Sección (0-2): ");
        int seccion = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < estantes[seccion].length; i++) {
            if (estantes[seccion][i] == null) {
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("Autor: ");
                String autor = sc.nextLine();
                System.out.print("Código: ");
                String codigo = sc.nextLine();
                estantes[seccion][i] = new Libro(titulo, autor, codigo);
                System.out.println("Libro colocado.");
                return;
            }
        }
        System.out.println("Estante lleno.");
    }

    public void mostrarLibros() {
        for (int s = 0; s < estantes.length; s++) {
            System.out.println("Sección " + s + ":");
            for (Libro libro : estantes[s]) {
                if (libro != null) {
                    System.out.println("  " + libro);
                }
            }
        }
    }

    public void preguntarEstanteYAgregar(Libro libro, Scanner sc) {
        System.out.print("¿En qué sección deseas colocarlo (0-2)? ");
        int seccion = sc.nextInt();
        for (int i = 0; i < estantes[seccion].length; i++) {
            if (estantes[seccion][i] == null) {
                estantes[seccion][i] = libro;
                System.out.println("Libro agregado al estante.");
                return;
            }
        }
        System.out.println("No hay espacio en esa sección.");
    }

    public boolean verificarDisponibilidad(String codigo) {
        for (Libro[] seccion : estantes) {
            for (Libro libro : seccion) {
                if (libro != null && libro.getCodigo().equals(codigo)) {
                    return true;
                }
            }
        }
        return false;
    }
}
