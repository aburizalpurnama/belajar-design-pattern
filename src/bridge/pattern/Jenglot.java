package bridge.pattern;

public class Jenglot implements Hewan{
    @Override
    public String getNama() {
        return "Jenglot";
    }

    @Override
    public boolean isHidupDiAir() {
        return false;
    }

    @Override
    public boolean isHidupDiDarat() {
        return false;
    }
}
