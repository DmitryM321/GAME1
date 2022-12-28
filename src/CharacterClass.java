public abstract class CharacterClass implements BaseClass {

    private int healthPoints;
    private int manaPoints;
    private int level;
    private AttacType attacType; // eto enum AttackType
    private int attackAmmount;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;


    public AttacType getAttacType() {
        return attacType;
    }

    public void setAttacType(AttacType attacType) {
        this.attacType = attacType;
    }

    @Override
    public void attack() {

    }

    @Override
    public void restoreHealth(int ammount) {
        setHealthPoints(this.healthPoints + ammount);

    }

    @Override
    public void loseHealth(int ammount) {
        setHealthPoints(this.healthPoints - ammount);

    }

    @Override
    public void restoreMana(int ammount) {
        setManaPoints(this.manaPoints + ammount);
    }

    @Override
    public void loseMana(int ammount) {
        setManaPoints(this.manaPoints - ammount);

    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {
        System.out.println("Name " + this.name + "\nCurrentHP " + this.healthPoints + "\nCurrentMP " + this.manaPoints + "\nCurrentLevel " + this.level);;

    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints < 0)
            this.healthPoints = 0;
        else if (healthPoints > this.maxHealthPoints)
            this.healthPoints = this.maxHealthPoints;
        else
            this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        if (manaPoints < 0)
            this.manaPoints = 0;
        else if (manaPoints > manaPoints)
            this.manaPoints = maxManaPoints;
        else
            this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0) System.out.println("Мы не может играть в такой уровень");
        this.level = level;
    }

    public int getAttackAmmount() {
        return attackAmmount;
    }

    public void setAttackAmmount(int attackAmmount) {
        if(attackAmmount < 0) System.out.println("Не может быть атаки меньше нуля");
        else this.attackAmmount = attackAmmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }
}




// range - dalnaya ataka