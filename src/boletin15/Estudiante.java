/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return "Nombre: "+nombre+
                "\nEdad: "+edad+
                     "\nCurso: "+curso;
    }
    
    
}
