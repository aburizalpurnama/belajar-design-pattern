package template.pattern;

public abstract class BlockGameTemplate {

    public final void create(){
        System.out.println(getTittle());

        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                System.out.print(getCharacter());
            }
            System.out.print("\n \r");
        }

        System.out.println("Finish Block Game");
    }

    protected abstract String getCharacter();

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract String getTittle();
}
