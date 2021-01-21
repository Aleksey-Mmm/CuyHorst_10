package primery.inherit;

import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Student("Serg", "Electric");
        people[1] = new Manager("Alex", 45000, 1996, 6, 25);
        people[2] = new Employee("Igor", 40000, 2016, 7, 2);

        Person em2 = new Employee("Igor2", 40000, 2016, 7, 2);
        Person m2 = new  Manager("Alex", 45000, 1996, 6, 25);
        Person mmm2 = new  Manager("Igor2", 40000, 2016, 7, 2);

        //System.out.println(people[2] == em2);
        //System.out.println(em2.equals(people[1]));
        System.out.println();
        System.out.println(people[1].equals(m2));
        //System.out.println(em2.equals(mmm2));

        for (Person p : people) {
            System.out.println(p.getName()+ " - "+ p.getDescription());
        }
        //same
//        Arrays.stream(people).map(p -> p.getName() + " - " + p.getDescription()).forEach(System.out::println);

        System.out.println();

  //      Arrays.stream(people).forEach(System.out::println);



    }
}
