public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Gendalf"), new Warrior("Aragorn"),
                new Archer("Legolas"), new Healer("Radogast"));
        party.info();
        Dungeon dungeon = new Dungeon(); // new podzemelie
        if (party.enterDungeron(dungeon)) {       //esli my zashly
            party.setDungeon(dungeon);
            party.runDungerob();
        } else System.out.println("Game over");

        // party.enterDungeron(dungeon);
    }
}