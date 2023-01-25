package edu.craptocraft.domain;
import edu.craptocraft.gildedrose.domain.*;
// Necesitamos todas las herramientas de los Asserts de JUNIT
import static org.junit.Assert.*;
import org.junit.Test;

public class AgedbrieTest {
    
    @Test
    //Test sobre el constructor
    public void crearAgedBrieTest() {
        Agedbrie queso = new Agedbrie("Queso Antiguo", 10, 5);
        assertEquals("Queso Antiguo", queso.getName());
        assertEquals(10, queso.getSell_in());
        assertEquals(5, queso.getQuality());
    }

    @Test
    //Sobre toda clase hay que hacer un toString()
    public void toStringTest(){
        Agedbrie queso = new Agedbrie("Queso Antiguo", 10, 5);
        System.out.println("toString() AgedBrie test: ");
        System.out.println(queso.toString());

    }

    @Test
    //Test sobre updateQuality
    public void updateQualityTest(){

        Agedbrie queso = new Agedbrie("Queso Antiguo", 10, 5);
        queso.updateQuality();
        assertEquals(9, queso.getSell_in(), 0);
        assertEquals(6, queso.getQuality(), 0);
    
    }

    @Test
    //Test sobre updateQualityBrieExpired
    public void updateQualityBrieExpiredTest(){
        
        Agedbrie queso = new Agedbrie("Queso Antiguo", 0, 5);
        queso.updateQuality();
        assertEquals(-1, queso.getSell_in(), 0);
        assertEquals(7, queso.getQuality(), 0);

    }


    @Test
    // Test sobre qualityMax50
    public void qualityMax50(){
        Agedbrie brie = new Agedbrie("Queso Antiguo", -1, 50);
        brie.updateQuality();
        assertEquals(-2, brie.getSell_in(), 0);
        assertEquals(50, brie.getQuality(), 0); 

        brie = new Agedbrie("Queso Antiguo", -1, 50);
        brie.updateQuality();
        assertEquals(-2, brie.getSell_in(), 0);
        assertEquals(50, brie.getQuality(), 0); 
    }


}
