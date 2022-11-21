/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.tienda.Interfaz;

/**
 *
 * @author USUARIO
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unipiloto.algoritmia.tienda.interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author gilberto-pedraza
 */
public class InterfazTienda extends JFrame {
    //Declarar oos paneles
    private PanelProducto panelProducto;
    public InterfazTienda() {
    
        this.setTitle ("La tienda de productos");
        this.setSize(290,360);
        this.setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Definir el distribuir de elementos
        this.setLayout(new BorderLayout());
        
        //Crear los paneles
        panelProducto=new PanelProducto(this);
        this.add(panelProducto,BorderLayout.NORTH);
    }
    
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar instancia de JFrame InterfazUsuario
        InterfazTienda interfazTienda=new InterfazTienda();
        interfazTienda.setVisible(true);
    }
}
