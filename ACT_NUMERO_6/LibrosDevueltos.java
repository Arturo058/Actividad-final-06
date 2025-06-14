package ACT_NUMERO_6;

import java.util.Stack;
import java.util.Scanner;

public class LibrosDevueltos {
    private Stack<Libro> pila = new Stack<>();

    public void agregarDevuelto(Scanner sc) {
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Código: ");
        String codigo = sc.nextLine();
        pila.push(new Libro(titulo, autor, codigo));
    }

    public void revisarUltimo() {
        if (!pila.isEmpty()) {
            System.out.println("Último libro devuelto: " + pila.peek());
        } else {
            System.out.println("No hay libros devueltos.");
        }
    }

    public void mostrarPila() {
        if (pila.isEmpty()) {
            System.out.println("No hay libros devueltos.");
        } else {
            System.out.println("Libros devueltos:");
            for (Libro libro : pila) {
                System.out.println(libro);
            }
        }
    }
}
