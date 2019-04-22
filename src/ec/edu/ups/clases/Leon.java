
package ec.edu.ups.clases;

import ec.edu.ups.inferfaces.Acciones;

/**
 *
 * @author ivan
 */
public class Leon extends Terrestre implements Acciones {
    private int numDientes;
    private String colorPelaje;
    private int tamañoMelena;
    private int numGarras;

    public Leon() {
    }

    public Leon(int numDientes, String colorPelaje, int tamañoMelena, int numGarras) {
        this.numDientes = numDientes;
        this.colorPelaje = colorPelaje;
        this.tamañoMelena = tamañoMelena;
        this.numGarras = numGarras;
    }

    public Leon(int numDientes, String colorPelaje, int tamañoMelena, int numGarras, int numPatas, String tipoReproduccion, int velocidad, String tipoAlimentacion, int codigo, String tipoAnimal, int tamaño, String tipoHabitad, int peso) {
        super(numPatas, tipoReproduccion, velocidad, tipoAlimentacion, codigo, tipoAnimal, tamaño, tipoHabitad, peso);
        this.numDientes = numDientes;
        this.colorPelaje = colorPelaje;
        this.tamañoMelena = tamañoMelena;
        this.numGarras = numGarras;
    }

    public int getNumDientes() {
        return numDientes;
    }

    public void setNumDientes(int numDientes) {
        this.numDientes = numDientes;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public int getTamañoMelena() {
        return tamañoMelena;
    }

    public void setTamañoMelena(int tamañoMelena) {
        this.tamañoMelena = tamañoMelena;
    }

    public int getNumGarras() {
        return numGarras;
    }

    public void setNumGarras(int numGarras) {
        this.numGarras = numGarras;
    }

    @Override
    public String toString() {
        return super.toString()+ "Leon{" + "numDientes=" + numDientes + ", colorPelaje=" + colorPelaje + ", tama\u00f1oMelena=" + tamañoMelena + ", numGarras=" + numGarras + '}';
    }
    
    @Override
    public void alimentarse(){
        System.out.println("El León se alimenta de la carne.");
    }

    //metodos de implementacin de la clase Acciones
    @Override
    public String jugando() {
        return super.getTipoAnimal()+ "esta jugando";
    }

    @Override
    public String durmiendo() {
        return super.getTipoAnimal()+" esta durmiendo";
    }
    
}
