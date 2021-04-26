/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author jorge
 */

//Hacer un programa que calcule y muetre en pantalla el porcentaje descontado en 
//una compra a partir del precio de la tarifa 
//y el precio pagado
public class Producto {
    
    String producto;
    int precioTarifa;
    int precioPagado;

    public Producto(String pProducto, int precioTarifa, int precioPagado) {
        
        this.producto = pProducto;
        this.precioTarifa = precioTarifa;
        this.precioPagado = precioPagado;
    }

    public String getProducto() {
        return producto;
    }

    public int getPrecioTarifa() {
        return precioTarifa;
    }

    public int getPrecioPagado() {
        return precioPagado;
    }
    
    public int procentajeDescontado(){
        
        //Tarifa 100 --> 100%
        //Pagado 20--> 20%
        
        //(Pagado * 100)/tarifa
        
        int temp = (precioPagado*100)/precioTarifa;
        
        return 100 - temp;
    }
    
    
    
}
