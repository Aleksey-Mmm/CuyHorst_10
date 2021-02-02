package primery.temp;

public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska");
        System.out.println(cat.getName());
        Cat catWrap = new CatWrapper(cat);
        System.out.println(catWrap.getName());
    }
}
