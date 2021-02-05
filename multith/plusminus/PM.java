package primery.multith.plusminus;

public class PM {
    private int anInt;

    public PM(int anInt) {
        this.anInt = anInt;
    }

    public synchronized void plus() {
        anInt++;
    }

    public synchronized void minus() {
        anInt--;
    }

    public int getAnInt() {
        return anInt;
    }
}
