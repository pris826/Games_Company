/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vgc;

/**
 *
 * @author Priscila
 */
public class Figura {
    String franquicia;

    
    String nombre;
    String descripcion;
    double precio;
    int existencias;

   
    Figura(String fr, String nom, String des, double pr, int ex){
        franquicia=fr;
        nombre=nom;
        descripcion=des;
        precio=pr;
        existencias=ex; 
    }
    public String getFranquicia() {
        return franquicia;
    }
    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencias() {
        return existencias;
    }
    public void cambiarExistencia(int d){
        this.existencias=this.existencias-d;
    }
     @Override
    public String toString() {
        return "Figura{" + "franquicia=" + franquicia + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", existencias=" + existencias + '}';
    }

    
}

