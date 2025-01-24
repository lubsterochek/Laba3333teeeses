package donkeysAndShorties;

import help.AlreadyIsDeadException;
import people.Passerby;

public interface Killing {
    void kill(Passerby passerby) throws AlreadyIsDeadException;
}
