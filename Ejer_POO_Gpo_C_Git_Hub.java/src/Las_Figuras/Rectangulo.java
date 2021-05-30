// Hereda de la clase abstracta figura
package Las_Figuras;

/**
 *
 * @author itch2
 */
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Es un metodo para calcular perimetro del rectangulo
    @Override
    public double calcularPerimetro() {
        // 2 veces la suma de los dos lados contiguos
        return (base * 2 + altura * 2);
    }
    // Es un metodo para calcular area del rectangulo
    @Override
    public double calcularArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
