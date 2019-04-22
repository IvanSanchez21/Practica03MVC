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

    public void crear(Leon objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }

    public Leon read(int codigo) {
        for (Leon leon : lista) {
            if (leon.getCodigo() == codigo) {
                return leon;
            }
        }
        return null;
    }

    public void update(Leon objeto) {
        if (lista.contains(objeto)) {
            lista.remove(objeto);
            lista.add(objeto);
        }
    }

    public void delete(int codigo) {
        for (Leon leon : lista) {
            if (leon.getCodigo() == codigo) {
                lista.remove(leon);
                break;
            }
        }
    }

}
