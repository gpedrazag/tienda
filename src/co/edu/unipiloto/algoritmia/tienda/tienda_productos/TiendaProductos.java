/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.tienda.tienda_productos;

/**
 *
 * @author USUARIO
 */
public class TiendaProductos {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Tienda miTienda;
        miTienda=new Tienda();
        Producto p1=new Producto ("libreta",Producto.PAPELERIA,5500.0,23,15,87);
        miTienda.setP1(p1);
        Producto p2=new Producto ("leche",Producto.SUPERMERCADO,2100.0,150,30,30);
        miTienda.setP2(p2);
        
        Producto p3=new Producto ("Jabon",Producto.SUPERMERCADO,4200);
        p3.setCantidadBodega(34);
        miTienda.setP3(p3);
        
        System.out.println("Producto "+miTienda.getP1().getNombre()+" tipo: "+miTienda.getP1().getNombreTipo());
        System.out.println("Producto "+miTienda.getP2().getNombre()+" tipo: "+miTienda.getP2().getNombreTipo());
        System.out.println("Producto "+miTienda.getP3().getNombre()+" tipo: "+miTienda.getP3().getNombreTipo());
        System.out.println("Producto "+miTienda.getP4().getNombre()+" tipo: "+miTienda.getP4().getNombreTipo());
        /*
        System.out.println("La expresion valorUnitario * cantidadBodega / cantidadMinima =");
        System.out.println(p1.getValorUnitario()*p1.getCantidadBodega()/p1.getCantidadMinima());
        
        System.out.println("La expresion valorUnitario * totalProductosVendidos * IVA_MERCADO =");
        System.out.println(p2.getValorUnitario()*p2.getTotalProductosVendidos()* Producto.IVA_MERCADO);
    
        System.out.println("libreta: Valor de venta de un producto con IVA del 16%");
        System.out.println(p1.getValorUnitario()+ ( p1.getValorUnitario()*Producto.IVA_PAPEL));
        
        System.out.println("leche: Numero de unidades que se deben vender para alcanzar el tope minimo");
        System.out.println(p2.getCantidadBodega()-p2.getCantidadMinima());
        
        
        System.out.println(" expresion dineroEnCaja–(p2.darCantidadMinima ( ) *  p2.darValorUnitario ( ) )");
        System.out.println(miTienda.calcularDineroEnCaja()-(p2.getCantidadMinima()*p2.getValorUnitario()));
        
        //Expresiones logicas
        
        System.out.println("expresion: cantidadBodega>=2*cantidadMinima");
        //System.out.println(p1.getCantidadBodega( )>= 2* p1.getCantidadMinima());
        
        System.out.println("Para "+p1.getNombre()+ " cantidad bodega es el doble de cantidad minima? "+p1.cantidadEsDobleDeCantidadMinima());
       System.out.println("Para "+p2.getNombre()+ " cantidad bodega es el doble de cantidad minima? "+p2.cantidadEsDobleDeCantidadMinima());

       */
    }
}
