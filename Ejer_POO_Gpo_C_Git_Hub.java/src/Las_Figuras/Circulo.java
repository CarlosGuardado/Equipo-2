/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Las_Figuras;

/**
 *
 * @author itch2
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    // Se necesita (2*PI)*radio)
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
        
    }
    // La formula para determinar el area es (PI*radio^2)
    @Override
    public double calcularArea(){
        return Math.PI*(radio*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
