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
public class Tienda {
    // Declarar un arreglo de datos

    private Producto[] productos;
    //Mantiene el tamano del arreglo
    private int tamano;
    //nombre de la tienda
    private String nombre;

    //Atributos
    //Constructor con los atributos
    public Tienda() {
        //dineroEnCaja=0;
        tamano = 5;
        nombre=" ";
        productos = new Producto[tamano];
        //inicializar cada producto
        for (int i = 0; i < tamano; i++) {
            productos[i] = new Producto();
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    
    public Producto[] getProductos() {
        return productos;
    }

    //metodos get y Set
    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    //Crear metodo get para traer el producto de la posicion i-esim
    public Producto getProductoCualquiera(int posicion) {
        return productos[posicion];
    }

    //Metodo para almacenar un producto cualquiera en un posicion i-esima del arreglo
    public void setProducto(Producto contenido, int posicion) {
        if (posicion < tamano) {
            this.productos[posicion] = contenido;
        } else {
            System.out.println("La posicion " + posicion + " excede el tamano del arreglo");
        }
    }

    //Metodos relacionados con requerimientos funcionales
    public double calcularDineroEnCaja() {
        return 0.0;

    }

    //Mostrar el contenido del arreglo
    public void productosToString() {
        for (int i = 0; i < tamano; i++) {
            System.out.println("Producto en posicion " + i + " es " + productos[i].getNombre());
        }
    }

    public double valorInventario() {
        double acumulador = 0;
        for (int i = 0; i < tamano; i++) {
            acumulador += productos[i].getValorUnitario() * productos[i].getCantidadBodega();
            System.out.println("El producto " + productos[i].getNombre() + " vale "
                    + productos[i].getValorUnitario() * productos[i].getCantidadBodega());

        }
        return acumulador;
    }

    //Leer los datos del iesimo producto
    public void leerProducto(int posicion) {
        System.out.println("Programa de manejo de tienda");
        System.out.println("Indique los datos del producto");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el nombre ");
        String nombre = sc.nextLine();
        productos[posicion].setNombre(nombre);
        //Leer el tipo de producto
        System.out.println("Escriba el tipo de producto: 1. Papeleria, 2. SUpermercado, 3.Drogueria");
        productos[posicion].setTipo(sc.nextInt());
        //Leer valor unitario
        System.out.println("Escriba el Valor unitario");
        productos[posicion].setValorUnitario(sc.nextDouble());
        //Leer cantidad en bodega
        System.out.println("Escriba la cantidad actual en bodega");
        productos[posicion].setCantidadBodega(sc.nextInt());
        //Leer cantidad minima
        System.out.println("Escriba la cantidad minima para pedido");
        productos[posicion].setCantidadMinima(sc.nextInt());
        //Leer total productos vendidos
        System.out.println("Escriba el total de productos vendidos");
        productos[posicion].setTotalProductosVendidos(sc.nextInt());

    }

    //Encontrar la posicion (indice) donde no se ha almacenado un producto
    public int primerUbicacionLibre() {
        int i = 0;

        //Mientras que un contador < posicion
        while (i < tamano) {

            //Preguntar si la posicion esta libre nombre==""
            if (productos[i].getNombre() == null) // visitamos siguiente
            {
                return i;
            } else {
                i++;
            }

        }
        return -1;
    }

    //Metodo para encontrar el producto mas barato
    public double productoMasEconomicio() {
        // crear el candidato a mas barato
        double masEconomico = 999999999.0;
        int i = 0;
        // Ir comparando el candidato con cada producto
        while (i < tamano) {
            if (productos[i] != null)
                if(productos[i].getValorUnitario() !=0.0)
                if (productos[i].getValorUnitario() < masEconomico) 
                    masEconomico = productos[i].getValorUnitario();
              
                i++;
            }

        // Al final candidato es el mas barato
        return masEconomico;

    }
    
    //Mostrar todos los productos
    
    public void mostrarProductos(){
        for (int i=0;i<this.tamano;i++)
            productos[i].mostrarProducto();
    }
    
    
    //Calcular el valor del inventario de la tienda
    
    public double calcularValorInventario(){
        double acumulador=0.0;
        for (int i = 0; i < tamano; i++) {
            //Para cada producto acumular la cantidad en bodega x el valor unitario
            acumulador += productos[i].getCantidadBodega()*productos[i].getValorUnitario();
        }
        return acumulador;
    }

    
    //Calcular el precio promedio de los productos
    public double calcularPrecioPromedio(){
        double acumulador=0.0;
        
        for (int i = 0; i < tamano; i++) {
            //Acumular los precios de los productos
            acumulador+=productos[i].getValorUnitario();
        }
        
        //Dividir la suma total de los productos en el numero de productos
        return acumulador/tamano;
    }
    
    //Mostrar los nombres de los productos
    
    
    public void mostrarListaProductos(){
        for (int i=0;i<this.tamano;i++)
            System.out.println(productos[i].getNombre());
    }

    public int buscarProducto(String nombreProducto) {
        for (int i=0;i<this.tamano;i++)
            if (productos[i]!=null && productos[i].getNombre().equals(nombreProducto))
                return i;
        return -1;
    }
    
    
}
