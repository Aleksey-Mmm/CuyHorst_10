package primery;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
    public static void main(String[] args) {
        String name = "primery.inherit.Manager";

        try {
            Class cl = Class.forName(name);

            System.out.println("Class: "+ cl.getName());
            Class superCl = cl.getSuperclass();
            if (superCl != null && superCl != Object.class) {
                System.out.println("Super class: "+ superCl.getName());
            }
            System.out.println("All methods:");
            Method[] methods = cl.getMethods();
            Arrays.stream(methods).forEach(System.out::println);

            System.out.println("Declared fields:");
            Field[] fields = cl.getDeclaredFields();
            Arrays.stream(fields).forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
