package template.pattern;

public class BlockGame2 extends BlockGameTemplate{
    @Override
    protected String getCharacter() {
        return "i";
    }

    @Override
    protected int getWidth() {
        return 5;
    }

    @Override
    protected int getHeight() {
        return 7;
    }

    @Override
    protected String getTittle() {
        return "Block Game i ukuran " + getHeight() + "x" + getWidth();
    }
}
