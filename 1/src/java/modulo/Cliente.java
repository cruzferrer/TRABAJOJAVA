package modulo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * ya paseme maestraaaaaaaaaaaaaaaa
 * @author cruzr
 */
public class Cliente {
    private String nombre;
    private double numero;
    private String correo;

    public Cliente() {
    }

    public Cliente(String nombre, double numero, String correo) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + numero + ", correo=" + correo + '}';
    }
        
    
}
