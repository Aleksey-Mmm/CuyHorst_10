package primery.inherit;

public class Manager extends Employee {
    private double bonus;

    /**
     * @param n Имя
     * @param s зарплата
     * @param year год приема на работу
     * @param month месяц -/-
     * @param day день -/-
     */
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        this.bonus = 8000;
    }

    public double getSalary() {
        //bonus +=8;
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

//    public String getDescription() {
//        //String description;
//        return String.format("a manager with salary %.2f", getSalary());
//        //return "an employee with salary ";
//    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
