package abstractfactory.pattern;

public interface Enemy {
    public void start();
}

class EnemyEasy implements Enemy{

    @Override
    public void start() {
        System.out.println("Enemy is Easy");
    }
}

class EnemyMedium implements Enemy{

    @Override
    public void start() {
        System.out.println("Enemy is Medium");
    }
}

class EnemyHard implements Enemy{

    @Override
    public void start() {
        System.out.println("Enemy is Hard");
    }
}