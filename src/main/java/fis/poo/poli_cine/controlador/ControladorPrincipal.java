/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fis.poo.poli_cine.controlador;

import fis.poo.poli_cine.modelo.CineGestor;
import fis.poo.poli_cine.vista.Vista1;
import fis.poo.poli_cine.vista.Vista3;
import fis.poo.poli_cine.vista.Vista4;
import fis.poo.poli_cine.vista.Vista5;

/**
 *
 * @author sebas
 */
public class ControladorPrincipal {
    CineGestor cinegestor1;
    
    Vista1 vista1;
    Vista3 vista3;
    Vista4 vista4;
    Vista5 vista5;
    
    public ControladorPrincipal(CineGestor cinegestor1,Vista1 vista1, Vista3 vista3, Vista4 vista4,Vista5 vista5){
        this.cinegestor1 = cinegestor1;
        this.vista1 = vista1;
        this.vista3 = vista3;
        this.vista4 = vista4;
        this.vista5 = vista5;
    }
    
    
    public void iniciarApp(){
        //prueba para ver que carga todo correctamente
        //cinegestor1.Imprimir();
        vista1.setResizable(false);
        vista3.setResizable(false);
        vista4.setResizable(false);
        vista5.setResizable(false);
        
        
        vista1.recibirCineGestor(cinegestor1);

        vista1.setVisible(true);
        
        
        vista1.llenarListaVisual();
        
        vista5.recibircineGestor(cinegestor1);
        
        vista1.listenerAdministrador((accion)->{
            
        vista1.dispose();
        
        vista5.vaciarListas();
        vista5.setVisible(true);        
        vista5.llenarListas();
        
        });
        
        vista5.listenerCrearFuncion((accion)->{
            
        if(vista5.verificarCamposLlenos()==true){
        vista5.crearNuevaFuncion();
        vista5.anuncioFuncionExistosa();
        
        }else{
        vista5.advertenciaSinSeleccion();
        
        }
            
        });
        
        vista5.listenerRegresar((accion)->{
        vista5.dispose();
        vista1.vaciarLista();
        vista1.recibirCineGestor(cinegestor1);
        vista1.setVisible(true);
        vista1.llenarListaVisual();
        });
        
        vista1.listenerSeleccionarFuncion((accion)->{
        
            if(vista1.validarSiEstaEscogidoAlgo()==true){
            
                vista1.renderizarFuncionEscogida();
                
            }else{
                vista1.mensajeNoSeleccionoNada();
            
            }
            
        });
        
        
        
        vista1.listenerPasarASeleccionAsiento((accion)->{
        if(vista1.verificarSiEscogioFuncion()==true){
            vista1.dispose();
            vista3.limpiarPantallaParaNuevoCiclo();
            vista3.recibirCineGestor(cinegestor1);
            //aunque le dije instancia es solo una referencia de memoria a una funcion dentro del arraylisy de la base de datos
            vista3.recibirFuncionEscogida(vista1.retornarInstanciadeFuncionEscogida());
            
            vista3.configuracionAlIniciarVentanaAsientos();
            
            vista3.reseteadorDeColoresDeLosBotonesParaPoderInstanciarle();
            
            vista3.setVisible(true);
            
        }else{
            vista1.avisarQueDebeEscogerFuncion();
        
        }
        
        });
        
        
        
        vista3.listenerBotonSeleccionarMultiplesAsientos((Accion)->{
        if(vista3.validarQueDebeHaberPorLoMenosUno()==true){
            
            vista3.mostrarAsientosSeleccionados();
            
        }else{
            vista3.advertenciaSeleccionarUnAsientoMinimo();
        }
        
        });
        
        vista3.listenerPasarAFacturacion((accion)->{
        if(vista3.validarQueDebeHaberPorLoMenosUno()==true){
            vista4.recibirCineGestor(cinegestor1);
            vista4.recibirCadenaCompra(vista3.entregarCadenaCompra());
            //solo es teferencia por si acaso no instnacia
            vista4.recibirFuncionEscogida(vista1.retornarInstanciadeFuncionEscogida());
            vista4.limpiarPantallaParaNuevoCiclo();
            vista3.dispose();
            vista4.setVisible(true);
        }else{
            vista3.advertenciaSeleccionarUnAsientoMinimo();
        
        }
            
        });
        
        
        
        vista4.listenerEmitirFactura((accio)->{
            if(vista4.verificarQueSeLlenenDatos()==true){
                
                vista4.imprimirFactura();
            
            }else{
            vista4.advertenciaLLenarCampos();
            }
            
        });
        
        
        vista4.listenerPAgarSalir((accion)->{
            
        if(vista4.verificarSiEmitioFactura()==true){
        vista4.dispose();
        vista1.setVisible(true);
            
        }else{
                vista4.advertirFaltaPagar();
        
        }
        
        });
        
        
        
        
        
        
        
   
    }
    
    
    
}
