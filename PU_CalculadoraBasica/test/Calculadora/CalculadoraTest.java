/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jony Chiroy
 */
public class CalculadoraTest {

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        //arrage
        System.out.println("sumar");
        double num1 = 5.1;
        double num2 = 4.9;
        double expResult = 10;
        //act
        double result = Calculadora.sumar(num1, num2);
        //assert
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
