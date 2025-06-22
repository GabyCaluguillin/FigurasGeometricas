
package figurageometricatarea;

public class Triangulo {

//ATRIBUTOS
    private int lado;
    //CONSTRUCTORES
    //constructor con datos
    public Triangulo(int lado) {
        this.lado = lado;
    }
    //constructor vacio
    public Triangulo() {
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
    
        return this.lado*3;
    }
}