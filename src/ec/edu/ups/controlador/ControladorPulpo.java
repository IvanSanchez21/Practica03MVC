
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Pulpo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivan
 */
public class ControladorPulpo {
    private List<Pulpo> lista;

    public ControladorPulpo() {
        lista = new ArrayList<>();
    }
    
    public void create(Pulpo objeto){
        lista.add(objeto);
    }
    
    public Pulpo read(int codigo){
        for (Pulpo pulpo : lista) {
            if(pulpo.getCodigo() == codigo){
                return pulpo;
            }
        }
        return null;
    }
    
    public void update(Pulpo objeto){
        for (int i = 0; i < lista.size(); i++) {
            Pulpo elemento = lista.get(i);
            if(elemento.equals(objeto)){
                lista.set(i, objeto);
                break;
            }            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Pulpo elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);                
                break;
            }            
        }
    }
}
