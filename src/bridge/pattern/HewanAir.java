package bridge.pattern;

public abstract class HewanAir implements Hewan{
    @Override
    public boolean isHidupDiDarat() {
        return false;
    }

    @Override
    public boolean isHidupDiAir() {
        return true;
    }

    public abstract int getJmlSirip();
}
