package bridge.pattern;

public abstract class HewanDarat implements Hewan{
    @Override
    public boolean isHidupDiAir() {
        return false;
    }

    @Override
    public boolean isHidupDiDarat() {
        return true;
    }

    public abstract int getJmlKaki();
}
