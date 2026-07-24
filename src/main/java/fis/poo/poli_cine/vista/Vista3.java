/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fis.poo.poli_cine.vista;

import fis.poo.poli_cine.modelo.Asiento;
import fis.poo.poli_cine.modelo.CineGestor;
import fis.poo.poli_cine.modelo.Funcion;
import fis.poo.poli_cine.modelo.Horario;
import fis.poo.poli_cine.modelo.Pelicula;
import fis.poo.poli_cine.modelo.Sala;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Vista3 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Vista3.class.getName());
    //siempre, esto no son instancias son referencias, toca ver si se puede cambiar el valor de la funcion desde aqui y evitar problemas
    CineGestor cinegestor1;
    Funcion funcionEscogida;
    String listaTicketsVendidos = new String();
    
    /**
     * Creates new form Asiento
     */
    public Vista3() {
        initComponents();
       
        
    }
    
    public void reseteadorDeColoresDeLosBotonesParaPoderInstanciarle(){
        java.awt.Color colorBase = jButton10.getBackground();
        
        for(Funcion i: cinegestor1.retornarListaFunciones()){
            if(i==funcionEscogida){
                for(Asiento eqwr: i.retornarSala().retornarListaAsientos()){
                    
                    
                    if(eqwr.retornarClave().equals("A1")){
                            jButton1.setBackground(colorBase);
                        
                    
                    }
                    
                    if(eqwr.retornarClave().equals("B1")){
                            jButton2.setBackground(colorBase);
                        
                    }
                    
                    if(eqwr.retornarClave().equals("C1")){
                            jButton3.setBackground(colorBase);
                        
                    }
                    
                    if(eqwr.retornarClave().equals("A2")){
                            jButton4.setBackground(colorBase);
                        
                    }
                    
                    if(eqwr.retornarClave().equals("B2")){
                            jButton5.setBackground(colorBase);
                        
                    }
                    
                    if(eqwr.retornarClave().equals("C2")){
                            jButton6.setBackground(colorBase);
                        
                    }
                    
                    if(eqwr.retornarClave().equals("A3")){
                            jButton9.setBackground(colorBase);
                        
                    }
                    
                    if(eqwr.retornarClave().equals("B3")){
                            jButton8.setBackground(colorBase);
                        
                    }
                    
                    if(eqwr.retornarClave().equals("C3")){
                            jButton7.setBackground(colorBase);
                        
                    }
                    
                    
                }
            }
        }
    
    }
        
    
    
    
    public void limpiarPantallaParaNuevoCiclo(){
    jTextField1.setText("");
    }
    
    //esto debo hacerlo antes de pasar de pantalla para estar seguro 
    public void vaciarListaCompras(){
    this.listaTicketsVendidos = "";
    }
    
    //debo guardar en un string global la cadena escogida, cuando se presione siguiente
    public String entregarCadenaCompra(){
        return this.listaTicketsVendidos;
    }
    
    //pasar a factura
    public void listenerPasarAFacturacion(java.awt.event.ActionListener accion){
        jButton12.addActionListener(accion);
    }
    
    
    //necesito presionar un boton y hacer algunas cosas
    //uno cambiarle de color y que eso represente el cambio de estado de disponible normal o tomaro rojo
    //para no tener metodos como loco regado podria delegar eso a esta vista, si despues me da tiempo le hago funcional con listeners tambien
    
    //dos luego imprimir los que esten seleccionados en rojo
    //tambien debo guardar un string[] osea que tenga ventas ya hechas y luego sacar eso de las impresiones y las facturas
    
    public void advertenciaSeleccionarUnAsientoMinimo(){
    jTextField1.setText("Tienes que comprar un asiento minimo");
    }
    
    public Boolean validarQueDebeHaberPorLoMenosUno(){
        
        for(Funcion a:cinegestor1.retornarListaFunciones()){
            
            if(a==funcionEscogida){
                for(Asiento as: a.retornarSala().retornarListaAsientos()){
                    if(as.retornarDisponibilidad()==false){
                        return true;
                        }
                    }
                }
            }
            
           return false; 
        }

    

    public Boolean validarQueDebeHaberPorLoMenosUno2(){
        
        for(Funcion a:cinegestor1.retornarListaFunciones()){
            
            if(a==funcionEscogida){
                for(Asiento as: a.retornarSala().retornarListaAsientos()){
                    if(as.retornarDisponibilidad()==false){
                        if(jTextField1.getText().equals("")){
                            return false;
                        }else{
                        return true;
                        }
                        }
                    }
                }
            }
            
           return false; 
        }

    
    
    
    //bueno aqui gestiono para que se no se muestren como comprados al usuario, solo le aparezcan los que si compra y no anteriores
    public void mostrarAsientosSeleccionados(){
        String aut = "";
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                for(Asiento ase: a.retornarSala().retornarListaAsientos()){
                    
                    if(ase.retornarDisponibilidad()==false){
                        //aqui podria aumentar un if que valide si el boton esta visible y segun eso escribir o no en la compra
                        if(ase.retornarClave().equals("A1")){
                                if(jButton1.isVisible()==true){
                                    aut = aut +","+ase.retornarClave();
                                }
                        }
                        
                        if(ase.retornarClave().equals("B1")){
                                if(jButton2.isVisible()==true){
                                    aut = aut +","+ase.retornarClave();
                                }
                        }
                        
                        if(ase.retornarClave().equals("C1")){
                                if(jButton3.isVisible()==true){
                                    aut = aut +","+ase.retornarClave();
                                }
                        }
                        
                        if(ase.retornarClave().equals("A2")){
                                if(jButton4.isVisible()==true){
                                    aut = aut +","+ase.retornarClave();
                                }
                        }
                        
                        if(ase.retornarClave().equals("B2")){
                                if(jButton5.isVisible()==true){
                                    aut = aut +","+ase.retornarClave();
                                }
                        }
                        
                        if(ase.retornarClave().equals("C2")){
                                if(jButton6.isVisible()==true){
                                    aut = aut +","+ase.retornarClave();
                                }
                        }
                        
                        if(ase.retornarClave().equals("A3")){
                                if(jButton9.isVisible()==true){
                                    aut = aut +","+ase.retornarClave();
                                }
                        }
                        
                        if(ase.retornarClave().equals("B3")){
                                if(jButton8.isVisible()==true){
                                    aut = aut +","+ase.retornarClave();
                                }
                        }
                        
                        if(ase.retornarClave().equals("C3")){
                                if(jButton7.isVisible()==true){
                                    aut = aut +","+ase.retornarClave();
                                }
                        }
                        
                    }
                }
            }
        
        }
        
        jTextField1.setText(aut);
        
        this.listaTicketsVendidos = aut;
    
    }
    
    public void listenerBotonSeleccionarMultiplesAsientos(java.awt.event.ActionListener Accion){
        jButton10.addActionListener(Accion);
    }
    
    
    //funcion que haga aparecer o desaparecer botones
    //mejor hacerlo desde el inicio por que luego es dificil verificar si hago en desorden
    public void configuracionAlIniciarVentanaAsientos(){
    for(Funcion a: cinegestor1.retornarListaFunciones()){
        if(a==this.funcionEscogida){
            for(Asiento ae: a.retornarSala().retornarListaAsientos()){
                if(ae.retornarClave().equals("A1")){
                        if(ae.retornarDisponibilidad()==true){
                        jButton1.setVisible(true);
                        }else{
                        jButton1.setVisible(false);
                        }
                }
                
                if(ae.retornarClave().equals("B1")){
                        if(ae.retornarDisponibilidad()==true){
                        jButton2.setVisible(true);
                        }else{
                        jButton2.setVisible(false);
                        }
                }
                
                if(ae.retornarClave().equals("C1")){
                        if(ae.retornarDisponibilidad()==true){
                        jButton3.setVisible(true);
                        }else{
                        jButton3.setVisible(false);
                        }
                }
                
                if(ae.retornarClave().equals("A2")){
                        if(ae.retornarDisponibilidad()==true){
                        jButton4.setVisible(true);
                        }else{
                        jButton4.setVisible(false);
                        }
                }
                
                if(ae.retornarClave().equals("B2")){
                        if(ae.retornarDisponibilidad()==true){
                        jButton5.setVisible(true);
                        }else{
                        jButton5.setVisible(false);
                        }
                }
                
                if(ae.retornarClave().equals("C2")){
                        if(ae.retornarDisponibilidad()==true){
                        jButton6.setVisible(true);
                        }else{
                        jButton6.setVisible(false);
                        }
                }
                
                if(ae.retornarClave().equals("A3")){
                        if(ae.retornarDisponibilidad()==true){
                        jButton9.setVisible(true);
                        }else{
                        jButton9.setVisible(false);
                        }
                }
                
                if(ae.retornarClave().equals("B3")){
                        if(ae.retornarDisponibilidad()==true){
                        jButton7.setVisible(true);
                        }else{
                        jButton7.setVisible(false);
                        }
                }
                
                if(ae.retornarClave().equals("C3")){
                        if(ae.retornarDisponibilidad()==true){
                        jButton8.setVisible(true);
                        }else{
                        jButton8.setVisible(false);
                        }
                }
                
                
                
                
                
            }
        }
    
    }
        
    }
    
    
    
    //toca ver si sirve esto bien mientras hago pruebas
    public void recibirFuncionEscogida(Funcion funcionUsuario){
            this.funcionEscogida = funcionUsuario;
    }
    
    public void recibirCineGestor(CineGestor cine){
        this.cinegestor1=cine;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Noto Sans CJK KR Light", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jButton1.setText("A1");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Noto Sans CJK KR Light", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccion de Asientos");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Noto Sans CJK KR Light", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("A");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Noto Sans CJK KR Light", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("B");
        jLabel4.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Noto Sans CJK KR Light", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("1");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Noto Sans CJK KR Light", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("2");
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Noto Sans CJK KR Light", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("3");
        jLabel8.setOpaque(true);

        jButton2.setText("B1");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("C1");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("A2");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setText("B2");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jButton6.setText("C2");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jButton7.setText("B3");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jButton8.setText("C3");
        jButton8.addActionListener(this::jButton8ActionPerformed);

        jButton9.setText("A3");
        jButton9.addActionListener(this::jButton9ActionPerformed);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Noto Sans CJK KR Light", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Asientos Seleccionados");
        jLabel10.setOpaque(true);

        jButton10.setText("Seleccionar Asiento");
        jButton10.addActionListener(this::jButton10ActionPerformed);

        jButton12.setText("Siguiente");
        jButton12.addActionListener(this::jButton12ActionPerformed);

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Noto Sans CJK KR Light", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("C");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton12)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))))
                        .addGap(170, 170, 170))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(563, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        java.awt.Color colorBase = jButton10.getBackground();
                
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                
                for(Asiento rr : a.retornarSala().retornarListaAsientos()){
                    
                    if(rr.retornarClave().equals("A1")){
                        
                        if(rr.retornarDisponibilidad()==true){
                        jButton1.setBackground(Color.BLUE);
                        rr.modificarDisponibilidad(false);
                        //System.out.println("Asiento tomado");
                        //System.out.print(rr.retornarDisponibilidad());
                        }else{
                        jButton1.setBackground(colorBase);
                        rr.modificarDisponibilidad(true);
                        //System.out.println("AsientoLiberado");
                        //System.out.println(rr.retornarDisponibilidad());
                        }
                    }
                }
            }
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        java.awt.Color colorBase = jButton10.getBackground();
                
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                
                for(Asiento rr : a.retornarSala().retornarListaAsientos()){
                    
                    if(rr.retornarClave().equals("B3")){
                        
                        if(rr.retornarDisponibilidad()==true){
                        jButton7.setBackground(Color.BLUE);
                        rr.modificarDisponibilidad(false);
                        //System.out.println("Asiento tomado");
                        //System.out.print(rr.retornarDisponibilidad());
                        }else{
                        jButton7.setBackground(colorBase);
                        rr.modificarDisponibilidad(true);
                        //System.out.println("AsientoLiberado");
                        //System.out.println(rr.retornarDisponibilidad());
                        }
                    }
                }
            }
        
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        java.awt.Color colorBase = jButton10.getBackground();
                
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                
                for(Asiento rr : a.retornarSala().retornarListaAsientos()){
                    
                    if(rr.retornarClave().equals("B1")){
                        
                        if(rr.retornarDisponibilidad()==true){
                        jButton2.setBackground(Color.BLUE);
                        rr.modificarDisponibilidad(false);
                        //System.out.println("Asiento tomado");
                        //System.out.print(rr.retornarDisponibilidad());
                        }else{
                        jButton2.setBackground(colorBase);
                        rr.modificarDisponibilidad(true);
                        //System.out.println("AsientoLiberado");
                        //System.out.println(rr.retornarDisponibilidad());
                        }
                    }
                }
            }
        
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        java.awt.Color colorBase = jButton10.getBackground();
                
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                
                for(Asiento rr : a.retornarSala().retornarListaAsientos()){
                    
                    if(rr.retornarClave().equals("C1")){
                        
                        if(rr.retornarDisponibilidad()==true){
                        jButton3.setBackground(Color.BLUE);
                        rr.modificarDisponibilidad(false);
                        //System.out.println("Asiento tomado");
                        //System.out.print(rr.retornarDisponibilidad());
                        }else{
                        jButton3.setBackground(colorBase);
                        rr.modificarDisponibilidad(true);
                        //System.out.println("AsientoLiberado");
                        //System.out.println(rr.retornarDisponibilidad());
                        }
                    }
                }
            }
        
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        java.awt.Color colorBase = jButton10.getBackground();
                
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                
                for(Asiento rr : a.retornarSala().retornarListaAsientos()){
                    
                    if(rr.retornarClave().equals("A2")){
                        
                        if(rr.retornarDisponibilidad()==true){
                        jButton4.setBackground(Color.BLUE);
                        rr.modificarDisponibilidad(false);
                        //System.out.println("Asiento tomado");
                        //System.out.print(rr.retornarDisponibilidad());
                        }else{
                        jButton4.setBackground(colorBase);
                        rr.modificarDisponibilidad(true);
                        //System.out.println("AsientoLiberado");
                        //System.out.println(rr.retornarDisponibilidad());
                        }
                    }
                }
            }
        
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        java.awt.Color colorBase = jButton10.getBackground();
                
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                
                for(Asiento rr : a.retornarSala().retornarListaAsientos()){
                    
                    if(rr.retornarClave().equals("B2")){
                        
                        if(rr.retornarDisponibilidad()==true){
                        jButton5.setBackground(Color.BLUE);
                        rr.modificarDisponibilidad(false);
                        //System.out.println("Asiento tomado");
                        //System.out.print(rr.retornarDisponibilidad());
                        }else{
                        jButton5.setBackground(colorBase);
                        rr.modificarDisponibilidad(true);
                        //System.out.println("AsientoLiberado");
                        //System.out.println(rr.retornarDisponibilidad());
                        }
                    }
                }
            }
        
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        java.awt.Color colorBase = jButton10.getBackground();
                
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                
                for(Asiento rr : a.retornarSala().retornarListaAsientos()){
                    
                    if(rr.retornarClave().equals("C2")){
                        
                        if(rr.retornarDisponibilidad()==true){
                        jButton6.setBackground(Color.BLUE);
                        rr.modificarDisponibilidad(false);
                        //System.out.println("Asiento tomado");
                        //System.out.print(rr.retornarDisponibilidad());
                        }else{
                        jButton6.setBackground(colorBase);
                        rr.modificarDisponibilidad(true);
                        //System.out.println("AsientoLiberado");
                        //System.out.println(rr.retornarDisponibilidad());
                        }
                    }
                }
            }
        
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        java.awt.Color colorBase = jButton10.getBackground();
                
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                
                for(Asiento rr : a.retornarSala().retornarListaAsientos()){
                    
                    if(rr.retornarClave().equals("A3")){
                        
                        if(rr.retornarDisponibilidad()==true){
                        jButton9.setBackground(Color.BLUE);
                        rr.modificarDisponibilidad(false);
                        //System.out.println("Asiento tomado");
                        //System.out.print(rr.retornarDisponibilidad());
                        }else{
                        jButton9.setBackground(colorBase);
                        rr.modificarDisponibilidad(true);
                        //System.out.println("AsientoLiberado");
                        //System.out.println(rr.retornarDisponibilidad());
                        }
                    }
                }
            }
        
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        java.awt.Color colorBase = jButton10.getBackground();
                
        for(Funcion a: cinegestor1.retornarListaFunciones()){
            if(a==funcionEscogida){
                
                for(Asiento rr : a.retornarSala().retornarListaAsientos()){
                    
                    if(rr.retornarClave().equals("C3")){
                        
                        if(rr.retornarDisponibilidad()==true){
                        jButton8.setBackground(Color.BLUE);
                        rr.modificarDisponibilidad(false);
                        //System.out.println("Asiento tomado");
                        //System.out.print(rr.retornarDisponibilidad());
                        }else{
                        jButton8.setBackground(colorBase);
                        rr.modificarDisponibilidad(true);
                        //System.out.println("AsientoLiberado");
                        //System.out.println(rr.retornarDisponibilidad());
                        }
                    }
                }
            }
        
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Vista3().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
