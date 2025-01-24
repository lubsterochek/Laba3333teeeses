package places;

import donkeysAndShorties.Shorty;
import help.RandomArrayList;

public class City extends Place {
    public static City mainCity;

    public City(String name){
        super(name);
        mainCity = this;
    }

    private RandomArrayList<Shorty> shorties = new RandomArrayList<>();
    public RandomArrayList<Shorty> getShorties(){return shorties;}
}