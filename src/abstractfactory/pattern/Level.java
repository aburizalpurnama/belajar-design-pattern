package abstractfactory.pattern;

public interface Level {

    public void start();

}

class LevelEasy implements Level{

    @Override
    public void start() {
        System.out.println("level Easy");
    }
}

class LevelMedium implements Level{

    @Override
    public void start() {
        System.out.println("level Medium");
    }
}

class LevelHard implements Level{

    @Override
    public void start() {
        System.out.println("level Hard");
    }
}
