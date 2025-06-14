package ACT_NUMERO_6;

import java.util.Scanner;

public class Biblioteca {
    private EstanteSeccion estantes = new EstanteSeccion();
    private ListaLibrosNuevos librosNuevos = new ListaLibrosNuevos();
    private PrestamosDiarios prestamos = new PrestamosDiarios();
    private LibrosDevueltos pilaDevueltos = new LibrosDevueltos();
    private AtencionMostrador colaClientes = new AtencionMostrador();
    private RegistroUsuarios registroUsuarios = new RegistroUsuarios();

    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Biblioteca ---");
            System.out.println("1. Colocar libro en estante");
            System.out.println("2. Mostrar libros en estante");
            System.out.println("3. Agregar libro nuevo");
            System.out.println("4. Mostrar libros nuevos");
            System.out.println("5. Dar de alta usuario");
            System.out.println("6. Dar de baja usuario");
            System.out.println("7. Prestar libro");
            System.out.println("8. Devolver libro");
            System.out.println("9. Mostrar historial de préstamos");
            System.out.println("10. Agregar libro devuelto (pila)");
            System.out.println("11. Revisar último libro devuelto");
            System.out.println("12. Mostrar libros devueltos (pila)");
            System.out.println("13. Agregar cliente a cola");
            System.out.println("14. Atender cliente de cola");
            System.out.println("15. Mostrar cola de clientes");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> estantes.colocarLibro(sc);
                case 2 -> estantes.mostrarLibros();
                case 3 -> {
                    Libro libro = librosNuevos.agregarLibroNuevo(sc);
                    estantes.preguntarEstanteYAgregar(libro, sc);
                }
                case 4 -> librosNuevos.mostrarLibrosNuevos();
                case 5 -> registroUsuarios.darAlta(sc);
                case 6 -> registroUsuarios.darBaja(sc);
                case 7 -> prestamos.prestarLibro(sc, estantes, registroUsuarios);
                case 8 -> prestamos.devolverLibro(sc);
                case 9 -> prestamos.mostrarHistorial();
                case 10 -> pilaDevueltos.agregarDevuelto(sc);
                case 11 -> pilaDevueltos.revisarUltimo();
                case 12 -> pilaDevueltos.mostrarPila();
                case 13 -> colaClientes.agregarCliente(sc);
                case 14 -> colaClientes.atenderCliente();
                case 15 -> colaClientes.mostrarCola();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }
}
