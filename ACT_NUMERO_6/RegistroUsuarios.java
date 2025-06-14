package ACT_NUMERO_6;

import java.util.HashMap;
import java.util.Scanner;

public class RegistroUsuarios {
    private HashMap<String, Usuario> usuarios = new HashMap<>();

    public void darAlta(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Clave de acceso: ");
        String clave = sc.nextLine();
        System.out.print("Tipo (Estudiante, Maestro, Visitante): ");
        String tipo = sc.nextLine();
        usuarios.put(clave, new Usuario(nombre, clave, tipo));
        System.out.println("Usuario registrado.");
    }

    public void darBaja(Scanner sc) {
        System.out.print("Clave de usuario a eliminar: ");
        String clave = sc.nextLine();
        if (usuarios.remove(clave) != null) {
            System.out.println("Usuario eliminado.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public Usuario obtenerUsuario(String clave) {
        return usuarios.get(clave);
    }
}
