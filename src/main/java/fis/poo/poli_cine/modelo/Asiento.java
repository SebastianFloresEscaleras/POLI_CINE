/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.poli_cine.modelo;

/**
 *
 * @author sebas
 */
public class Asiento {
    
    String clave;
    Boolean disponible;
    
    public Asiento(String clave, Boolean disponible){
    this.clave = clave;
    this.disponible = disponible;
    }
    
    public Boolean retornarDisponibilidad(){
    return disponible;
    }
    
    public void modificarDisponibilidad(Boolean a){
    this.disponible = a;
    }
    
    public String retornarClave(){
    return this.clave;
    }
    
    
}
