
package Telefonica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class Directorio {
    
    private TreeMap <Long, Cliente> dir = new TreeMap<>();

    public Directorio() {
        dir = new TreeMap<>();
    }
    
    public void agregarCliente(Long num, Cliente cliente)
    {
        dir.put(num, cliente);  
    }
    
    public Cliente buscarCliente(Long num)
    {
        return dir.get(num);         
    }
    
    public ArrayList<Long> buscarTelefono (String apellido)
    {
        ArrayList<Long> telefono = new ArrayList<>();
        Set <Long> numero = dir.keySet();
        Iterator it = numero.iterator();
        while(it.hasNext()){
            Long tel =  (Long) it.next();
            Cliente c = dir.get(tel);
            if(c.getApellido().equals(apellido))
            {
               telefono.add(tel);
            }
            else
                System.out.println("no se encuentra");
        }
        return telefono; 
    }
    
    public ArrayList<Cliente> buscarClientes(String ciudad)
    {
        ArrayList<Cliente> clientes = new ArrayList<>();  
        
        Set <Long> numero = dir.keySet();
        Iterator it = numero.iterator();
        while(it.hasNext())
        {
            Long tel =  (Long) it.next();
            Cliente c = dir.get(tel);
            if(c.getCiudad().equals(ciudad)) {
                clientes.add(c);
                System.out.println("se guardo");
            }
            else 
                System.out.println("no se encuentra");
        }
        return clientes;
    }

    public void borrarCliente(int num)
    {
        for (int i = 0; i < dir.size(); i++)
        {
            if (dir.containsValue(num))
            {
                dir.remove(i);
                System.out.println("el cliente a sido borrado");
            }
        }
    }
     
}

