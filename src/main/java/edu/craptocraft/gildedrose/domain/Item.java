package edu.craptocraft.gildedrose.domain;


/**
 * Item
 */
public class Item {

    public String name;
    public int sell_in;
    public int quality;


    Item(String name, int sell_in, int quality){
        this.setName(name);
        this.setSell_in(sell_in);
        this.setQualityVar(quality);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSell_in(int sell_in){
        this.sell_in = sell_in;
    }

    public void setQualityVar(int quality){
        this.quality = quality;
    }

    // COdigo de @Dfleta
    @Override
    public String toString() {
        StringBuilder itemDescription = new StringBuilder();
        itemDescription.append(getName());
        itemDescription.append(" , caduca en: " + getSell_in()+ ", calidad:  " );
        itemDescription.append(getQuality());
        return itemDescription.toString();
    }
    // Fin COdigo de @Dfleta


    public String getName(){
        return this.name;
    }

    public int getSell_in(){
        return this.sell_in;
    }

    public int getQuality(){
        return this.quality;
    }

    protected void setQuality(int quality){
        this.quality = quality;
    }

}
