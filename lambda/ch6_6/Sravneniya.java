package primery.lambda.ch6_6;

import primery.inherit.Employee;
import primery.interfs.Person;
import primery.interfs.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sravneniya {
    //компараторы
    public static void main(String[] args) {
        //список имен
        List<String> names = new ArrayList<String>(){{add("John"); add("Alex"); add("Petrovich");}};
        System.out.println(names);
//из него создаем список объектов класса Student
        Stream<Student> stream = names.stream().map((String name) -> new Student(name, "sd"));
        List<Student> people = stream.collect(Collectors.toList());

        //Person[] people = names.toArray((n, "ss")->new Student(n, "ds"));
        //System.out.println(Arrays.toString(stream.toArray()));
        //people.forEach(System.out::println);

        people.stream().map(st -> st.getName() + " " + st.getDescription()).forEach(System.out::println);

        Student[] stArr = people.stream().toArray(Student[]::new);

        System.out.println(Arrays.toString(stArr));

    }
}
