/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.io.IOException;

/**
 *
 * @author itch2
 */
public class Caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        int c, contador = 0;
       

        // Leer hasta encontrar el fin de la linea
        System.out.println("Por favor introduzca su nombre");

        while ((c = System.in.read()) != '\n') {
            contador++;
            System.out.println((char) c);
        }

        System.out.println();
        System.out.println("El total de caracteres contados es: " + contador + " total de bytes contados");
    }

}
