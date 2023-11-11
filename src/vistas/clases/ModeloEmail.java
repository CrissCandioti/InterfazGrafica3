/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas.clases;

/**
 *
 * @author criss
 */
public class ModeloEmail {

    private int ID;
    private String nombreUsuario;
    private String correo;
    private String contraseña;
    private String codigo;

    public ModeloEmail() {
    }

    public ModeloEmail(String nombreUsuario, String correo, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public ModeloEmail(String nombreUsuario, String correo, String contraseña, String codigo) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.codigo = codigo;
    }

    public ModeloEmail(int ID, String nombreUsuario, String correo, String contraseña) {
        this.ID = ID;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public ModeloEmail(int ID, String nombreUsuario, String correo, String contraseña, String codigo) {
        this.ID = ID;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.codigo = codigo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ModeloEmail{" + "ID=" + ID + ", nombreUsuario=" + nombreUsuario + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", codigo=" + codigo + '}';
    }

}
