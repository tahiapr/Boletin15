package boletin15;

import javax.swing.JOptionPane;

public class Boletin15 {

    public static void main(String[] args) {
        
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres introducir nota?");
        
        while(respuesta==JOptionPane.YES_OPTION){
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
            int edad =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad")); 
            String curso = JOptionPane.showInputDialog(null, "Ingrese el curso");
            Estudiante estudiante1 = new Estudiante (nombre,edad,curso);
            
            Notas notaE1 = new Notas(nombre,edad,curso);
            float nota1 =  Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca nota examen teórico 1")); 
            float nota2 =  Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca nota examen teórico 2"));
            notaE1.calcularEscrita(nota1, nota2);
            
            float nota3 =  Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca nota examen práctico"));
            notaE1.calcularPractica(nota3);
            
            int nota4 =  Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca número boletines hechos"));
            notaE1.calcularBoletines(nota4);
            
            notaE1.calcularNotaFinal();
            notaE1.mostrarNotas();
            
            respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres introducir nota?");
        }
        
    }
    
}
