package ec.edu.ups.clases;



/**
 *
 * @author ivan
 */
public class Tiburon extends Acuatico {

    private int numAletas;
    private int numDientes;
    private int numBranquias;
    private String color;

    public Tiburon() {
    }

    public Tiburon(int numAletas, int numDientes, int numBranquias, String color) {
        this.numAletas = numAletas;
        this.numDientes = numDientes;
        this.numBranquias = numBranquias;
        this.color = color;
    }

    public Tiburon(int numAletas, int numDientes, int numBranquias, String color, String tipoAgua, int profundidad, int velocidad, String tipoAlimentacion, int codigo, String tipoAnimal, int tamaño, String tipoHabitad, int peso) {
        super(tipoAgua, profundidad, velocidad, tipoAlimentacion, codigo, tipoAnimal, tamaño, tipoHabitad, peso);
        this.numAletas = numAletas;
        this.numDientes = numDientes;
        this.numBranquias = numBranquias;
        this.color = color;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    public int getNumDientes() {
        return numDientes;
    }

    public void setNumDientes(int numDientes) {
        this.numDientes = numDientes;
    }

    public int getNumBranquias() {
        return numBranquias;
    }

    public void setNumBranquias(int numBranquias) {
        this.numBranquias = numBranquias;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Tiburon{" + "numAletas=" + numAletas + ", numDientes=" + numDientes + ", numBranquias=" + numBranquias + ", color=" + color + '}';
    }

    @Override
    public void alimentarse() {
        System.out.println("El tiburón se alimenta de peces, focas, etc.");
    }

    
}
