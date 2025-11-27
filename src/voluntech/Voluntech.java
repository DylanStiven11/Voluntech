/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package voluntech;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Voluntech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista para guardar todos los usuarios
        ArrayList<Usuario> usuarios = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n===== MENU USUARIOS =====");
            System.out.println("1. Crear usuario");
            System.out.println("2. Mostrar usuarios registrados");
            System.out.println("3. Buscar usuario por correo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Crear Usuario ---");

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();

                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    System.out.print("Contraseña: ");
                    String contraseña = sc.nextLine();

                    Usuario nuevo = new Usuario(id, nombre, apellido, correo, contraseña);
                    usuarios.add(nuevo);

                    System.out.println("Usuario creado exitosamente.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Usuarios ---");

                    if (usuarios.isEmpty()) {
                        System.out.println("No hay usuarios registrados.");
                    } else {
                        for (Usuario u : usuarios) {
                            System.out.println("ID: " + u.getId() + " | Nombre: " + u.getNombre() +
                                    " " + u.getApellido() + " | Correo: " + u.getCorreo() +
                                    " | Estado: " + u.getEstado());
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Buscar Usuario ---");
                    System.out.print("Ingrese correo: ");
                    String buscar = sc.nextLine();

                    boolean encontrado = false;

                    for (Usuario u : usuarios) {
                        if (u.getCorreo().equalsIgnoreCase(buscar)) {
                            System.out.println("Usuario encontrado:");
                            System.out.println("Nombre: " + u.getNombre());
                            System.out.println("Apellido: " + u.getApellido());
                            System.out.println("Estado: " + u.getEstado());
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No existe un usuario con ese correo.");
                    }
                    break;

                case 4:
                    System.out.println("\nSaliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
    }
    

