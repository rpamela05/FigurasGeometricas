/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package figurasgeometricas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author busti
 */
public class TrianguloTest {
    
    public TrianguloTest() {
    }


    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Triangulo instance = new Triangulo(5,8,0,0,0);
        double expResult = 20.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Triangulo instance = new Triangulo(0,0,5,7,8);
        double expResult = 20.0;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
}
