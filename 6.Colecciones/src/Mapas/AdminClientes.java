
package Mapas;

import com.cmc.entidades.Cliente;
import java.util.HashMap;


public class AdminClientes {
    private HashMap<String, Cliente> clientes;
    
    public AdminClientes(){
        clientes = new HashMap<String, Cliente>();
    }
    
    public void agregarCliente(Cliente cliente){
        if(!clientes.containsKey(cliente.getCedula())){
            clientes.put(cliente.getCedula(), cliente);
        }
    }
    
    public Cliente recuperar(String cedula){
        return clientes.get(cedula);
    }
}
