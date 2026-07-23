/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.poli_cine.modelo;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author sebas
 */
public class CineGestor {
    
    
//horario debe ser una coleccion definida que nos determina si un horario esta libre
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    ArrayList<Sala> listaSalas = new ArrayList<>();
    ArrayList<Horario> listaHorarios = new ArrayList<>();
    ArrayList<Funcion> listaFunciones = new ArrayList<>();
    
    String urlPelis ="//home//sebas//NetBeansProjects//POLI_CINE//src//recursos//Peliculas.txt";
    String urlHorarios = "//home//sebas//NetBeansProjects//POLI_CINE//src//recursos//Horarios.txt";
    String urlFunciones = "//home//sebas//NetBeansProjects//POLI_CINE//src//recursos//FuncionesDisponiblesInicialmente.txt";
    String urlSalas = "//home//sebas//NetBeansProjects//POLI_CINE//src//recursos//NumeroSalas";
    
    
    
    public CineGestor(){
        
        //cargarpeliculas
        try{
        List<String> listaContenidoPelis = Files.readAllLines(Paths.get(urlPelis));
        String[] contenidoPelicula;
        for(String linea:listaContenidoPelis){
            contenidoPelicula = linea.split(",");
            listaPeliculas.add(new Pelicula(contenidoPelicula[0], contenidoPelicula[1], contenidoPelicula[2]));
        }
        }catch(Exception a){
            System.out.print(a);
        
        }
        
        //cargar salas
        
        try{
        List<String> listaIdSalas = Files.readAllLines(Paths.get(urlSalas));
        
        for(String linea:listaIdSalas){
            this.listaSalas.add(new Sala(linea));
        }
        
        }catch(Exception a){
                        System.out.print(a);
        }
        
        //cargarhorarios
        
        try{
        List<String> listaContenidoHorarios = Files.readAllLines(Paths.get(urlHorarios));
        for(String linea:listaContenidoHorarios){
        listaHorarios.add(new Horario(linea));
        }
        
        }catch(Exception asa){
                        System.out.print(asa);

        
        }
        
        
        
        //cargar funciones
        try{
        List<String> listaContenidoFunciones = Files.readAllLines(Paths.get(urlFunciones));
        String[] contenidoFuncion;
        for(String linea:listaContenidoFunciones){
            contenidoFuncion = linea.split(",");
            listaFunciones.add(new Funcion(new Pelicula(contenidoFuncion[0], contenidoFuncion[1], contenidoFuncion[2]), new Sala(contenidoFuncion[3]), new Horario(contenidoFuncion[4])));
        }
        }catch(Exception a){
                        System.out.print(a);

        
        }
        

    
    }
    
    
    
    public ArrayList<Pelicula> retornarListaPeliculas(){
    return this.listaPeliculas;
    }
    
    public ArrayList<Sala> retornarListaSala(){
    return this.listaSalas;
    }
    
    public ArrayList<Horario> retornarListaHorarios(){
    return this.listaHorarios;
    }
    
    public ArrayList<Funcion> retornarListaFunciones(){
    return this.listaFunciones;
    }
    
    //actualizar datos del cinegestor
    
    
    
    /*
    
    public void Imprimir(){
     for(Funcion a: listaFunciones){
         System.out.println(a.retornarPelicula().retornarNombre());
         System.out.println(a.retornarSala().retornarCantidadAsientos());
     }
     
     for(Funcion a: listaFunciones){
         if(a.retornarPelicula().retornarNombre().equals("Magumbo")){
             a.retornarSala().modificarDisponibilidad("A1");
         }
         System.out.println(a.retornarPelicula().retornarNombre());
         System.out.println(a.retornarSala().retornarCantidadAsientos());
     }
     
     
      
    }
    
   
  */
    
    
    
    
    
}
