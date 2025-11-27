/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voluntech;

public class Usuario {

    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contraseña;
    protected String estado; // activo / inactivo


    public Usuario(int id, String nombre, String apellido, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.estado = "activo";
    }


    public boolean login(String correo, String contraseña) {
        return this.correo.equals(correo) && this.contraseña.equals(contraseña);
    }

    public void logout() {
        System.out.println("Sesión cerrada para: " + nombre);
    }

    public void actualizarDatos(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public void cambiarContraseña(String nueva) {
        this.contraseña = nueva;
    }

    public void activar() {
        this.estado = "activo";
    }

    public void desactivar() {
        this.estado = "inactivo";
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
