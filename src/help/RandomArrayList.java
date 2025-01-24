package help;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    private Random random = new Random();

    public RandomArrayList() {super();}
    public RandomArrayList(Collection<T> c) {
        super(c);
    }

    public RandomArrayList(T[] c) {
        super(c.length);
        for (int i = 0; i < c.length; i++) {
            add(c[i]);
        }
    }

    public T getRandom() {
            return this.get(random.nextInt(0, this.size()) % this.size());
    }
}
