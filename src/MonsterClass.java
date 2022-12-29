public abstract class MonsterClass implements BaseClass{ // nasleduet basoviyi ibo te zhe har-ki chto i u geroev
//    private int healthPoints;
    private int manaPoints;
    private int level;
    private AttacType attacType; // eto enum AttackType
    private int attackAmmount;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;



    @Override               // i vse metodi budut rabotat' kak i dlya geroev
    public void attack() {

    }

    @Override
    public void restoreHealth(int ammount) {

    }

    @Override
    public void loseHealth(int ammount) {

    }

    @Override
    public void restoreMana(int ammount) {

    }

    @Override
    public void loseMana(int ammount) {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {

    }
}
