package edu.craptocraft.domain;

import edu.craptocraft.gildedrose.domain.*;
// Necesitamos todas las herramientas de los Asserts de JUNIT
import static org.junit.Assert.*;
import org.junit.Test;

public class ConjuredTest {
    
    @Test
    public void crearConjuredTest() {
        Conjured conjured = new Conjured("conjured Antiguo", 10, 5);
        assertEquals("conjured Antiguo", conjured.getName());
        assertEquals(10, conjured.getSell_in());
        assertEquals(5, conjured.getQuality());
    }

    @Test
    //Sobre toda clase hay que hacer un toString()
    public void toStringTest(){
        Conjured conjured = new Conjured("conjured Antiguo", 10, 5);
        System.out.println("toString() Agedconjured test: ");
        System.out.println(conjured.toString());

    }

    @Test
    //Test sobre updateQuality
    public void updateQualityTest(){

        Conjured conjured = new Conjured("conjured Antiguo", 10, 5);
        conjured.updateQuality();
        assertEquals(9, conjured.getSell_in(), 0);
        assertEquals(3, conjured.getQuality(), 0);
    

    }


    @Test
    //Test sobre updateQualityconjuredExpired
    public void updateQualityconjuredExpiredTest(){
        
        Conjured conjured = new Conjured("conjured Antiguo", 0, 5);
        conjured.updateQuality();
        assertEquals(-1, conjured.getSell_in(), 0);
        assertEquals(1, conjured.getQuality(), 0);

    }

    @Test
    // Test sobre qualityMax50
    public void quality50(){
        Conjured conjured = new Conjured("conjured Antiguo", 0, 49);
        conjured.updateQuality();
        assertEquals(-1, conjured.getSell_in(), 0);
        assertEquals(45, conjured.getQuality(), 0); 
    }


}
