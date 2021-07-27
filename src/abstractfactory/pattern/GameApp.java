package abstractfactory.pattern;

import java.awt.*;

public class GameApp {
    public static void main(String[] args) {
        var gameEasy = new Game(new GameFactoryEasy());
        gameEasy.start();

        var gameMedium = new Game(new GameFactoryMedium());
        gameMedium.start();

        var gameHard = new Game(new GameFactoryHard());
        gameHard.start();
    }
}
