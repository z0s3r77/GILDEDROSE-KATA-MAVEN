package edu.craptocraft.gildedrose.domain;


public class Normalitem extends Item  implements Updateable{


    // NormalItem es un tipo de Item
    public Normalitem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    public void setSell_in(){
        super.sell_in -= 1;
    }

    public void computeQuality(int valor){
        if (super.quality + valor > 50) {
            setQuality(50);
        } else if (super.quality + valor >= 0) {
            setQuality(getQuality() + valor);
        } else {
            setQuality(0);
        }
    }

    // Se cumple con el contrato
    @Override
    public void updateQuality() {
                if (getSell_in() > 0) {
                    computeQuality(-1);
                } else {
                    computeQuality(-2);
                }
                setSell_in();
    }
    



}