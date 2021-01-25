package primery.interfs;

public interface Named {
    default String getName() {
        return getClass().getName() + "_"+ hashCode();
    }

    //нельзя в интерфейсе переопределить методы класса Object
//    default String toString() {
//        return "Переопределенный!";
//    }
}
