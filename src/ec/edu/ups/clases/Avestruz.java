
package ec.edu.ups.clases;

/**
 *
 * @author ivan
 */
public class Avestruz extends Terrestre{
    private int tamñanoPico;
    private int tamañoAlas;
    private int longuitudCuello;
    private int numGarras;

    public Avestruz() {
    }

    public Avestruz(int tamñanoPico, int tamañoAlas, int longuitudCuello, int numGarras) {
        this.tamñanoPico = tamñanoPico;
        this.tamañoAlas = tamañoAlas;
        this.longuitudCuello = longuitudCuello;
        this.numGarras = numGarras;
    }

    public Avestruz(int tamñanoPico, int tamañoAlas, int longuitudCuello, int numGarras, int numPatas, String tipoReproduccion, int velocidad, String tipoAlimentacion, int codigo, String tipoAnimal, int tamaño, String tipoHabitad, int peso) {
        super(numPatas, tipoReproduccion, velocidad, tipoAlimentacion, codigo, tipoAnimal, tamaño, tipoHabitad, peso);
        this.tamñanoPico = tamñanoPico;
        this.tamañoAlas = tamañoAlas;
        this.longuitudCuello = longuitudCuello;
        this.numGarras = numGarras;
    }

    public int getTamñanoPico() {
        return tamñanoPico;
    }

    public void setTamñanoPico(int tamñanoPico) {
        this.tamñanoPico = tamñanoPico;
    }

    public int getTamañoAlas() {
        return tamañoAlas;
    }

    public void setTamañoAlas(int tamañoAlas) {
        this.tamañoAlas = tamañoAlas;
    }

    public int getLonguitudCuello() {
        return longuitudCuello;
    }

    public void setLonguitudCuello(int longuitudCuello) {
        this.longuitudCuello = longuitudCuello;
    }

    public int getNumGarras() {
        return numGarras;
    }

    public void setNumGarras(int numGarras) {
        this.numGarras = numGarras;
    }

    @Override
    public String toString() {
        return super.toString()+ "Avestruz{" + "tam\u00f1anoPico=" + tamñanoPico + ", tama\u00f1oAlas=" + tamañoAlas + ", longuitudCuello=" + longuitudCuello + ", numGarras=" + numGarras + '}';
    }

    @Override
    public void alimentarse() {
        System.out.println("La Avestrz se alimenta de gusanos");
    }
    
    
}
