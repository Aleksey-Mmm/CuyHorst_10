package primery.inherit;

import java.time.LocalDate;
import java.util.Objects;

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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        System.out.println("Employee class: "+ o.getClass().getName());
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Double.compare(employee.getSalary(), getSalary()) == 0 && getHireDay().equals(employee.getHireDay());
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        System.out.println("Employee class: "+ getClass().getName()+ " other class: "+ o.getClass().getName());
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.getSalary(), getSalary()) != 0) return false;
        return getHireDay().equals(employee.getHireDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSalary(), getHireDay());
    }

    @Override
    public String toString() {
        return getClass().getName()+ "{" +
                "salary=" + getSalary() +
                ", hireDay=" + getHireDay() +
                '}';
    }
}
