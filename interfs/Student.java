package primery.interfs;

public class Student extends Person implements Named {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "a student majoring in "+ major;
    }

}
