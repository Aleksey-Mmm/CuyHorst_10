package primery.temp;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void privMethod() {
        //setName("PrIIIv!");
        System.out.println("Private method Cat");
    }
}

class CatWrapper extends Cat {

    public CatWrapper(Cat cat) {
        super(cat.getName());
    }

    public void privMethod() {
        setName("wrapped");
    }

    public void method1() {
        privMethod();
    }

    @Override
    public String getName() {
        return "Cat's name is: "+ super.getName();

    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
