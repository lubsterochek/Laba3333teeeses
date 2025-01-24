package people;

import help.ActionResult;
import help.ActionType;
import help.Logger;
import places.City;
import places.Place;

public class ZooWorker extends Human {
    public ZooWorker(String name, Place place) {
        super(name, place);
    }

    @Override
    public void worsenState(){
        state = State.PANICKING;
    }

    @Override
    public void leavePlace() {
        if (getState() == State.PANICKING || getHealth()<=0) {
            Logger.log(new ActionResult(this, place, ActionType.FLEE));
            Passerby passerby = new Passerby(toString(), City.mainCity);
            City.mainCity.addHuman(passerby);
            place.removeHuman(this);
        }
    }
}