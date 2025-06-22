
package figurageometricatarea;

public class Cuadrado {
    //ATRIBUTOS
    private int lado;
    //CONSTRUCTORES
    //constructor con datos
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    //constructor vacio
    public Cuadrado() {
    }
    
    //SETTER Y GETTER

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    //METODOS
    
    public double calcularArea(){
   
    return this.lado*this.lado;    
    }
    
    public double calcularPerimetro(){
    
        return this.lado*4;
    }
}
