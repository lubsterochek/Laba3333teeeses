package donkeysAndShorties;

import help.AlreadyIsDeadException;
import people.Human;

public interface Aggresive {
    void scare(Human human);
    void bite(Human human) throws AlreadyIsDeadException;
}
