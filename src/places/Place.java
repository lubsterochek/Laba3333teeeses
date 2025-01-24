package places;

import help.INamed;
import help.RandomArrayList;
import people.*;

public abstract class Place implements INamed {
    private String name;
    protected RandomArrayList<Human> inhabitants;

    public Place(String name) {
        this.name = name;
        this.inhabitants = new RandomArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    public void addHuman(Human human) {inhabitants.add(human);}

    public void removeHuman(Human human) {inhabitants.remove(human);}

    public RandomArrayList<Human> getInhabitants(){
        return this.inhabitants;
    }
}