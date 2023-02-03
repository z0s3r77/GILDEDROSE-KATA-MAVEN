package test.java.edu.craptocraft.domain;

import edu.craptocraft.gildedrose.domain.*;
// Necesitamos todas las herramientas de los Asserts de JUNIT
import static org.junit.Assert.*;
import org.junit.Test;

public class BackstageTest {

    @Test
    public void crearBackstageTest(){
        BackstageTest backstage = new BackstageTest("backegsito", 10 ,10);
        assertEquals("backegsito", backstage.getName());
        assertEquals(10, backstage.getSell_in());
        assertEquals(10, backstage.getQuality());
    }
 

}
