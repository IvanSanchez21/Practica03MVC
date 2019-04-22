package ec.edu.ups.controlador;

import ec.edu.ups.clases.Leon;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ivan
 */
public class ControladorLeon {

    private Set<Leon> lista;
    private int codigo;

    public ControladorLeon() {
        lista = new HashSet<>();
        codigo = 0;
    }
    
    public void create(Leon objeto){
        codigo++;
        objeto.setCodigo(this.codigo);
        lista.add(objeto);
    }
    
    public Leon read(int codigo){
        for(Leon leon : lista){
            if(codigo == leon.getCodigo()){
                return leon;
            }
        }
        return null;
    }
    
    public void update(Leon objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        
        for(Leon objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
        
    }
    
    public void imprimir(){
        for (Leon leon : lista) {
            System.out.println(leon.getTipoAnimal());
        }
    }
}
