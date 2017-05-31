/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wbovea
 */
public class MatrizHTest {
    MatrizH m1,m2,m3;
    public MatrizHTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp(){
        //nkqd
        m1=new MatrizH(6,3,2,3);//Si LI
        m2=new MatrizH(6,3,3,3);//SI LI
        m3=new MatrizH(8,3,2,5);//No LI (false)
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of MatrizL method, of class MatrizH.
     */
    @Test
    public void testMatrizL() {
        assertNotNull(m1.MatrizL());
        assertNotNull(m2.MatrizL());
        assertNull(m3.MatrizL());

    }

    /**
     * Test of getK method, of class MatrizH.
     */
    @Test
    public void testGetK() {
        assertTrue(3==m1.getK());
        assertTrue(3==m2.getK());
    }

    /**
     * Test of getMatrixG method, of class MatrizH.
     */
    @Test
    public void testGetMatrixG() {
        String mx1[][]={
            {"1","0","0","0","1","1"},
            {"0","1","0","1","0","1"},
            {"0","0","1","1","1","0"}
        },mx2[][]={
            {"1","0","0","0","2","2"},
            {"0","1","0","0","2","1"},
            {"0","0","1","2","0","2"}
        };
        assertArrayEquals(mx1, m1.getMatrixG());
        assertArrayEquals(mx2, m2.getMatrixG());
    }

    /**
     * Test of getFilas method, of class MatrizH.
     */
    @Test
    public void testGetFilas() {
        assertTrue(3==m1.getK());
        assertTrue(3==m2.getK());
        assertTrue(5==m3.getK());
    }

    /**
     * Test of getN method, of class MatrizH.
     */
    @Test
    public void testGetN() {
        assertTrue(6==m1.getN());
        assertTrue(6==m2.getN());
    }

    /**
     * Test of getControlH method, of class MatrizH.
     */
    @Test
    public void testGetControlH() {
         String mx1[][]={
            {"0","1","1","1","0","0"},
            {"1","0","1","0","1","0"},
            {"1","1","0","0","0","1"}
        },mx2[][]={
            {"0","0","1","1","0","0"},
            {"1","1","0","0","1","0"},
            {"1","2","1","0","0","1"}
        };
        assertArrayEquals(mx1,m1.getControlH());
        assertArrayEquals(mx2, m2.getControlH());
    }

    /**
     * Test of factorial method, of class MatrizH.
     */
    @Test
    public void testFactorial() {
        assertTrue(120==m1.factorial(5));
        assertTrue(120==m1.factorial(5));
        assertTrue(120==m3.factorial(5));
        assertTrue(720==m1.factorial(6));
        assertTrue(6==m2.factorial(3));
        assertTrue(24==m3.factorial(4));
    }

    /**
     * Test of verControl method, of class MatrizH.
     */
    @Test
    public void testVerControl() {
        m1.verControl();
        m2.verControl();
    }

    /**
     * Test of verG method, of class MatrizH.
     */
    @Test
    public void testVerG() {
        m1.verG();
        m2.verG();
    }

    /**
     * Test of getqSubfila method, of class MatrizH.
     */
    @Test
    public void testGetqSubfila() {
        //devuelve q^(n-k)
        assertTrue(8==m1.getqSubfila());
        assertTrue(27==m2.getqSubfila());
        assertTrue(32==m3.getqSubfila());
    }
}
