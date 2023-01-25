package edu.craptocraft.gildedrose;

import java.util.List;
import edu.craptocraft.gildedrose.domain.*;

/**
 * Hello world!
 *
 */

 public class App {
    public static void main(String[] args) {
        System.out.println("Gilded-Rose");

        // Creamos una instancia de la teinda
        GildedRose tienda = new GildedRose();



        // Se hace una lista de elementos Updatebales
        List<Updateable> items = List.of(new Normalitem("+5 Dexterity Vest", 10, 20),
        new Agedbrie("Aged Brie", 2, 0),
        new Normalitem("Elixir of the Mongoose", 5, 7),
        new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
        new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
        new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        new Backstage("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 49));

        //Por cada item creado de la lista anterior, lo añadimos a la lista
        // de la clase GildedRose , representada en la instancia de tienda
        for (Updateable item : items) {
            tienda.addItem(item);
        }

        // Listamos el inventario
        System.out.println("\t ### DAY 1 ###");
        System.out.println(tienda.toString());

        //Actualizamos los items
        tienda.updateQuality();

        // Los volvemos a listar
        System.out.println("\t ####  DAY 2 ####");
        System.out.println(tienda.toString());


        // Se añade el Conjured         
        tienda.addItem(new Conjured("Conjured Mana Cake", 3, 6));
        System.out.println("\t ####  Se añade el Conjured ####");
        System.out.println(tienda.toString());


        //Actualizamos 
        tienda.updateQuality();
        System.out.println("\t ####  DAY 3 ####");
        System.out.println(tienda.toString());


      }

    
    }

