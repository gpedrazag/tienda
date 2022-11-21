/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.algoritmia.tienda.anterior;

/**
 *
 * @author gilberto-pedraza
 */
public class Producto {

    //-----------------------------
    // Constantes
    //-----------------------------
    public final static int PAPELERIA = 1;
    public final static int SUPERMERCADO = 2;
    public final static int DROGUERIA = 3;

    public final static double IVA_PAPEL = 0.16;
    public final static double IVA_FARMACIA = 0.12;
    public final static double IVA_MERCADO = 0.04;

    //-----------------------------
    // Atributos
    //-----------------------------
    private String nombre;
    private int tipo;
    private double valorUnitario;
    private int cantidadBodega;
    private int cantidadMinima;
    private int totalProductosVendidos;

    //Constructor
    public Producto(String nombre, int tipo, double valorUnitario, int cantidadBodega, int cantidadMinima, int totalProductosVendidos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valorUnitario = valorUnitario;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.totalProductosVendidos = totalProductosVendidos;
    }

    public Producto() {
        this.nombre = "";
        this.tipo = 0;
        this.valorUnitario = 0;
        this.cantidadBodega = 0;
        this.cantidadMinima = 0;
        this.totalProductosVendidos = 0;
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

    public int vender(int cantidad) {
        int cantidadVendida = 0;
        //Cuando cantidad es menor o igual a cantidad en Bodega
        if (cantidad <= cantidadBodega) {
            cantidadVendida = cantidad;
            totalProductosVendidos += cantidadVendida;
            cantidadBodega -= cantidadVendida;
            return cantidadVendida;
        } 
        // Cuando cantidad es mayor a cantidad en bodega
        cantidadVendida = cantidadBodega;
        totalProductosVendidos += cantidadVendida;
        cantidadBodega -= cantidadVendida;
        return cantidadVendida;
    }

    public void nuevaUnidadBodega() {
        cantidadBodega++;

    }

    void incrementarCantidadBodegaEn5() {
        cantidadBodega += 5;
    }

    //Pedir un cierto número de unidades
    public void pedir(int num) {
        cantidadBodega += num;
    }
    
    //Pedir el doble de la cantidad minima
    public void pedir() {
        cantidadBodega+= 2*cantidadMinima;
    }

    public void venderCincoUnidades() {
        this.totalProductosVendidos += 5;
        this.cantidadBodega -= 5;
    }

    public void venderUnidades(int cantidad) {
        this.totalProductosVendidos += cantidad;
        this.cantidadBodega -= cantidad;
    }

    //Incrementar valor unitario
    public void incrementarValorUnitario(double porcentaje) {
        this.valorUnitario += this.valorUnitario * porcentaje;
    }
    
    public double valorUnitarioPapeleria (boolean conIVA){
        // valor unitario Con IVA
        if ( conIVA )
            return valorUnitario+ (valorUnitario*Producto.IVA_PAPEL);
        // valor unitario Sin IVA
        else
            return valorUnitario;        
    }
    public double valorUnitario (boolean conIVA){
        //valor unitario con IVA
        if ( conIVA ){
        //tipo producto PAPELERIA
            if (this.tipo==Producto.PAPELERIA)
                return valorUnitario+ (valorUnitario*Producto.IVA_PAPEL);
            
        //tipo producto SUPERMERCADO
            else if (this.tipo==Producto.SUPERMERCADO)
                return valorUnitario+ (valorUnitario*Producto.IVA_MERCADO);
        //tipo producto DROGUERIA
            return valorUnitario+ (valorUnitario*Producto.IVA_FARMACIA);
        }
        // valor unitario sin IVA
            return valorUnitario;
    }

    
    public double venderConDescuento(int cantidad){
        //El valor de la venta es el valorUnitario+(valorUNItario*IVA)
        //El iva varia en funcion del tipo de producto
        double valorTotal=0.0;
        //Calcular el valor para papeleria
       
        if (this.tipo==Producto.PAPELERIA)
            valorTotal= cantidad*(valorUnitario+(valorUnitario*Producto.IVA_PAPEL));
        else if (this.tipo == Producto.SUPERMERCADO)
            valorTotal= cantidad*(valorUnitario+(valorUnitario*Producto.IVA_MERCADO));
        else
            valorTotal= cantidad*(valorUnitario+(valorUnitario*Producto.IVA_FARMACIA));  
        //Determinar si se aplica el descuento
        if (cantidad >10) {
            valorTotal -= valorTotal*0.1;
            System.out.print("*se aplica descuento*");
        }
        return valorTotal;
    }
    
    
    public double venderConDescuento2 (int cantidad){
        //El valor de la venta es el valorUnitario+(valorUNItario*IVA)
        //El iva varia en funcion del tipo de producto
        double valorTotal=0.0;
        switch (this.tipo){
            case Producto.PAPELERIA:
                valorTotal= cantidad*(valorUnitario+(valorUnitario*Producto.IVA_PAPEL));
                break;
            case Producto.SUPERMERCADO:
                valorTotal= cantidad*(valorUnitario+(valorUnitario*Producto.IVA_MERCADO));
                break;
            case Producto.DROGUERIA:
                valorTotal= cantidad*(valorUnitario+(valorUnitario*Producto.IVA_FARMACIA));
                break;
            default:
                System.out.println("tipo invalido");
                break;
        }
        //Determinar si se aplica el descuento
        if (cantidad >10) {
            valorTotal -= valorTotal*0.1;
            System.out.print("*se aplica descuento*");
        }
        return valorTotal;
    }
    
    public double calcularVentas(){
        return totalProductosVendidos*valorUnitario(true);
    }
}
