package primery;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size: SMALL, MEDIUM, LARGE, EXTRA_LARGE");
        String input = in.next().toUpperCase();

        //Size size = Size.valueOf(input);
        //same
        Size size = Enum.valueOf(Size.class, input);

        System.out.println(size);

        System.out.println(size.getAbbrev());
        //same данном случае сработает и так:
        //System.out.println(size.abbrev);

    }

    private enum Size{
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

        private final String abbrev;

        Size(String abbrev) {
            this.abbrev = abbrev;
        }

        public String getAbbrev() {
            return abbrev;
        }

    }
}
