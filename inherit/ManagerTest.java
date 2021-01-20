package primery.inherit;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Alex", 42000, 1996, 6, 25);
        boss.setBonus(5555);

        Employee[] em = new Employee[3];

        em[0] = boss;
        em[1] = new Employee("Kepka", 45000, 1993, 5, 20);
        em[2] = new Employee("Pasha", 46000, 2017, 2, 12);

        for (Employee e : em) {
            System.out.println("name: "+ e.getName()+ ", salary: "+ e.getSalary());
        }

//        Manager[] managers = new Manager[10];
//        Employee[] staff = managers;
//        staff[0] = new Employee("asd", 100, 2000, 10, 15); //так нельзя!

    }


}
