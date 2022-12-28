public class Archer extends CharacterClass {
    public Archer(String name) {
        this.setLevel(1);
        this.setHealthPoints(75);
        this.setManaPoints(50);
        this.setMaxHealthPoints(75);
        this.setMaxManaPoints(50);
        this.setName(name);
        this.setAttacType(AttacType.PHISICAL_RANGED);
        this.setAttackAmmount(7);




    }
}


