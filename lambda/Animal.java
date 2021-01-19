package primery.lambda;

public class Animal {
    private final String name;
    private final boolean canHope;
    private final boolean canSwim;

    public Animal(String name, boolean canHope, boolean canSwim) {
        this.name = name;
        this.canHope = canHope;
        this.canSwim = canSwim;
    }

    public String getName() {
        return name;
    }

    public boolean isCanHope() {
        return canHope;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                '}';
    }
}
