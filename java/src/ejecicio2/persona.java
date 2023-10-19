/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio2;

import javax.swing.JOptionPane;

/**
 * @author joseLevanoArbizu
 */
public class persona {

    String nombre;

    public void ingresarNombre() {
        nombre = JOptionPane.showInputDialog("ingresa el nombre");
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "el nombre es " + nombre);
    }

}
