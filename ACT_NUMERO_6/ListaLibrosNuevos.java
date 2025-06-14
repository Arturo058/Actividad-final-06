package ACT_NUMERO_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaLibrosNuevos {
    private ArrayList<Libro> nuevos = new ArrayList<>();

    public Libro agregarLibroNuevo(Scanner sc) {
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Código: ");
        String codigo = sc.nextLine();
        Libro libro = new Libro(titulo, autor, codigo);
        nuevos.add(libro);
        return libro;
    }

    public void mostrarLibrosNuevos() {
        for (Libro libro : nuevos) {
            System.out.println(libro);
        }
    }
}
