package template.pattern;

public class GameApp {
    public static void main(String[] args) {
        BlockGame1 blockGame = new BlockGame1();
        blockGame.create();

        System.out.println();

        BlockGame2 blockGame2 = new BlockGame2();
        blockGame2.create();
    }
}
