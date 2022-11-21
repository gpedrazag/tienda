/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.algoritmia.tienda.anterior;

import java.util.Scanner;


/**
 *
 * @author gilberto-pedraza
 */
public class Algoritmia_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        Tienda miTienda=new Tienda();
        int c=0;
        // System.out.println("El valor actual de ventas es "+miTienda.calcularDineroEnCaja());
               
        
        //System.out.println("Expreseion salario*0.1+salario "+(1000*(1+0.1)));
        Producto libreta=new Producto("libreta",Producto.PAPELERIA,5500,23,15,87);
        Producto leche=new Producto ("Leche en bolsa de 1 litro",Producto.SUPERMERCADO,2100,150,30,30);
        Producto jabon=new Producto ("Jabón en polvo kilo",Producto.SUPERMERCADO,4200,15,50,80);
        Producto aspirina=new Producto ("Aspirina caja 12 unidades",Producto.DROGUERIA,2400,60,100,200);
        
        //Asignar productos a la tienda
        miTienda.setP1(libreta);
        miTienda.setP2(leche);
        miTienda.setP3(jabon);
        miTienda.setP4(aspirina);
        
        System.out.println("Total ventas en la tienda (metodo extenso) "+miTienda.calcularDineroEnCaja());
        System.out.println("Total ventas en la tienda (metodo abreviado "+miTienda.calcularDineroEnCaja2());
        /*
        System.out.println("Indique la cantidad a vender de "+miTienda.getP1().getNombre());
        c=scan.nextInt();
        System.out.println("El valor a pagar"+miTienda.getP1().getNombre()+" es "+miTienda.getP1().venderConDescuento2(c));
        
        System.out.println("Indique la cantidad a vender de "+miTienda.getP2().getNombre());
        c=scan.nextInt();
        System.out.println("El valor a pagar"+miTienda.getP2().getNombre()+" es "+miTienda.getP2().venderConDescuento2(c));
        
        System.out.println("Indique la cantidad a vender de "+miTienda.getP3().getNombre());
        c=scan.nextInt();
        System.out.println("El valor a pagar"+miTienda.getP3().getNombre()+" es "+miTienda.getP3().venderConDescuento2(c));
        
        */
       // System.out.println("El valor actual de ventas es "+miTienda.calcularDineroEnCaja());
       
        // System.out.println("Indique la cantidad a vender ");
        //c=scan.nextInt();
        //System.out.println("Se vendieron "+libreta.vender(c));
        
        /*
        System.out.println("valor unitario "+miTienda.getP1().getNombre()+" con iva "+miTienda.getP1().valorUnitario(true));
        System.out.println("valor unitario "+miTienda.getP1().getNombre()+" sin iva "+miTienda.getP1().valorUnitario(false));
        
        System.out.println("valor unitario "+miTienda.getP2().getNombre()+" con iva "+miTienda.getP2().valorUnitario(true));
        System.out.println("valor unitario "+miTienda.getP2().getNombre()+" sin iva "+miTienda.getP2().valorUnitario(false));
 
        System.out.println("valor unitario "+miTienda.getP3().getNombre()+" con iva "+miTienda.getP3().valorUnitario(true));
        System.out.println("valor unitario "+miTienda.getP3().getNombre()+" sin iva "+miTienda.getP3().valorUnitario(false));
        
        System.out.println("valor unitario "+miTienda.getP4().getNombre()+" con iva "+miTienda.getP4().valorUnitario(true));
        System.out.println("valor unitario sin iva "+miTienda.getP4().getNombre()+" "+miTienda.getP4().valorUnitario(false));        
        */
        
        /*System.out.println("La cantidad actual de libretas es "+libreta.getCantidadBodega());
        System.out.println("ventas del producto "+libreta.getTotalProductosVendidos());
        System.out.println("Cuantas unidades va a vender");
        int unidades=scan.nextInt();
        libreta.venderUnidades(unidades);
        System.out.println("Se vendieron "+unidades+ " unidades ");
        System.out.println("La cantidad actual de libretas es "+libreta.getCantidadBodega());
        System.out.println("ventas del producto "+libreta.getTotalProductosVendidos());
        */
        /*
        System.out.println("El valor unitario de libretas es "+libreta.getValorUnitario());
        System.out.println("Cual es el porcentaje de incremento ");
        double incremento=scan.nextDouble();
        incremento=incremento/100;
        libreta.incrementarValorUnitario(incremento);
        System.out.println("El nuevo valor unitario de libretas es "+libreta.getValorUnitario());
        */
// libreta.incrementarCantidadBodegaEn5();
       // System.out.println("La cantidad actual de libretas incrrementada en 5 "+libreta.getCantidadBodega());
        
        //double resultado=(libreta.getValorUnitario()* libreta.getCantidadBodega() / libreta.getCantidadMinima());
        //System.out.println("Cuarta expresion: "+resultado);
    }
    
}
