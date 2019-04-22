
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Avestruz;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author ivan
 */
public class ControladorAvestruz {
    private SortedSet<Avestruz> listaOrdenada;
    private int codigo;

    public ControladorAvestruz() {
        listaOrdenada = new TreeSet<>();
        codigo = 1;
    }
    
    public void create(Avestruz objeto){
        codigo++;
        objeto.setCodigo(codigo);
        listaOrdenada.add(objeto);
    }
    
    public Avestruz read(int codigo){
        for (Avestruz avestruz : listaOrdenada) {
            if(avestruz.getCodigo() == codigo){
                return avestruz;
            }
        }
        return null;
    }            
    
    public void update(Avestruz objeto){
        if(listaOrdenada.contains(objeto)){
            listaOrdenada.remove(objeto);
            listaOrdenada.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (Avestruz avestruz : listaOrdenada) {
            if(avestruz.getCodigo() == codigo){
                listaOrdenada.remove(avestruz);
                break;
            }
        }
    }
    
    public void printAll(){
        System.out.println("Lista Ordenada por nombre");
        for (Avestruz avestruz : listaOrdenada) {
            System.out.println(avestruz);
        }
    }
}
