
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Avestruz;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author ivan
 */
public class ControladorAvestruz {
    private SortedSet <Avestruz> lista;
    private int codigo;

    public ControladorAvestruz() {
        lista = new TreeSet<>();
        codigo = 0;
    }
    
    public void create(Avestruz objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    public Avestruz read(int codigo){
        for(Avestruz avestruz : lista){
            if(avestruz.getCodigo() == (codigo)){
                return avestruz;
            }
        }
        return null;
    }
    
    public void update(Avestruz objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for(Avestruz objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
    }
    
    //revisar get.Codigo
    public void imprimir(){
        for (Avestruz avestruz : lista) {
            System.out.println(avestruz.getTipoAnimal());
        }
    }
}
