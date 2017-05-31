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
public class MatrixITest {
    MatrixI m1,m2,m3,m4,m5;
    public MatrixITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        m1= new MatrixI(1);
        m2= new MatrixI(13);
        m3= new MatrixI(5);
        m4= new MatrixI(2);
        m5= new MatrixI(7);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of see method, of class MatrixI.
     */
    @Test
    public void testSee() {
        m1.see();
        m2.see();
        m3.see();
        m4.see();
        m5.see();
    }

    /**
     * Test of getMatrix method, of class MatrixI.
     */
    @Test
    public void testGetMatrix() {
        String mx1[][]={ {"1"} }
        ,mx2[][]={
        {"1","0","0","0","0","0","0","0","0","0","0","0","0"},
        {"0","1","0","0","0","0","0","0","0","0","0","0","0"},
        {"0","0","1","0","0","0","0","0","0","0","0","0","0"},
        {"0","0","0","1","0","0","0","0","0","0","0","0","0"},
        {"0","0","0","0","1","0","0","0","0","0","0","0","0"},
        {"0","0","0","0","0","1","0","0","0","0","0","0","0"},
        {"0","0","0","0","0","0","1","0","0","0","0","0","0"},
        {"0","0","0","0","0","0","0","1","0","0","0","0","0"},
        {"0","0","0","0","0","0","0","0","1","0","0","0","0"},
        {"0","0","0","0","0","0","0","0","0","1","0","0","0"},
        {"0","0","0","0","0","0","0","0","0","0","1","0","0"},
        {"0","0","0","0","0","0","0","0","0","0","0","1","0"},
        {"0","0","0","0","0","0","0","0","0","0","0","0","1"},
        }
        ,mx3[][]={
        {"1","0","0","0","0"},
        {"0","1","0","0","0"},
        {"0","0","1","0","0"},
        {"0","0","0","1","0"},
        {"0","0","0","0","1"}
        },mx4[][]={
            {"1","0"},
            {"0","1"}
        },mx5[][]={
        {"1","0","0","0","0","0","0"},
        {"0","1","0","0","0","0","0"},
        {"0","0","1","0","0","0","0"},
        {"0","0","0","1","0","0","0"},
        {"0","0","0","0","1","0","0"},
        {"0","0","0","0","0","1","0"},
        {"0","0","0","0","0","0","1"}
        };
        assertArrayEquals(mx1, m1.getMatrix());
        assertArrayEquals(mx2, m2.getMatrix());
        assertArrayEquals(mx3, m3.getMatrix());
        assertArrayEquals(mx4 , m4.getMatrix());
        assertArrayEquals(mx5, m5.getMatrix());
    }
    
}
