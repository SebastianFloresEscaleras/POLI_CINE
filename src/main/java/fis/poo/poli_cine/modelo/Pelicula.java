/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.poli_cine.modelo;

/**
 *
 * @author sebas
 */
public class Pelicula {
    
    String nombre;
    String descripcion;
    String ruta;
    
    public Pelicula(String nombre,String descripcion,String ruta){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }
    
    public String retornarNombre(){
    return this.nombre;
    }
    public String retornarDescripcion(){
    return this.descripcion;
    }
    public String retornarRuta(){
    return this.ruta;
    }
        
        
    
}
