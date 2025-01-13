/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package figurasgeometricas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularArea method, of class Rectangulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Rectangulo instance = new Rectangulo(10,20);
        double expResult = 200;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPerimetro method, of class Rectangulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        Rectangulo instance = new Rectangulo(10,20);
        double expResult = 60;
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Rectangulo.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Rectangulo instance = null;
        int expResult = 0;
        int result = instance.getAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class Rectangulo.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        int altura = 0;
        Rectangulo instance = null;
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBase method, of class Rectangulo.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Rectangulo instance = null;
        int expResult = 0;
        int result = instance.getBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class Rectangulo.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        int base = 0;
        Rectangulo instance = null;
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
