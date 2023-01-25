package edu.craptocraft.gildedrose.domain;

public class Sulfuras extends Normalitem{
    public Sulfuras(String name, int sell_in, int quality){
        super(name, sell_in, quality);
    }

    // Ni caduca ni nada
    @Override
    public void updateQuality(){
        return;
    }
}