
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Pulpo;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ivan
 */
public class ControladorPulpo {
   private Map<Integer, Pulpo> lista;
    private int codigo;

    public ControladorPulpo() {
        lista = new TreeMap<>();
        codigo = 0;
    }
    
    public void create(Pulpo objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
    }
    
    public Pulpo read(int codigo){
        if(lista.get(codigo) != null){
            return lista.get(codigo);
        }
        return null;
    }
    
    public void update(Pulpo objeto){
        lista.put(objeto.getCodigo(), objeto);
    }
    
    public void delete(int codigo){
        lista.remove(codigo);
    }
    
    public void imprimir(){
        System.out.println(lista.entrySet());
    }
}
