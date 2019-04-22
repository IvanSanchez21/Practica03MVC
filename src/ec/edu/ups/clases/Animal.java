package ec.edu.ups.clases;

/**
 *
 * @author ivan
 */
public abstract class Animal {

    private int codigo;
    private String tipoAnimal;
    private int tamaño;
    private String tipoHabitad;
    private int peso;
    
    public Animal() {
    }

    public Animal(int codigo, String tipoAnimal, int tamaño, String tipoHabitad, int peso) {
        this.codigo = codigo;
        this.tipoAnimal = tipoAnimal;
        this.tamaño = tamaño;
        this.tipoHabitad = tipoHabitad;
        this.peso = peso;
    }

    public Animal(int tamaño, int peso) {
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipoHabitad() {
        return tipoHabitad;
    }

    public void setTipoHabitad(String tipoHabitad) {
        this.tipoHabitad = tipoHabitad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "codigo=" + codigo + ", tipoAnimal=" + tipoAnimal + ", tama\u00f1o=" + tamaño + ", tipoHabitad=" + tipoHabitad + ", peso=" + peso + '}';
    }

    public abstract void alimentarse();
    

}
