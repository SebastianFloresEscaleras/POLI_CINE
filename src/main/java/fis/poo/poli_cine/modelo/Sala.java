/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.poli_cine.modelo;

/**
 *
 * @author sebas
 */
public class Sala {
    
    Asiento[] listaAsientos = new Asiento[9];
    String id;
    public Sala(String id){
        this.id = id;
    listaAsientos[0] = new Asiento("A1", true);
    listaAsientos[1] = new Asiento("A2", true);
    listaAsientos[2] = new Asiento("A3", true);
    listaAsientos[3] = new Asiento("B1", true);
    listaAsientos[4] = new Asiento("B2", true);
    listaAsientos[5] = new Asiento("B3", true);
    listaAsientos[6] = new Asiento("C1", true);
    listaAsientos[7] = new Asiento("C2", true);
    listaAsientos[8] = new Asiento("C3", true);
    }
    
    public String retornarId(){
    return this.id;
    }
    
    public Asiento[] retornarListaAsientos(){
    return this.listaAsientos;
    }
    
    public int retornarCantidadAsientos(){
        int contador =0;
        
        for(Asiento a:listaAsientos){
            if(true==a.retornarDisponibilidad()){
            contador++;
            }
            
        }
        return contador;
    }
   
    public void modificarDisponibilidad(String Clave){
    
        for(Asiento a:listaAsientos){
            if(a.retornarClave().equals(Clave)){
                if(a.retornarDisponibilidad()==true){
                a.modificarDisponibilidad(false);
                }else{
                a.modificarDisponibilidad(true);
                }
            }
        }
        
    }
    
    
    
}
