package places;

import donkeysAndShorties.Donkey;
import help.RandomArrayList;

public class Zoo extends Place {
    public static Zoo mainZoo;

    public Zoo(String name){
        super(name); mainZoo = this;
    }

    private RandomArrayList<Donkey> donkeys = new RandomArrayList<>();
    public RandomArrayList<Donkey> getDonkeys(){return donkeys;}

    public void addDonkey(Donkey donkey){
        donkeys.add(donkey);
    }
}