package figurasgeometricas;

/**
 * Calcular perimetro y Area de un rectángulo
 * @author user
 */
public class Rectangulo {
    
    private int altura;
    private int base;

     /**
     * Constructor de la clase rectángulo
     * @param altura El valor del altura del rectángulo
     * @param base El valor de la base del rectángulo
     */
    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    /**
     * Obtiene el valor del la altura del rectángulo
     * @return El valor de la altura del rectángulo
     */
    
    public int getAltura() {
        return altura;
    }
    /**
     * Establece un valor para la altura del cuadrado
     * @param altura El nuevo valor de la altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * Obtiene el valor del la base del rectángulo
     * @return El valor de la base del rectángulo
     */
    public int getBase() {
        return base;
    }
    /**
     * Establece un valor para la base del rectángulo
     * @param base El nuevo valor de la base
     */
    public void setBase(int base) {
        this.base = base;
    }
    /**
     * Calcula el área del rectángulo
     * @return El área del rectángulo
     */
    public double calcularArea(){
        return base*altura;
    }
    /**
     * Calcula el perímetro del rectángulo
     * @return El perímetro del rectángulo
     */
    public double calcularPerimetro(){
        return 2*(base+altura);
    }
}
