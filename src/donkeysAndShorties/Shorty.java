package donkeysAndShorties;


import help.*;
import people.Human;
import people.Passerby;

import java.util.Random;

public class Shorty extends Donkey implements Killing{
    public Shorty(String nickname) {
        super(nickname);
    }

    @Override
    public void bite(Human passerby) throws AlreadyIsDeadException{
        if (passerby.getHealth() <= 0) {
            Logger.log(new ActionResult(this, passerby, ActionType.BITE));
            Logger.log(new ActionResult(this, passerby, ActionType.KILL));
            passerby.die();
        } else {
            Logger.log(new ActionResult(this, passerby, ActionType.BITE));
            passerby.decreaseHealth(40);
            passerby.worsenState();
            passerby.leavePlace();
        }
    }

    @Override
    public void kill(Passerby passerby) throws AlreadyIsDeadException{
        Logger.log(new ActionResult(this, passerby, ActionType.KILL));
        passerby.die();
    }

    @Override
    public void doSomething(Human passerby) throws AlreadyIsDeadException{
        Random rand = new Random();
        switch (rand.nextInt(0, 3)) {
            case 0: this.scare(passerby); break;
            case 1: this.bite(passerby); break;
            case 2: this.kill((Passerby) passerby); break;

        }
    }
}