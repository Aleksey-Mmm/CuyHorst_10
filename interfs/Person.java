package primery.interfs;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        System.out.println("Person class: "+ getClass().getName());
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
