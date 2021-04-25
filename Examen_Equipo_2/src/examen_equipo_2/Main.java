/* Integrantes:
 * Carlos Alberto Guardado Uribe
 * Edgar Eduardo Zamarrón Gaytán
 * Cesar Osvaldo Márquez Rodríguez
 * Ivan Samuel Corona Álvarez
 */
package examen_equipo_2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        //Variable para el menu principal
        String XY = "";
        
        //do_while que repite el proceso hasta que el usuario seleccione salir
        do {
        XY = JOptionPane.showInputDialog("Que información deseas consultar"
                + "\nA. Datos del Maestro"
                + "\nB. Datos del alumno"
                + "\nC. Salir del programa");
        
        //Switch para decidir que se quiere hacer
        switch (XY) {
            case "a":
            case "A":
            
                //Objetos de la clase Profesor
                Profesor Profesor1 = new Profesor("Juana", "Garcia");//Parametros de los constructores
                Profesor Profesor2 = new Profesor("ITCH II", "Ing. Sistemas Computacionales", 26);//Parametros de los constructores
                //Llamada a los metodos de la clase profesor
                Profesor1.salida();
                Profesor2.salida("Mujer");
                break;
            case "b":
            case "B":
                //Objetos de la clase alumno
                Alumno Alumno1 = new Alumno("Elmer", "Homero");//Parametros de los constructores
                Alumno Alumno2 = new Alumno("ITCH II", "Ing. Sistemas Computacionales", 18);//Parametros de los constructores
                //LLamada a los metodos de alumnos
                Alumno1.Salida();
                Alumno2.Salida("Hombre");
                Alumno1.DatosDesempeño(20550382);
                Alumno1.DatosDesempeño();
                break;
            case "c":
            case "C": JOptionPane.showMessageDialog(null, "Que tenga un buen dia");
               
        }
        }while(!XY.equalsIgnoreCase("C"));
        }

    }
