package ACT_NUMERO_6;

import java.util.LinkedList;
import java.util.Scanner;

public class PrestamosDiarios {
    private LinkedList<String> historial = new LinkedList<>();

    public void prestarLibro(Scanner sc, EstanteSeccion estantes, RegistroUsuarios registro) {
        System.out.print("Clave de usuario: ");
        String clave = sc.nextLine();
        Usuario usuario = registro.obtenerUsuario(clave);

        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        if (!usuario.puedePrestar()) {
            System.out.println("Límite de préstamos alcanzado.");
            return;
        }

        System.out.print("Código del libro: ");
        String codigo = sc.nextLine();

        if (!estantes.verificarDisponibilidad(codigo)) {
            System.out.println("Libro no disponible.");
            return;
        }

        usuario.sumarPrestamo();
        historial.add("Prestado a " + usuario.getNombre() + " - Libro código: " + codigo);
        System.out.println("Libro prestado.");
    }

    public void devolverLibro(Scanner sc) {
        System.out.print("Nombre del usuario: ");
        String nombre = sc.nextLine();
        System.out.print("Código del libro: ");
        String codigo = sc.nextLine();
        historial.add("Devuelto por " + nombre + " - Libro código: " + codigo);
        System.out.println("Libro devuelto.");
    }

    public void mostrarHistorial() {
        for (String registro : historial) {
            System.out.println(registro);
        }
    }
}
