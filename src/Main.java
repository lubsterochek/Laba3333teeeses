import donkeysAndShorties.Donkey;
import donkeysAndShorties.Shorty;
import help.*;
import people.Human;
import people.Passerby;
import people.ZooWorker;
import places.City;
import places.Zoo;

public class Main {
    public static void main(String[] args) {

        City city = new City("Березники");
        Zoo zoo = new Zoo("ИТМО");

        ZooWorker worker1 = new ZooWorker("Итмошник", zoo);
        zoo.getInhabitants().add(worker1);
        ZooWorker worker2 = new ZooWorker("Вшэшник", zoo);
        zoo.getInhabitants().add(worker2);
        ZooWorker worker3 = new ZooWorker("Спбгушник", zoo);
        zoo.getInhabitants().add(worker3);

        Donkey donkey1 = new Donkey("Шашлык");
        zoo.getDonkeys().add(donkey1);
        Donkey donkey2 = new Donkey("Беляш");
        zoo.getDonkeys().add(donkey2);
        Donkey donkey3 = new Donkey("Кебаб");
        zoo.getDonkeys().add(donkey3);

        Passerby passerby1 = new Passerby("Юра", city);
        city.getInhabitants().add(passerby1);
        Passerby passerby2 = new Passerby("Вася", city);
        city.getInhabitants().add(passerby2);
        Passerby passerby3 = new Passerby("Петя", city);
        city.getInhabitants().add(passerby3);
        Passerby passerby4 = new Passerby("Варя", city);
        city.getInhabitants().add(passerby4);

        Shorty shorty1 = new Shorty("Полторашка");
        city.getShorties().add(shorty1);

        RandomArrayList<Human> workers = zoo.getInhabitants();
        RandomArrayList<Human> residents = city.getInhabitants();
        RandomArrayList<Donkey> donkeys = zoo.getDonkeys();
        RandomArrayList<Shorty> shorties = city.getShorties();

        Donkey d = null;
        Shorty s = null;
        Human h = null;

        while (true) {
            try {
                d = donkeys.getRandom();
                h = workers.getRandom();
                d.doSomething(h);
            } catch (IllegalArgumentException e) {
                Logger.log(new ActionResult(h, h.getPlace(), ActionType.EMPTYZOO));
                break;
            } catch (AlreadyIsDeadException e) {
                Logger.log(new ActionResult(d, h, ActionType.DEAD));
            }
        }

        for (Donkey donkey : donkeys) {
            shorties.add(new Shorty(donkey.toString()));
        }

        while (true) {
            try {
                s = shorties.getRandom();
                h = residents.getRandom();
                s.doSomething(h);
            } catch (IllegalArgumentException e) {
                Logger.log(new ActionResult(h, h.getPlace(), ActionType.EMTPYCITY));
                System.out.println();
                break;
            } catch (AlreadyIsDeadException e) {
                Logger.log(new ActionResult(s, h, ActionType.DEAD));
            }
        }

        Logger.printLogs();
    }
}