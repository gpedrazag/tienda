/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.tienda.tienda_productos;

/**
 *
 * @author USUARIO
 */
class Producto {

    //-----------------------------
    // Constantes
    //-----------------------------
    public final static int PAPELERIA = 1;
    public final static int SUPERMERCADO = 2;
    public final static int DROGUERIA = 3;

    public final static double IVA_PAPEL = 0.16;
    public final static double IVA_FARMACIA = 0.12;
    public final static double IVA_MERCADO = 0.04;

    //Atributos
    private String nombre;
    private int tipo;
    private double valorUnitario;
    private int cantidadBodega;
    private int cantidadMinima;
    private int totalProductosVendidos;

    //Declarar constructor de la clase Producto
    //Constructor con los datos del producto
    public Producto(String nombre, int tipo, double valorUnitario, int cantidadBodega, int cantidadMinima, int totalProductosVendidos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valorUnitario = valorUnitario;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.totalProductosVendidos = totalProductosVendidos;
    }

    public Producto() {
    }

    public Producto(String nombre, int tipo, double valorUnitario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valorUnitario = valorUnitario;
    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public int getTotalProductosVendidos() {
        return totalProductosVendidos;
    }

    public void setTotalProductosVendidos(int totalProductosVendidos) {
        this.totalProductosVendidos = totalProductosVendidos;
    }

    //Metodos relacionados con requerimientos funcionales
    public void venderProducto(int cantidad) {
        // Hay suficientes productos en el bodega
        if (cantidad <= this.cantidadBodega) {
            this.cantidadBodega = this.cantidadBodega - cantidad;
            this.totalProductosVendidos = this.totalProductosVendidos + cantidad;
        }
        // No hay suficientes productos en bodega
       if (cantidad>this.cantidadBodega ){     
           this.totalProductosVendidos+=this.cantidadBodega;
           this.cantidadBodega=0;
       }
    }
//Metodos derivados de las expresiones solicitadas
    public boolean cantidadEsDobleDeCantidadMinima() {

//Expresion: cantidadBodega>=2*cantidadMinima");    
        return this.cantidadBodega >= 2 * this.cantidadMinima;
    }

// metodo incrementar el valor unitario en un porcentaje
    public void incremValorUnitarioPorcentaje(int porcentaje) {
        double incremento;
        incremento = valorUnitario * porcentaje / 100;
        valorUnitario += incremento;
    }
    
    
    //Mostrar el nombre del tipo del producto
    
    public String getNombreTipo2(){
        //retornar "Papeleria" cuando sea PAPELERIA
       
       if (this.tipo==Producto.PAPELERIA)
            return "Papeleria";
        //retornar "Supermercado" cuando sea SUPERMERCADO
        if (this.tipo == Producto.SUPERMERCADO)
            return "Supermercado";
        //retornar "Drogueria" cuando sea DROGUERIA
        if (this.tipo == Producto.DROGUERIA)
            return "Drogueria";
        else
            return "No asignado";
       
    }
    

    public String getNombreTipo(){
        
        switch (this.tipo) {     
        //retornar "Papeleria" cuando sea PAPELERIA
            case Producto.PAPELERIA:
                return "Papeleria"; 
        //retornar "Supermercado" cuando sea SUPERMERCADO
            case Producto.SUPERMERCADO:
                return "Supermercado";
        //retornar "Drogueria" cuando sea DROGUERIA
            case Producto.DROGUERIA:
                return "Drogueria";
            default:
            return "No asignado";
        }
       
    }
}
