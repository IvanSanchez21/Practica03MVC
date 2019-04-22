
package ec.edu.ups.clases;

/**
 *
 * @author ivan
 */
public class Pulpo extends Acuatico{
    private int numTentaculos;
    private String colorTinta;
    private int longuitudTentaculos;
    private int numVentosas;

    public Pulpo() {
    }

    public Pulpo(int numTentaculos, String colorTinta, int longuitudTentaculos, int numVentosas) {
        this.numTentaculos = numTentaculos;
        this.colorTinta = colorTinta;
        this.longuitudTentaculos = longuitudTentaculos;
        this.numVentosas = numVentosas;
    }

    public Pulpo(int numTentaculos, String colorTinta, int longuitudTentaculos, int numVentosas, String tipoAgua, int profundidad, int velocidad, String tipoAlimentacion, int codigo, String tipoAnimal, int tamaño, String tipoHabitad, int peso) {
        super(tipoAgua, profundidad, velocidad, tipoAlimentacion, codigo, tipoAnimal, tamaño, tipoHabitad, peso);
        this.numTentaculos = numTentaculos;
        this.colorTinta = colorTinta;
        this.longuitudTentaculos = longuitudTentaculos;
        this.numVentosas = numVentosas;
    }

    public int getNumTentaculos() {
        return numTentaculos;
    }

    public void setNumTentaculos(int numTentaculos) {
        this.numTentaculos = numTentaculos;
    }

    public String getColorTinta() {
        return colorTinta;
    }

    public void setColorTinta(String colorTinta) {
        this.colorTinta = colorTinta;
    }

    public int getLonguitudTentaculos() {
        return longuitudTentaculos;
    }

    public void setLonguitudTentaculos(int longuitudTentaculos) {
        this.longuitudTentaculos = longuitudTentaculos;
    }

    public int getNumVentosas() {
        return numVentosas;
    }

    public void setNumVentosas(int numVentosas) {
        this.numVentosas = numVentosas;
    }

    @Override
    public String toString() {
        return super.toString()+ "Pulpo{" + "numTentaculos=" + numTentaculos + ", colorTinta=" + colorTinta + ", longuitudTentaculos=" + longuitudTentaculos + ", numVentosas=" + numVentosas + '}';
    }

    @Override
    public void alimentarse() {
        System.out.println("El pulpo se alimenta de peces pequeños y cangrejos.");
    }
    
    
    
}
