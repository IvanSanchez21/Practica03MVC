
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Tiburon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivan
 */
public class ControladorTiburon {
    private List <Tiburon> lista;
    private int codigo;

    public ControladorTiburon() {
        lista = new ArrayList<>();
        codigo = 1;
    }
    
    public void create(Tiburon objeto){
        objeto.setCodigo(codigo);
        codigo++;
        lista.add(objeto);
    }
    
    public Tiburon read(int codigo){
        for(Tiburon tiburon : lista){
            if(tiburon.getCodigo() == codigo){
                return tiburon;
            }
        }
        return null;
    }
    
    public void update(Tiburon objeto){
        for(int i = 0; i < lista.size(); i++){
            Tiburon elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(int codigo){
        for(int i = 0; i < lista.size(); i++){
            Tiburon elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
}
