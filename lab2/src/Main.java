import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle ();
        Minior p1 = new Minior("rtx3090", 1);
        TapuFini p2 = new TapuFini("Чернорабочий", 10);
        Silvally p3 = new Silvally("АлександрⅠ", 10);
        Togekiss p4 = new Togekiss("Клименков", 10);
        Togetic p5 = new Togetic("Чернорабочий", 10);
        Togepi p6 = new Togepi("Мамонтёнок", 10);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}