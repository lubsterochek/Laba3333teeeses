package people;

import help.ActionResult;
import help.ActionType;
import help.Logger;
import places.Place;

public class Passerby extends Human implements IDie {
    public Passerby(String name, Place place) {
        super(name, place);
    }

    @Override
    public void worsenState() {
        switch (state) {
            case HAPPY: state = State.CONCERNED; break;
            case CONCERNED: state = State.STRESSED; break;
            case STRESSED: state = State.FEARFUL; break;
            case FEARFUL, PANICKING: state = State.PANICKING; break;
        }
    }

    @Override
    public void leavePlace() {
        if (state == State.PANICKING) {
            place.removeHuman(this);
            Logger.log(new ActionResult(this, place, ActionType.LEAVE));
        }
    }
}