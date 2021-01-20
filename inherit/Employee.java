package primery.inherit;

import java.time.LocalDate;

public class Employee extends Person{
    //private String name;
    private double salary;
    private LocalDate hireDay;
    //private String description = "work, work..";

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        //this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public void raiseSalary(double byPercent) {
        double rise = salary * byPercent / 100;
        salary += rise;
    }

//    public String getName() {
//        return name;
//    }

    @Override
    public String getDescription() {
        //String description;
        return String.format("an employee with salary %.2f", getSalary());
        //return "an employee with salary ";
    }


    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
}
