/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author busti
 */
public class Triangulo {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    /**
     * Constructor de la clase cuadrado
     *
     * @param lado El valor del lado del cuadrado
     */
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Obtiene el valor de la base del triángulo.
     *
     * @return El valor actual de la base.
     */
    public double getBase() {
        return base;
    }

    /**
     * Establece un nuevo valor para la base del triángulo.
     *
     * @param base El nuevo valor para la base, debe ser un valor positivo.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Obtiene el valor de la altura del triángulo.
     *
     * @return El valor actual de la altura.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece un nuevo valor para la altura del triángulo.
     *
     * @param altura El nuevo valor para la altura, debe ser un valor positivo.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el área del triángulo.
     *
     * @return El área del triángulo.
     */
    public double calcularArea() {
        return (base * altura) / 2;
    }

    /**
     * Calcula el perímetro del triángulo.
     *
     * @return El perímetro del triángulo.
     */
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

}
