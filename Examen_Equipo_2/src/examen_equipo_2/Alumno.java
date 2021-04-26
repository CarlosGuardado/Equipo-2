package examen_equipo_2;

import javax.swing.JOptionPane;

public class Alumno extends Profesor {

    //Variables extra para la clase alumno
    private int NumControl, MatCursando, MatAprob, MatReprob, S, N,Z;
    private float Calif, Total;
    String opc = "";

    //Constructor heredado de la super clase Profesor 
    public Alumno(String Nombre, String Apellido) {

        super(Nombre, Apellido);

    }

    //Constructor heredado de la super clase Profesor 
    public Alumno(String Institucion, String Area, int Edad) {

        super(Institucion, Area, Edad);

    }

    //Metodo
    public void DatosDesempeño(int NumControl) {

        this.NumControl = NumControl;
    }

    //Metodo sobrecarga
    public void DatosDesempeño() {
        do {

            opc = JOptionPane.showInputDialog(null, "                     ----- Datos Academicos -----"
                    + "\nA. Ingresar numero de materias y calcular promedio"
                    + "\nB.  Salir"
                    + "\nIngrese una opción: ");

            switch (opc) {
                case "a":
                case "A":Z++;
                    MatCursando = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingrese el numero de materias"
                            + "\n que cursa el alumno"));

                    if (MatCursando > 0 & MatCursando <= 100) {
                        MatAprob = Integer.parseInt(JOptionPane.showInputDialog(null, "De las " + MatCursando + " materias"
                                + "que cursa el alumno, ¿cuantas aprobo?."
                                + "\n"
                                + "\nSe considerara el resto como reprobadas"));
                        MatReprob = MatCursando - MatAprob;
                        
                        for (int i = 1; i <= MatAprob; i++) {
                            S = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las calificaciones en orden"));

                            Total = Total + S;

                        }
                        Calif = Total / MatCursando;
                        JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + Calif, "", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingreseun valor logico", "", JOptionPane.ERROR_MESSAGE);
                        N++;
                        if(N>=3){
                            JOptionPane.showMessageDialog(null, "Ya ha cometido "+N+" errores, ingrese un valor logico", "", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    break;
                case "b":
                case "B":
                    JOptionPane.showMessageDialog(null, "Ha calculado "+Z+" promedios");
                    JOptionPane.showMessageDialog(null, "Que tenga un buen dia");
            }

        } while (!opc.equalsIgnoreCase("B"));

    }

    //Metodo para mostrar datos
    public void Salida() {

        JOptionPane.showMessageDialog(null, "Nombre del alumno: " + getNombre() + " " + getApellido());
    }

    //Metodo para mostrar datos
    public void Salida(String Sexo) {
        JOptionPane.showMessageDialog(null, "Tiene: " + getEdad() + " años."
                + "\nSexo: " + Sexo
                + "\nInstitución: " + getInstitucion()
                + "\nArea: " + getArea());
    }

}
