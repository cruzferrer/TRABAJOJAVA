package modulo;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cruzr
 */
import java.util.ArrayList;


public class Producto {
    private String nombrep;
    private double preciop;
    private int existenciap;
    
    public Producto() {
    }
    
    public Producto(String nombre, double precio, int existencia) {
        this.nombrep = nombre;
        this.preciop = precio;
        this.existenciap = existencia;
        
     
    }
    
    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public double getPreciop() {
        return preciop;
    }

    public void setPrecio(double preciop) {
        this.preciop = preciop;
    }

    public int getExistenciap() {
        return existenciap;
    }

    public void setExistenciap(int existenciap) {
        this.existenciap = existenciap;
    }

    public void comprar(String nombre, float precio){
        
    }
   
    
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombrep + ", precio=" + preciop + ", existencia=" + existenciap + '}';
    }
}


