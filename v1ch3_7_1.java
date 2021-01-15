package primery;

import java.io.Console;
import java.util.Scanner;

public class v1ch3_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println(name);

        Console console = System.console();
        // console почему то не работает.. бросает NullPointException
//        String userName = console.readLine();
//        //char[] pass = console.readPassword("Password: ");
//        System.out.println(userName);

    }
}
