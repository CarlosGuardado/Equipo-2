package examen_equipo_2;

import javax.swing.JOptionPane;

public class Profesor {

    //Variables para la super clase profesor
    private String Nombre, Genero;
    private String Apellido;
    private String Institucion;
    private String Area;
    private int Edad;

    //Constructor
    public Profesor(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    //Constructor
    public Profesor(String Institucion, String Area, int Edad) {
        this.Institucion = Institucion;
        this.Area = Area;
        this.Edad = Edad;
    }
    

    //Metodos getter que sirven para la clase hija Alumno
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public String getArea() {
        return Area;
    }

    public int getEdad() {
        return Edad;
    }

    //Metodo para mostrar datos
    public void salida() {
        JOptionPane.showMessageDialog(null, "Nombre del docente: " + Nombre + " " + Apellido);
    }
    
    //Metodo sobrecarga para mostrar datos
    public void salida(String Genero) {
        this.Genero = Genero;
        JOptionPane.showMessageDialog(null, "Tiene: " + Edad + " años."
                + "\nGenero: " + Genero
                + "\nInstitución: " + Institucion
                + "\nArea: " + Area);

    }

}
