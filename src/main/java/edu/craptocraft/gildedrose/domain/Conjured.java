package edu.craptocraft.gildedrose.domain;

public class Conjured extends Normalitem{
    public Conjured(String name, int sell_in, int quality){
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality(){
        if (getSell_in() > 0) {
            computeQuality(-2);
        } else{
            computeQuality(-4);
        }
        setSell_in();
    }
}
