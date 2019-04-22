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
                                System.out.print("Ingrese el tipo de Animal: ");
                                String animal = entrada.next();
                                System.out.print("Ingrese tamaño: ");
                                int tamaño = entrada.nextInt();
                                System.out.print("Ingrese tipo de Habitad: ");
                                String habitad = entrada.next();
                                System.out.print("Ingrese el Peso del Animal: ");
                                int peso = entrada.nextInt();
                                
                                System.out.print("Ingrese el número de Patas: ");
                                String Patas = entrada.next();
                                System.out.print("Tipo de reproducción: ");
                                String reproduccion = entrada.next();
                                System.out.print("Velocidad: ");
                                int velocidad = entrada.nextInt();
                                System.out.print("Tipo de Comida: ");
                                String comida = entrada.next();
                                
                                System.out.print("Ingrese números de Dientes del León: ");
                                int diente = entrada.nextInt();
                                System.out.println("Color del pelaje: ");
                                String pelaje = entrada.next();
                                System.out.println("Tamaño Melena: ");
                                int melena = entrada.nextInt();
                                System.out.println("Medida de las Garras: ");
                                int garras = entrada.nextInt();
                                
                                Leon objeto = new Leon(diente, pelaje, melena, garras, garras, reproduccion, velocidad, reproduccion, peso, animal, tamaño, habitad, peso);
                                leon.create(objeto);
                                break;

                            case 2:
                                System.out.println("Ingrese el código León");
                                int codigo = entrada.nextInt();
                                System.out.println(leon.read(codigo));
                                break;

                            case 3:
                                System.out.println("Ingrese el codigo del profesional");
                                codigo = entrada.nextInt();
                                
                                if (leon.read(codigo) != null) {
                                System.out.print("Ingrese el tipo de Animal: ");
                                animal = entrada.next();
                                System.out.print("Ingrese tamaño: ");
                                tamaño = entrada.nextInt();
                                System.out.print("Ingrese tipo de Habitad: ");
                                habitad = entrada.next();
                                System.out.print("Ingrese el Peso del Animal: ");
                                peso = entrada.nextInt();
                                
                                System.out.print("Ingrese el número de Patas: ");
                                Patas = entrada.next();
                                System.out.print("Tipo de reproducción: ");
                                reproduccion = entrada.next();
                                System.out.print("Velocidad: ");
                                velocidad = entrada.nextInt();
                                System.out.print("Tipo de Comida: ");
                                comida = entrada.next();
                                
                                System.out.print("Ingrese números de Dientes del León: ");
                                diente = entrada.nextInt();
                                System.out.println("Color del pelaje: ");
                                pelaje = entrada.next();
                                System.out.println("Tamaño Melena: ");
                                melena = entrada.nextInt();
                                System.out.println("Medida de las Garras: ");
                                garras = entrada.nextInt();
                                
                                objeto = new Leon(diente, pelaje, melena, garras, garras, reproduccion, velocidad, reproduccion, codigo, animal, tamaño, habitad, peso);
                                objeto.setCodigo(codigo);
                                leon.update(objeto);
                                }else {
                                    System.out.println("El tipo de león no existe");
                                }
                                break;

                            case 4:
                                System.out.println("Ingrese el codigo del leòn que va a eliminar");
                                codigo = entrada.nextInt();
                                leon.delete(codigo);
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
                                System.out.print("Ingrese el tipo de Animal: ");
                                String animal = entrada.next();
                                System.out.print("Ingrese tamaño: ");
                                int tamaño = entrada.nextInt();
                                System.out.print("Ingrese tipo de Habitad: ");
                                String habitad = entrada.next();
                                System.out.print("Ingrese el Peso del Animal: ");
                                int peso = entrada.nextInt();
                                
                                System.out.print("Ingrese el número de Patas: ");
                                String Patas = entrada.next();
                                System.out.print("Tipo de reproducción: ");
                                String reproduccion = entrada.next();
                                System.out.print("Velocidad: ");
                                int velocidad = entrada.nextInt();
                                System.out.print("Tipo de Comida: ");
                                String comida = entrada.next();
                                
                                System.out.println("Tamaño de las Alas: ");
                                int alas = entrada.nextInt();
                                System.out.println("Longuitud del Cuello: ");
                                String cuello = entrada.next();
                                System.out.println("Número de Garras: ");
                                int garras = entrada.nextInt();
                                System.out.println("Tamaño del Pico: ");
                                int pico = entrada.nextInt();
                                
                                Avestruz objeto = new Avestruz(tamaño, tamaño, pico, garras, alas, reproduccion, velocidad, reproduccion, pico, animal, tamaño, habitad, peso); 
                                avestruz.create(objeto);
                                break;

                            case 2:
                               System.out.println("Ingrese el codigo de Avestruz");
                                int codigo = entrada.nextInt();
                                System.out.println(avestruz.read(codigo));
                               break;

                            case 3:
                                System.out.print("Ingrese el código de Avestruz: ");
                                codigo = entrada.nextInt();
                                if(avestruz.read(codigo) != null){
                                
                                System.out.print("Ingrese el tipo de Animal: ");
                                animal = entrada.next();
                                System.out.print("Ingrese tamaño: ");
                                tamaño = entrada.nextInt();
                                System.out.print("Ingrese tipo de Habitad: ");
                                habitad = entrada.next();
                                System.out.print("Ingrese el Peso del Animal: ");
                                peso = entrada.nextInt();
                                
                                System.out.print("Ingrese el número de Patas: ");
                                Patas = entrada.next();
                                System.out.print("Tipo de reproducción: ");
                                reproduccion = entrada.next();
                                System.out.print("Velocidad: ");
                                velocidad = entrada.nextInt();
                                System.out.print("Tipo de Comida: ");
                                comida = entrada.next();
                                
                                System.out.println("Tamaño de las Alas: ");
                                alas = entrada.nextInt();
                                System.out.println("Longuitud del Cuello: ");
                                cuello = entrada.next();
                                System.out.println("Número de Garras: ");
                                garras = entrada.nextInt();
                                System.out.println("Tamaño del Pico: ");
                                pico = entrada.nextInt();
                                objeto = new Avestruz(tamaño, tamaño, codigo, garras, alas, reproduccion, velocidad, reproduccion, codigo, animal, tamaño, habitad, peso);
                                objeto.setCodigo(codigo);
                                avestruz.update(objeto);
                                }else {
                                    System.out.println("El Avestruz no existe");
                                }
                                break;

                            case 4:
                                System.out.println("Ingrese el codigo del no profesional que va a eliminar");
                                codigo = entrada.nextInt();
                                avestruz.delete(codigo);
                                break;

                            case 5:
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                    } while (opcionMenuAvestruz != 5);
                    break;

                case 3:
                    //opcion para el crud de pulpo
                    do {
                        System.out.println("MENU AVESTRUZ");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuPulpo = entrada.nextInt();
                        
                        switch (opcionMenuPulpo) {
                            case 1:
                                System.out.print("Ingrese el tipo de Animal: ");
                                String animal = entrada.next();
                                System.out.print("Ingrese tamaño: ");
                                int tamaño = entrada.nextInt();
                                System.out.print("Ingrese tipo de Habitad: ");
                                String habitad = entrada.next();
                                System.out.print("Ingrese el Peso del Animal: ");
                                int peso = entrada.nextInt();
                                
                                System.out.print("Ingrese el número de Patas: ");
                                String Patas = entrada.next();
                                System.out.print("Tipo de reproducción: ");
                                String reproduccion = entrada.next();
                                System.out.print("Velocidad: ");
                                int velocidad = entrada.nextInt();
                                System.out.print("Tipo de Comida: ");
                                String comida = entrada.next();
                                
                                System.out.print("Ingrese número de tentaculos: ");
                                int tentanculos = entrada.nextInt();
                                
                                
                            
                        }
                            
                        

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
