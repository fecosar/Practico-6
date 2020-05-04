/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telefonica;

/**
 *
 * @author Fede
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        Cliente c1 = new Cliente ("Federico", "Sarmiento", "San Luis ", "ATE 1");
        Directorio dir = new Directorio();
        
        dir.agregarCliente(4202235l, c1);   //agrego un cliente
        /*
        Cliente e = dir.buscarCliente(4202235);  //busco un cliente por numero
        System.out.println(e.getApellido());    // visualizo el apellido del numero buscado
        
        for(Integer x : dir.buscarTelefono("Sarmiento")) //muestro numero segun el apellido
            System.out.println(x);                       // visializo los numero segun el apellido
        */
        for(Cliente x : dir.buscarClientes("San Luis")) //muestro numero segun laciudad
            System.out.println(x.getApellido());
            
            
        //dir.borrarCliente(4202235);
    }
     
}
