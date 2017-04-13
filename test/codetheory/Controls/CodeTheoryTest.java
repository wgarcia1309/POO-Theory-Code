/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetheory.Controls;

import codetheory.Models.Campo;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laboratorio
 */
public class CodeTheoryTest {
    
    public CodeTheoryTest() {
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

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CodeTheory.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testComienzo() {
        System.out.println("comienzo");
        int n = 0;
        int k = 0;
        int d = 0;
        int q = 0;
        CodeTheory.comienzo(n, k, d, q);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuscarIndependencia() {
        System.out.println("buscarIndependencia");
        Campo campo = null;
        int k = 0;
        String expResult = "";
        String result = CodeTheory.buscarIndependencia(campo, k);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBuscarIndependencia2() {
        System.out.println("buscarIndependencia2");
        Campo campo = null;
        int k = 0;
        int q = 0;
        ArrayList expResult = null;
        ArrayList result = CodeTheory.buscarIndependencia2(campo, k, q);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEscalares() {
        System.out.println("escalares");
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int q = 0;
        boolean expResult = false;
        boolean result = CodeTheory.escalares(x1, y1, x2, y2, q);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
