
package figurageometricatarea;


public class FiguraGeometricaTarea {

    public static void main(String[] args) {
        //crear un objeto
        Cuadrado cuadrado=new Cuadrado(4);
        Triangulo triangulo=new Triangulo(3);
        
        
        
        System.out.println("El area de un cuadrado es: "+cuadrado.calcularArea());
        System.out.println("El perimetro de un cuadrado es: "+cuadrado.calcularPerimetro());
         System.out.println("El area de un triangulo es: "+triangulo.calcularArea());
        System.out.println("El perimetro de un triangulo es: "+triangulo.calcularPerimetro());
        
      
    }
    
}
