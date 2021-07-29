package template.pattern;

public class BlockGame1 extends BlockGameTemplate{
    @Override
    protected String getCharacter() {
        return "x";
    }

    @Override
    protected int getWidth() {
        return 10;
    }

    @Override
    protected int getHeight() {
        return 5;
    }

    @Override
    protected String getTittle() {
        return "Block Game 5x10";
    }


//    public void create(){
//        System.out.println("Block Game");
//
//        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < 20; j++) {
//                System.out.print("O");
//            }
//            System.out.print("\n \r");
//        }
//
//        System.out.println("Finish Block Game");
//    }
}
