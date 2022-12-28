public class Healer extends CharacterClass {
    public Healer(String name){
        this.setLevel(1);
        this.setHealthPoints(60);
        this.setManaPoints(150);
        this.setMaxHealthPoints(60);
        this.setMaxManaPoints(150);
        this.setName(name);
        this.setAttacType(AttacType.MAGICAL_RANGED);
        this.setAttackAmmount(2);
}
    }

