/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fis.poo.poli_cine;

import fis.poo.poli_cine.controlador.ControladorPrincipal;
import fis.poo.poli_cine.modelo.CineGestor;
import fis.poo.poli_cine.vista.Vista1;
import fis.poo.poli_cine.vista.Vista3;
import fis.poo.poli_cine.vista.Vista4;
import fis.poo.poli_cine.vista.Vista5;

/**
 *
 * @author sebas
 */
public class POLI_CINE {

    public static void main(String[] args) {
        
        CineGestor cinegestor1 = new CineGestor();
        
        Vista1 vista1 = new Vista1();
        Vista3 vista3 = new Vista3();
        Vista4 vista4 = new Vista4();
        Vista5 vista5 = new Vista5();
        
        ControladorPrincipal controlador1 = new ControladorPrincipal(cinegestor1,vista1 , vista3, vista4,vista5);
        
        controlador1.iniciarApp();
        
        
        
    }
    
}
