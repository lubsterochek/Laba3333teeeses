package help;

public enum ActionType {
    KILL("%1$s убил %2$s", "%1$s без сожалений прикончил %2$s","%1$s отправил %2$s на тот свет", "%1$s отправил %2$s в мир, где ослы не кусаются"),//2
    BITE("%1$s укусил %2$s", "%1$s вцепился зубами в %2$s", "%2$s вскрикнул от боли – %1$s его укусил!"), //3
    DIE("%1$s умер в городе %2$s", "%1$s испустил последний вздох и рухнул бездыханным в городе %2$s", "%1$s больше не увидит свой город"), //3
    FLEE("%1$s убежал из зоопарка %2$s", "%1$s бросил всё и побежал прочь из зоопарка %2$s", "Не выдержав кошмара, %1$s рванул к выходу из %2$s", "%1$s бросил ведро и исчез за воротами %2$s"), //4
    LEAVE("Из города %2$s уехал %1$s", "В спешке собирая вещи, %1$s покинул опасное место",
            "%1$s покинул город %2$s, надеясь больше никогда сюда не возвращаться", "%1$s уехал, оставив позади кошмарный город %2$s", "%1$s уехал, бросая последний взгляд на %2$s"), //4
    SCARE("%1$s испугал %2$s", "%1$s заставил дрожать %2$s", "%1$s подкрался сзади и испугал %2$s", "%1$s довел до слез %2$s"),
    EMPTYZOO("В зоопарке не осталось работников! А что происходит в городе?\n", "Странно, сегодня все рано ушли из зоопарка . Кажется, в городе тоже неспокойно...\n"),
    EMTPYCITY("Город опустел... \n", "В ГОРОДЕ %2$s НИКОГО НЕ ОСТАЛОСЬ \n"),
    DEAD("%1$s напал на уже мертвого %2$s", "%1$s не смог убить труп %2$s");

    private RandomArrayList<String> messages;

    ActionType(String ... messages) {
        this.messages = new RandomArrayList<String>(messages);
    }

    public String getMessage() {
        return messages.getRandom();
    }
}