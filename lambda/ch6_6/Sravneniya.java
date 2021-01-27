package primery.lambda.ch6_6;

import primery.interfs.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sravneniya {
    //компараторы
    public static void main(String[] args) {
        //создаем список имен
        //String[] nArr = {"John", "Alexey", "Petrovich"};
        //List<String> names = Arrays.asList(nArr);
     //same
        //List<String> names = new ArrayList<String>(){{add("John"); add("Alexey"); add("Petrovich");}};
     //same
        List<String> names = Arrays.asList("John", "Alexey", "Petrovich");
        //System.out.println(names);
        //преобразуем в поток создаваемых из списка имен объектов типа Man
        Stream<Man> stream = names.stream().map(Man::new);
        //преобразуемпоток в массив
        Man[] men = stream.toArray(Man[]::new);
        //вывести результат одного метода можно так
        //Arrays.stream(men).map(Man::getName).forEach(System.out::println);
        //если больше
        Arrays.stream(men).map(m-> m.getName()+ " - "+ m.getDescription()).forEach(System.out::println);
        System.out.println();

//из него создаем список объектов класса Student
     //   Stream<Student> stream = names.stream().map((String name) -> new Student(name, "sd"));
     //   List<Student> people = stream.collect(Collectors.toList());

        //Person[] people = names.toArray((n, "ss")->new Student(n, "ds"));
        //System.out.println(Arrays.toString(stream.toArray()));
        //people.forEach(System.out::println);

       // people.stream().map(st -> st.getName() + " " + st.getDescription()).forEach(System.out::println);

       // Student[] stArr = people.stream().toArray(Student[]::new);

       // System.out.println(Arrays.toString(stArr));

        //comparators
        //сортировка по возвращаемому методом значению
        //можно reverse, можно связывать через (.) thenComparing (сработает в слчае равенства первого сравнения)
        Arrays.sort(men, Comparator.comparing(Man::getName));
        Arrays.stream(men).map(Man::getName).forEach(System.out::println);
        System.out.println();
        //сортировка по длине имени
        //Arrays.sort(men, Comparator.comparing(Man::getName, (f, s)->Integer.compare(f.length(), s.length())));
        //same
        // кстати можно так же использовать класс предка, главное, чтобы у него был нужный метод
        //Arrays.sort(men, Comparator.comparing(Person::getName, Comparator.comparingInt(String::length)));
        //same
        Arrays.sort(men, Comparator.comparingInt(m->m.getName().length()));
        Arrays.stream(men).map(Man::getName).forEach(System.out::println);
        System.out.println();

        //добавил значения в поле, в котором может быть null
        men[0].setsName("Doe");
        men[1].setsName("Valer");
        //в этом случае при null будет Exception NullPointException
        //Arrays.sort(men, Comparator.comparing(Man::getsName));
        //чтобы работать с null:
        //nullsFirst() - компаратор, который работает с null, и считает его меньше всех (наоборот - nullsLast)
        //naturalOrder() - создает компаратор для любого класса реализующего интерфейс Comparable. Но тип этого
        // метода выводится автоматически (есть еще reverseOrder()
        Arrays.sort(men, Comparator.comparing(Man::getsName, Comparator.nullsFirst(Comparator.naturalOrder())));
        //same (но как то не уверен, что так правильно..
        //Arrays.sort(men, Comparator.comparing(Man::getsName, Comparator.nullsFirst(String::compareTo)));
        Arrays.stream(men).map(Man::getName).forEach(System.out::println);


    }
}

class Man extends Person {
    private String sName = null;

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsName() {
        return sName;
    }

    public Man(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "description";
    }
}
