package primery.inherit;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Student("Serg", "Electric");
        people[1] = new Manager("Alex", 45000, 1996, 6, 25);
        people[2] = new Employee("Igor", 40000, 2016, 7, 2);

        for (Person p : people) {
            System.out.println(p.getName()+ " - "+ p.getDescription());
        }
    }
}
