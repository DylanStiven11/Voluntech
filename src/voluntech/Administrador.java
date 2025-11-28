/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package administrador;




public class Administrador {

    // Activar cuenta de un usuario
    public void activarUsuario(Usuario usuario) {
        usuario.activar(); // usa tu método activar()
        System.out.println("Usuario " + usuario.getNombre() + " activado.");
    }

    // Desactivar cuenta de un usuario
    public void desactivarUsuario(Usuario usuario) {
        usuario.desactivar(); // usa tu método desactivar()
        System.out.println("Usuario " + usuario.getNombre() + " desactivado.");
    }

    // Registrar una nueva organización
    public void registrarOrganizacion(String nombre) {
        System.out.println("Organización registrada: " + nombre);
    }

    // Ver historial de cambios
    public void auditarActividad() {
        System.out.println("Mostrando historial de actividad...");
    }

    // Listar todos los usuarios
    public void listarUsuarios() {
        System.out.println("Lista de usuarios del sistema:");
        // lógica real más adelante
    }

    // Listar todas las organizaciones
    public void listarOrganizaciones() {
        System.out.println("Lista de organizaciones registradas:");
        // lógica real más adelante
    }

    // Eliminar usuario del sistema
    public void eliminarUsuario(Usuario usuario) {
        System.out.println("Usuario " + usuario.getNombre() + " eliminado del sistema.");
        // Aquí podría ir lógica de eliminación más adelante
    }
}
