package donkeysAndShorties;

import help.*;
import people.Human;

import java.util.Random;

public class Donkey implements Aggresive, IActor, INamed, doSomething {
    protected String nickname;

    public Donkey(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return nickname;
    }


    @Override
    public void scare(Human worker) {
        Logger.log(new ActionResult(this, worker, ActionType.SCARE));
        worker.worsenState();
        worker.leavePlace();
    }

    @Override
    public void bite(Human worker) throws AlreadyIsDeadException {
        worker.decreaseHealth(52);
        Logger.log(new ActionResult(this, worker, ActionType.BITE));
        worker.leavePlace();
    }

    @Override
    public void doSomething(Human worker) throws AlreadyIsDeadException {
        Random rand = new Random();
        switch (rand.nextInt(0, 2)) {
            case 0: this.scare(worker); break;
            case 1: this.bite(worker); break;
        }
    }
}
