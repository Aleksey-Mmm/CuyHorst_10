package primery.HFJ_2012.magnets.str191;

import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0, "ноль");
        a.add(1, "один");
        a.add(2, "два");
        a.add(3, "три");
        printAL(a);
        a.remove(2);
        if (a.contains("три")) {
            a.add("четыре");
        }
        printAL(a);
        if (a.indexOf("четыре") != 4) {
            a.add(4,"4.2");
        }
        printAL(a);
        if (a.contains("два")) {
            a.add("2.2");
        }
        printAL(a);
    }

    public static void printAL(ArrayList<String> al) {

        for (String element : al) {
            System.out.print(al.indexOf(element) +"-" + element+ " ");
        }
        System.out.println();
    }
}
