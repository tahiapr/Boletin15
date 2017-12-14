/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author tperezrodriguez
 */
public class Notas extends Estudiante {

    private float pruebaEscrita;
    private float pruebaPractica;
    private float boletines;
    private float notaFinal;

    public Notas(String nombre, int edad, String curso) {
        super(nombre, edad, curso);
    }

    
    public void calcularEscrita (float examen1, float examen2){
        float media = (examen1 + examen2)/2;
        float porcentaje = (media * 4)/10;
        pruebaEscrita = porcentaje;
    }
    
    public void calcularPractica (float examen){
        float porcentaje = (examen * 4)/10;
        pruebaPractica = porcentaje;
    }
    
    public void calcularBoletines (int numBoletines){
       float porcentaje = (numBoletines * 100)/17;
       
       if (porcentaje > 90){
           boletines = 2; 
       } else if (porcentaje <=90 && porcentaje >=70){
           boletines = 1;
       } else {
           boletines = 0;
      }
    }
    
    public void calcularNotaFinal (){
        notaFinal = pruebaEscrita + pruebaPractica + boletines;
    }
    
    public void mostrarNotas (){
        System.out.println(super.toString());
        System.out.println("PROBAS TEÓRICAS……………"+pruebaEscrita +"\n" +
            "PROBAS PRÁCTICA……………"+pruebaPractica+"\n" +
            "BOLETÍNS  ………………………."+boletines +"\n" +
            "NOTA TOTAL……………………"+notaFinal);
    }
}
