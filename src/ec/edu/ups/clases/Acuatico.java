package ec.edu.ups.clases;

/**
 *
 * @author ivan
 */
public abstract class Acuatico extends Animal {

    private String tipoAgua;
    private int profundidad;
    private int velocidad;
    private String tipoAlimentacion;

    public Acuatico() {
    }

    public Acuatico(String tipoAgua, int profundidad, int velocidad, String tipoAlimentacion) {
        this.tipoAgua = tipoAgua;
        this.profundidad = profundidad;
        this.velocidad = velocidad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Acuatico(String tipoAgua, int profundidad, int velocidad, String tipoAlimentacion, int codigo, String tipoAnimal, int tamaño, String tipoHabitad, int peso) {
        super(codigo, tipoAnimal, tamaño, tipoHabitad, peso);
        this.tipoAgua = tipoAgua;
        this.profundidad = profundidad;
        this.velocidad = velocidad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
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
        return super.toString() + "Acuatico{" + "tipoAgua=" + tipoAgua + ", profundidad=" + profundidad + ", velocidad=" + velocidad + ", tipoAlimentacion=" + tipoAlimentacion + '}';
    }

}
