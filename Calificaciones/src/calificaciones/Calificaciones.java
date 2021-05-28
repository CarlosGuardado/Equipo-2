/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import java.util.Scanner;

/**
 *
 * @author itch2
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       
       int numAlum, i;
       double suma=0, media;
       
       
       do{
           System.out.println("Numero de alumnos: " );
           numAlum=sc.nextInt();
           
           
           
       }while(numAlum<=0);
       
       
       double[]notas= new double[numAlum];
       
       
       for(i=0;i<notas.length;i++){
           System.out.println("Alumno "+(i+1)+" Nota final:  ");
           notas[i]=sc.nextDouble();
           
       }
       
       for(i=0;i<notas.length;i++){
           suma=suma+notas[i];
       }
       
       
       media=suma/notas.length;
       
       
       System.out.println("Listado de notas superiores a la media");
       for(i=0;i<notas.length;i++){
           if(notas[i]>media){
               System.out.println("Alumno: "+(i+1)+" Nota final:  "+notas[i]);
           }
       }
    }
    
}
