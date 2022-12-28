public interface BaseClass {
    void attack();

    void restoreHealth(int ammount);  // восстановление здоровья

    void loseHealth(int ammount);

    void restoreMana(int ammount);

    void loseMana(int ammount);

    void levelUp();

    void info(); // mozno toString.
}



