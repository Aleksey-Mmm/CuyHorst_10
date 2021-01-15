package primery;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class v1ch3_7_3 {
    //files in out
    public static void main(String[] args) throws IOException {
        final String dir = "src/primery/outFiles/"; //папка outFiles  должна существовать
        PrintWriter writer = new PrintWriter(dir+ "1ch373.txt", "UTF-8");
        writer.println("Это всё, что отанется");
        writer.println("После меня..");
        writer.close();

        Scanner scanner = new Scanner(Paths.get(dir+ "1ch373.txt"));
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(str);
        }

    }
}
