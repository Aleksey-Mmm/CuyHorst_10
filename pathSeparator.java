package primery;

import java.nio.file.FileSystems;

public class pathSeparator {
    public static void main(String[] args) {
        String separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);
    }
}
