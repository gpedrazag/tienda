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
public class Tienda {
    
    
	//-----------------------------
	// Atributos
	//-----------------------------
	private Producto p1;
	private Producto p2;
	private Producto p3;
	private Producto p4;
	
        
        //Constructor por  defecto

    public Tienda() {
        p1=new Producto();
        p2=new Producto();
        p3=new Producto();
        p4=new Producto();
        
        

    }

    public Tienda(Producto p1, Producto p2, Producto p3, Producto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

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
    
    
    
    
    //Metodos de negocio
    public double calcularDineroEnCaja(){
        
        //Producto libreta
        double valorUnitarioConIVA=p1.getValorUnitario();
        valorUnitarioConIVA+=p1.getValorUnitario()*Producto.IVA_PAPEL;
        double acumulado=p1.getTotalProductosVendidos()*valorUnitarioConIVA;
        // PRODUCTO leche
        valorUnitarioConIVA=p2.getValorUnitario();
        valorUnitarioConIVA+=p2.getValorUnitario()*Producto.IVA_MERCADO;
        acumulado+=p2.getTotalProductosVendidos()*valorUnitarioConIVA;
        // PRODUCTO Jabon
        valorUnitarioConIVA=p3.getValorUnitario();
        valorUnitarioConIVA+=p3.getValorUnitario()*Producto.IVA_MERCADO;
        acumulado+=p3.getTotalProductosVendidos()*valorUnitarioConIVA;
        
        // PRODUCTO Aspirina
        valorUnitarioConIVA=p4.getValorUnitario();
        valorUnitarioConIVA+=p4.getValorUnitario()*Producto.IVA_FARMACIA;
        acumulado+=p4.getTotalProductosVendidos()*valorUnitarioConIVA;
        
        return acumulado;
        
    }
        
        
     public double calcularDineroEnCaja2(){
         return p1.calcularVentas()+p2.calcularVentas()+p3.calcularVentas()+p4.calcularVentas();
     }

    
}
