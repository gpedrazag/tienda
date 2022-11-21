/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.tienda.Interfaz;

/**
 *
 * @author USUARIO
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author gilberto-pedraza
 */
public class PanelProducto extends JPanel implements ActionListener {
    // Declarar referencia a la clase padre
    private InterfazTienda principal;
    
    //Declara rlos atributos del Panel
    //Campo de texto para escribir o modificar el nombre del producto
    private JTextField valNombre;
    private JTextField valTipo;
    private JTextField valValorUnitario;
    private JTextField valCantidadEnBodega;
    //Definir labels para cada atributo
    private JLabel labNombre;
    private JLabel labTipo;
    private JLabel labValorUnitario;
    private JLabel labCantidadEnBodega;
    //Botones para realizar acciones
    private JButton botAdcionar;
    
    
    //Delcarar constructor con la referencia al elemento padre

    public PanelProducto(InterfazTienda principal) {
        //GUardar la referencia al elemento padre
        this.principal = principal;
        
        setLayout (new GridLayout(5,2));
        //Definir el tamano del layout
        setPreferredSize(new Dimension(0,130));
        //Adicionar un titulo
        TitledBorder border= BorderFactory.createTitledBorder("Datos del producto");
        border.setTitleColor(Color.ORANGE);
        this.setBorder(border);
        //Inicializar los objetos del panel
        labNombre=new JLabel ("Nombre");
        labTipo=new JLabel ("Tipo");
        labValorUnitario=new JLabel ("Valor UNitario");
        labCantidadEnBodega=new JLabel ("Cantidad en Bodega");
        
        //Inicializar contenidos
        valNombre=new JTextField("Libretas");
        valTipo=new JTextField("1");
        valValorUnitario=new JTextField("4300");
        valCantidadEnBodega=new JTextField("187");
        //Inicializar el boton
        botAdcionar=new JButton("ADICIONAR");
        botAdcionar.addActionListener(this);

//Adicionar los elememtos gráficos al panel
        add(labNombre);
        add(valNombre);
        
        add(labTipo);
        add(valTipo);
        
        add(labValorUnitario);
        add(valValorUnitario);
        
        add(labCantidadEnBodega);
        add(valCantidadEnBodega);
        
        add(new JLabel(""));
        add (botAdcionar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("Selecciono "+e.getActionCommand());
    }
    
    
}
