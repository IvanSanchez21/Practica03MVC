package ec.edu.ups.vista;

import ec.edu.ups.clases.Avestruz;
import ec.edu.ups.clases.Leon;
import ec.edu.ups.controlador.ControladorAvestruz;
import ec.edu.ups.controlador.ControladorLeon;
import ec.edu.ups.controlador.ControladorPulpo;
import ec.edu.ups.controlador.ControladorTiburon;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcionMenuPrincipal = 0;
        int opcionMenuLeon = 0;
        int opcionMenuAvestruz = 0;
        int opcionMenuPulpo = 0;
        int opcionMenuTiburon = 0;

        ControladorLeon leon = new ControladorLeon();
        ControladorAvestruz avestruz = new ControladorAvestruz();
        ControladorPulpo pulpo = new ControladorPulpo();
        ControladorTiburon tiburon = new ControladorTiburon();

        do {

            System.out.println("MENU PRINCIPAL");
            System.out.println("1. CRUD Leon");
            System.out.println("2. CRUD Avestruz");
            System.out.println("3. CRUD Pulpo");
            System.out.println("4. CRUD Tiburón");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            opcionMenuPrincipal = entrada.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    //opcion para el crud aire acondicionado
                    do {
                        System.out.println("MENU LEON");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuLeon = entrada.nextInt();

                        switch (opcionMenuLeon) {
                            case 1:
                                Leon obj = new Leon();

                                System.out.println("Números de Dientes: ");
                                int numDiente = entrada.nextInt();
                                obj.setNumDientes(numDiente);

                                System.out.println("Color del pelaje: ");
                                String colorPelaje = entrada.next();
                                obj.setColorPelaje(colorPelaje);

                                System.out.println("Tamaño Melena: ");
                                int tamañoMelena = entrada.nextInt();
                                obj.setTamañoMelena(tamañoMelena);

                                System.out.println("Medida de las Garras: ");
                                int medGarras = entrada.nextInt();
                                obj.setNumGarras(medGarras);
                                break;

                            case 2:
                                System.out.println("Ingrese el código León");
                                int codigo2 = entrada.nextInt();
                                System.out.println(ControladorLeon.read(codigo2));
                                break;

                            case 3:
                                obj = new Leon();

                                System.out.println("Números de Dientes: ");
                                numDiente = entrada.nextInt();
                                obj.setNumDientes(numDiente);

                                System.out.println("Color del Pelaje: ");
                                colorPelaje = entrada.next();
                                obj.setColorPelaje(colorPelaje);

                                System.out.println("Tamaño de la Melena: ");
                                tamañoMelena = entrada.nextInt();
                                obj.setTamañoMelena(tamañoMelena);

                                System.out.println("Medida de las Garras: ");
                                medGarras = entrada.nextInt();
                                obj.setNumGarras(medGarras);
                                break;

                            case 4:
                                System.out.println("Dato a eliminar");
                                numDiente = entrada.nextInt();
                                ControladorLeon.delete(numDiente)
                                break;

                            case 5:
                                System.out.println("Regresando al menú principal");
                                break;
                        }

                    } while (opcionMenuLeon != 5);
                    break;

                case 2:
                    do {
                        System.out.println("MENU AVESTRUZ");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuAvestruz = entrada.nextInt();

                        switch (opcionMenuAvestruz) {
                            case 1:
                                Avestruz obj = new Avestruz();

                                System.out.println("Tamaño de las Alas: ");
                                int tamañoAlas = entrada.nextInt();
                                obj.setTamañoAlas(tamañoAlas);

                                System.out.println("Longuitud del Cuello: ");
                                String longuitudCuello = entrada.next();
                                obj.setLonguitudCuello(opcionMenuPulpo);

                                System.out.println("Número de Garras: ");
                                int numGarras = entrada.nextInt();
                                obj.setNumGarras(numGarras);

                                System.out.println("Tamaño del Pico: ");
                                int tamañoPico = entrada.nextInt();
                                obj.setTamñanoPico(tamañoPico);
                                break;

                            case 2:
                                System.out.println("Ingrese el codigo de Avestruz");
                                int codigo2 = entrada.nextInt();
                                System.out.println(ControladorAvestruz.read(codigo2));
                                break;

                            case 3:
                                obj = new Avestruz();

                                System.out.println("Tamaño de las Alas: ");
                                tamañoAlas = entrada.nextInt();
                                obj.setTamañoAlas(tamañoAlas);

                                System.out.println("Longuitud del Cuello: ");
                                longuitudCuello = entrada.next();
                                obj.setLonguitudCuello(opcionMenuPulpo);

                                System.out.println("Número de Garras: ");
                                numGarras = entrada.nextInt();
                                obj.setNumGarras(numGarras);

                                System.out.println("Tamaño del Pico: ");
                                tamañoPico = entrada.nextInt();
                                obj.setTamñanoPico(tamañoPico);
                                break;

                            case 4:
                                System.out.println("Ingrese el codigo que va a eliminar");
                                codigo2 = entrada.nextInt();
                                controladorAvestuz.delete(codigo2);
                                break;

                            case 5:
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                    } while (opcionMenuAvestruz != 5);
                    break;

                case 3:
                    //opcion para el crud de computador
                    do {

                    } while (opcionMenuPulpo != 5);
                    break;
                case 4:
                    //opcion para el crud de televisor
                    do {

                    } while (opcionMenuTiburon != 5);
                    break;
                case 5:
                    //opcion para salir
                    System.out.println("Adiós !!!");
                    break;
            }
        } while (opcionMenuPrincipal != 5);
    }

}
