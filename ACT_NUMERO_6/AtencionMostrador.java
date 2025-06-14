package ACT_NUMERO_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtencionMostrador {
    private Queue<String> cola = new LinkedList<>();

    public void agregarCliente(Scanner sc) {
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();
        cola.offer(nombre);
    }

    public void atenderCliente() {
        if (!cola.isEmpty()) {
            System.out.println("Atendiendo a: " + cola.poll());
        } else {
            System.out.println("No hay clientes en espera.");
        }
    }

    public void mostrarCola() {
        for (String cliente : cola) {
            System.out.println(cliente);
        }
    }
}
