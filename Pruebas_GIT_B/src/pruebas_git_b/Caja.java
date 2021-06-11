/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas_git_b;

/**
 *
 * @author itch2
 */
public class Caja {
    double alto;
    double ancho;
    double largo;
    
    public Caja(double a, double b, double c){
        alto = a;
        ancho = b;
        largo = c;
                
               
    }
    /*public  Caja(){
        alto = -1;
        ancho = -1;
        largo = -1;
    }*/
    public Caja(double obj){
        alto=obj.alto;
        ancho=obj.ancho;
        largo=obj.largo;
        
    }
    
    /*public Caja(double longitud){
        alto = ancho = largo = longitud;
    }*/
            
}
