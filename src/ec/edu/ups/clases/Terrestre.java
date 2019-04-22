package ec.edu.ups.clases;

/**
 *
 * @author ivan
 */
public abstract class Terrestre extends Animal {

    private int numPatas;
    private String tipoReproduccion;
    private int velocidad;
    private String tipoAlimentacion;

    public Terrestre() {
    }

    public Terrestre(int numPatas, String tipoReproduccion, int velocidad, String tipoAlimentacion) {
        this.numPatas = numPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.velocidad = velocidad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Terrestre(int numPatas, String tipoReproduccion, int velocidad, String tipoAlimentacion, int codigo, String tipoAnimal, int tamaño, String tipoHabitad, int peso) {
        super(codigo, tipoAnimal, tamaño, tipoHabitad, peso);
        this.numPatas = numPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.velocidad = velocidad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public String toString() {
        return super.toString()+ "Terrestre{" + "numPatas=" + numPatas + ", tipoReproduccion=" + tipoReproduccion + ", velocidad=" + velocidad + ", tipoAlimentacion=" + tipoAlimentacion + '}';
    }

}
