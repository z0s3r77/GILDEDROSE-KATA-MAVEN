package edu.craptocraft.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;



/**
 * GildedRose
 * Esta clase es de @dfleta 
 */
public class GildedRose {

    // Se crea un array de nombre inventory  de objectos Updateables ,
    // Cuyo contenido es una lista de objetos updateables
    private List<Updateable> inventory = new ArrayList<Updateable>();


    public List<Updateable> invetory(){
        return this.inventory;
    }

    // Solo añaden items de tipo Updatebles
    public void addItem(Updateable item){
        invetory().add(item);
    }

    public void updateQuality(){
        for (Updateable item : inventory) {
            item.updateQuality();
        }
    }

    @Override
    public String toString(){
        StringBuilder representation = new StringBuilder();

        for (Updateable item : inventory) {
            // Aqui se llama al metedo toString de Item.java
            representation.append(item.toString());
            representation.append('\n');
        }

        return representation.toString();
    }

}