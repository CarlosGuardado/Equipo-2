package Las_Figuras;

public class Pruebas {

    public static void main(String[] args) {
        // Se crea el primer objeto para la clase rectangulo
        Rectangulo r1 = new Rectangulo(2.0, 4.0);
        System.out.println("RECTANGULOS");
        System.out.println("PErimetro");
        // Se muestra el perimetro del rectangulo
        System.out.println("El perimetro del rectangulo es: "+r1.getBase()+" y altura "+r1.getAltura()+" es: "+r1.calcularPerimetro());
        
        //Se muestra el area del rectangulo
        System.out.println("El area del rectangulo es: "+r1.getBase()+" y altura "+r1.getAltura()+" es: "+r1.calcularArea());
        
        
        
        
        //Se declaran objetos y valores para la clase circulo
        // Se crea el primer objeto para la clase circulo
        Circulo c1 = new Circulo(2);
        System.out.println("CIRCULOS");
        System.out.println("Perimetro");
        // Se muestra el perimetro del circulo
        System.out.println("El perimetro del circiulo con radio de: "+c1.getRadio()+" es: "+c1.calcularPerimetro());
        
        // Se muestra el area del circulo
        System.out.println("El area del circiulo con radio de: "+c1.getRadio()+" es: "+c1.calcularArea());
        
        
    }

}
