package abstractfactory.pattern;

public class Game {
    private Level level;
    private Arena areana;
    private Enemy enemy;

    /**
     * MANUAL
     *
     * Jika pada parameter Level, Arena, dan Enemy diharuskan diisi dengan kondii tertentu semisal
     * tingkatannya harus sama. maka bisa dilakukan dengan abstract factory pattern,
     * karena jika tidak dibuat dengan design pattern,
     * bisa saja parameter yang dimasukkan tidak sesuai dengan ketentuan diatas.
     */
//    public Game(Level level, Arena arena, Enemy enemy) {
//        this.level = level;
//        this.areana = arena;
//        this.enemy = enemy;
//    }

    public Game(GameFactory gameFactory) {
        this.level = gameFactory.createLevel();
        this.areana = gameFactory.createArena();
        this.enemy = gameFactory.createEnemy();
    }

    public void start (){
        level.start();
        areana.start();
        enemy.start();
    }
}
