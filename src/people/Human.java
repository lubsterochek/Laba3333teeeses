package people;

import help.IActor;
import help.INamed;
import places.Place;

public abstract class Human implements IActor, INamed {
    private String name;
    private int health = 100;
    protected State state = State.HAPPY;
    protected Place place;
    protected boolean alive = true;

    public Human(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    @Override
    public String toString() {
        return name;
    }

    public void die() {
        place.removeHuman(this);
        alive = false;
    }

    public int getHealth() {
        return health;
    }

    public State getState(){
        return state;
    }
    public void decreaseHealth(int amount) {
        health -= amount;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Place getPlace() {
        return place;
    }

    public boolean isAlive() {
        return alive;
    }

    public abstract void worsenState();

    public abstract void leavePlace();

}
