/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.poli_cine.modelo;

/**
 *
 * @author sebas
 */
public class Funcion {
    
   Pelicula pelicula1;
   Sala sala1;
   Horario horario1;
   
   public Funcion(Pelicula pelicula1, Sala sala1, Horario horario1){
   this.pelicula1 = pelicula1;
   this.sala1 = sala1;
   this.horario1 = horario1;
   }
   
   public Pelicula retornarPelicula(){
    return this.pelicula1;   
   }
   
   
   public Sala retornarSala(){
    return this.sala1;   
   }
    
   public Horario retornarHorario(){
    return this.horario1;   
   }
    
    
}
