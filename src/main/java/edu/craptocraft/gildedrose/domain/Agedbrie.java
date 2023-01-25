package edu.craptocraft.gildedrose.domain;

public class Agedbrie extends Normalitem{
    
    public Agedbrie(String name, int sell_in, int quality){
        super(name, sell_in, quality);
    }

    //No hace falta implementarlos en el contrato, porque Normalitem ya lo hace
    @Override
    public void updateQuality() {
        if (getSell_in() > 0) {
            computeQuality(1);
        } else {
            computeQuality(2);
        }
        setSell_in();
    }

    
}