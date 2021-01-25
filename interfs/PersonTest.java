package primery.interfs;

public class PersonTest {
    public static void main(String[] args) {
        Person st = new Student("Eee", "Electric");
        System.out.println(st.getDescription());

        //при конфликте имен методов интерфейса и суперкласса побеждает суперклас.
        System.out.println(st.getName());
    }
}
