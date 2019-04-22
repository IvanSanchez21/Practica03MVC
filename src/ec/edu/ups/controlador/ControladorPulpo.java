
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Pulpo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivan
 */
public class ControladorPulpo {
   private List <Pulpo> lista;
    private int codigo;

    public ControladorPulpo() {
        lista = new ArrayList<>();
        codigo = 0;
    }
    
    public void create(Pulpo objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    public Pulpo read(int codigo){
        for(Pulpo pulpo : lista){
            if(pulpo.getCodigo() == codigo){
                return pulpo;
            }
        }
        return null;
    }
    
    public void update(Pulpo objeto){
        for(int i = 0; i < lista.size(); i++){
            Pulpo elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(int codigo){
        for(int i = 0; i < lista.size(); i++){
            Pulpo elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
}
