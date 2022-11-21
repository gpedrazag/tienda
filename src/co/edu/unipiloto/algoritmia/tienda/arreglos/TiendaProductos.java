/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.tienda.arreglos;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TiendaProductos {

    private static Scanner scan;
    
    public static void mostrar_menu() {
        limpiarConsola();
        System.out.println("****Algoritmia****");
        System.out.println("--Aplicacion La tienda de productos--");
        System.out.println("1. Leer datos de tienda");
        System.out.println("2. Leer producto");
        System.out.println("3. Mostrar los productos de la tienda");
        System.out.println("4. Calcular el valor del inventario");
        System.out.println("5. Precio promedio de productos");
        System.out.println("6. Vender producto");
        System.out.println("9. Terminar");
        System.out.println("Indique el numero de la opcion deseada: ");

    }

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void leerDatosInicialesTienda(Tienda miTienda) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Escriba el nombre de la tienda");
        String nombre = scan.nextLine();
        miTienda.setNombre(nombre);
        //Lee el tamano del arreglo de productos
        System.out.println("Escriba el numero maximo de productos de la tienda");
        int tamano_anterior = 0;
        //Asigna a productos anterior los productos anteriores de la tienda
        Producto[] productos_ant = miTienda.getProductos();
        //Cambia tamano de productos
        int nuevo_tamano=scan.nextInt();
        miTienda.setTamano(nuevo_tamano);
        System.out.println("Se va a cambiar tamano de tienda");
        // Ajustar el tamano de productos
        //Crear un nuevo arreglo de productos
        Producto[] productos_nuevo = new Producto[miTienda.getTamano()];
        // Revisar si el tamano nuevo es inferior al anterior
        if (miTienda.getTamano() < tamano_anterior) {
            //Copiar los productos hasta la nueva posicion y los demás se pierden
            for (int i = 0; i < miTienda.getTamano(); i++) 
                productos_nuevo[i] = productos_ant[i];
            
        } 
        else {
           //Se amplia el tamano del arreglo
           int i=0;
           while (i<miTienda.getTamano()){
               
               if(i<tamano_anterior)
                // Para las posiciones anteriores se trasladan los productos existentes
                   productos_nuevo[i]=productos_ant[i];
               else
                   // Para las posiciones nuevas se inicializa un producto   
                   productos_nuevo[i]=new Producto();
               i++;
           }
          
        }
        miTienda.setProductos(productos_nuevo);
        //scan.close();
    }
    
    //Metodo para leer el nombre del producto
    public static String seleccionarProducto(){
        String nombre;
        nombre=scan.nextLine();
        return nombre;
    }
    
    //Metodo para leer la cantidad de productos
    public static int leerCantidadProducto(){
              
        return scan.nextInt();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int posicion=0;
        int cantidad=0;
        String nombreProducto="";
        scan = new Scanner(System.in);
        Tienda miTienda;
        miTienda = new Tienda();

        int opcion = 0;

        do {

            mostrar_menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    //
                    System.out.println("Leer datos de la tienda");
                    leerDatosInicialesTienda(miTienda);
                    break;
                case 2:
                    //
                    System.out.println("Leer producto en una posicion");
                    miTienda.leerProducto(miTienda.primerUbicacionLibre());
                    break;
                case 3:
                    //
                    System.out.println("Mostrar los productos de la tienda");
                    miTienda.mostrarProductos();
                    break;
                case 4:
                    //
                    System.out.println("Valor actual del inventario "+miTienda.calcularValorInventario());
                    break;
                case 5:
                    //
                    System.out.println("Precio promedio "+miTienda.calcularPrecioPromedio());
                    
                    
                    break;
                case 6:
                    //Vender un producto
                    //Obtener el indice o posicion del producto que se va a vender
                    System.out.println("Venta de productos");
                    System.out.println("Escriba el nombre del producto");
                    nombreProducto=scan.nextLine();
                    posicion=miTienda.buscarProducto(nombreProducto);
                    //Revisar que existe el producto
                    if(posicion!=-1) {
                        System.out.println("Escriba la cantidad a comprar");
                        cantidad=scan.nextInt();
                        miTienda.getProductoCualquiera(posicion).venderProducto(cantidad);
                    }
                    else
                        System.out.println("El producto no existe");
                    break;
                    
            }
            //scan.nextLine();

        } while (opcion != 9);

        scan.close();

        /*
        //Crear un producto
        Producto p1=new Producto ("libreta",Producto.PAPELERIA,5500.0,23,15,87);
        miTienda.setProducto( new Producto ("libreta",Producto.PAPELERIA,5500.0,23,15,87), 0);
        Producto p2=new Producto ("leche",Producto.SUPERMERCADO,2100.0,150,30,30);
        miTienda.setProducto(p2,1);
        
        Producto p3=new Producto ("Jabon",Producto.SUPERMERCADO,4200);
        p3.setCantidadBodega(34);
        miTienda.setProducto(p3,10);
     
        System.out.print("Primer posicion libre ");
        System.out.println(miTienda.primerUbicacionLibre());
        System.out.println("El valor unitario mas barato "+miTienda.productoMasEconomicio());
         */
        //miTienda.leerProducto(2);
        //miTienda.productosToString();
        //System.out.println(" Valor inventario " + miTienda.valorInventario()); 
        //System.out.println("En la posicion 1 "+miTienda.getProductoCualquiera(1).getNombre());
        //System.out.println("En la posicion 0 "+miTienda.getProductoCualquiera(0).getNombre());
        //System.out.println("En la posicion 2 "+miTienda.getProductoCualquiera(2).getNombre());
        /*
        System.out.println("Producto "+miTienda.getP1().getNombre()+" tipo: "+miTienda.getP1().getNombreTipo());
        System.out.println("Producto "+miTienda.getP2().getNombre()+" tipo: "+miTienda.getP2().getNombreTipo());
        System.out.println("Producto "+miTienda.getP3().getNombre()+" tipo: "+miTienda.getP3().getNombreTipo());
        System.out.println("Producto "+miTienda.getP4().getNombre()+" tipo: "+miTienda.getP4().getNombreTipo());
        /*
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
