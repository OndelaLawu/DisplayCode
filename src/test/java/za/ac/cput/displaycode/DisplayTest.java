/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.displaycode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simnikiwe
 */
public class DisplayTest {

    private Display display;

    public DisplayTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    this.display = new Display();
    }

    @After
    public void tearDown() {
    }
   
    

   @Test
public void Failingtest(){
 fail("Hello everyone");
   }

@Test
public void testEquality(){
String obj1 = "JUnit";
String obj2 = "JUnit";
assertEquals(obj1, obj2);
}
@Test
public void testIdentity(){
String obj3 = "Ondela";
String obj4 = "Ondela";
assertSame(obj3, obj4);

}
@Test
@Desabled
public void disabledTest(){

System.out.println("Display");
}
}
