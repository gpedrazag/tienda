/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.tienda.tienda_productos;

/**
 *
 * @author USUARIO
 */
public class Tienda {
    
    //Atributos
    private Producto p1;
    private Producto p2;
    private Producto p3;
    private Producto p4;
    
    //private double dineroEnCaja;

    //Constructor con los atributos

    public Tienda() {
        //dineroEnCaja=0;
        p1=new Producto();
        p2=new Producto();
        p3=new Producto();
        p4=new Producto();
    }
    
    
    
    
    //metodos get y Set
 

    public Producto getP1() {
        return p1;
    }

    public void setP1(Producto p1) {
        this.p1 = p1;
    }

    public Producto getP2() {
        return p2;
    }

    public void setP2(Producto p2) {
        this.p2 = p2;
    }

    public Producto getP3() {
        return p3;
    }

    public void setP3(Producto p3) {
        this.p3 = p3;
    }

    public Producto getP4() {
        return p4;
    }

    public void setP4(Producto p4) {
        this.p4 = p4;
    }
    
    
    //Metodos relacionados con requerimientos funcionales
    
    public double calcularDineroEnCaja() {
       return p1.getTotalProductosVendidos()*p1.getValorUnitario()*(1+Producto.IVA_PAPEL)
                + p2.getTotalProductosVendidos()*p2.getValorUnitario()*(1+Producto.IVA_MERCADO)
                + p3.getTotalProductosVendidos()*p3.getValorUnitario()*(1+Producto.IVA_MERCADO)
                + p4.getTotalProductosVendidos()*p4.getValorUnitario()*(1+Producto.IVA_FARMACIA);
        
    }
    
    
}
