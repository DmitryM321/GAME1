public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Gendalf"), new Warrior("Aragorn"),
                new Archer("Legolas"), new Healer("Radogast"));
        party.info();
        Dungeon dungeon = new Dungeon(); // new podzemelie
        party.enterDungeron(dungeon);
    }
}