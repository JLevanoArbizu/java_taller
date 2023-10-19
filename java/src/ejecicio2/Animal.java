package ejecicio2;

import java.util.Scanner;

/**
 * @author joseLevanoArbizu
 */
public class Animal {
    int a;
    String nombre;
    boolean v;
   
    Scanner entrada = new Scanner(System.in);

    public void ingresarDatos() {

        System.out.println("ingresa el numero");
        a = entrada.nextInt();
        System.out.println("ingresa el nombre");
        nombre = entrada.next();
        System.out.println("ingresa un valor boleano");
        v = entrada.nextBoolean();
    }

    public void mostrarDatos() {
        System.out.println("el numero es :" + a 
                + "\nel texto es :" + nombre 
                + "\nEl valor boleano es :" + v);
   
    }

}
