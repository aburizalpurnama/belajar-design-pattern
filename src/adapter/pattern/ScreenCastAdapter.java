package adapter.pattern;

public class ScreenCastAdapter implements Adapter{

    private ScreenCast screenCast;

    public ScreenCastAdapter(ScreenCast screenCast) {
        this.screenCast = screenCast;
    }

    @Override
    public String getCatalogTittle() {
        return screenCast.getTittle() + " by. " + screenCast.getAuthor();
    }
}
