package primery.javaRush;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Solution2003 {
    private static final Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        final String dir = "src/primery/outFiles/"; //папка outFiles  должна существовать

        setHashTable();
        File propertyFile = new File(dir, "2003.properties");
        map.forEach((s, s2) -> System.out.println(s+ " = "+ s2));
        System.out.println(" - - - - - - - - ");
        loadProperty(propertyFile);
        map.forEach((s, s2) -> System.out.println(s+ " = "+ s2));


        //saveProperty(properties, propertyFile);
    }

    protected static void loadProperty(File propertyFile) {
        map.clear();
        Properties properties = new Properties();
        try (InputStream in = new FileInputStream(propertyFile)) {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String key : properties.stringPropertyNames()) {
            map.put(key, properties.getProperty(key));
        }

    }

    protected static void saveProperty(File propertyFile) {
        Properties properties = new Properties();
        properties.putAll(map);
        try(OutputStream out = new FileOutputStream(propertyFile)) {
            properties.store(out, "Comment");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static void setHashTable() {
        map.put("Simple", "Value");
        map.put("key\\ with\\ space", "val 2--");
        map.put("key without backslashes", "v:3");
        map.put("key\\:with\\:dvoetochie", "    valf   ");
        map.put("key: kak=popalo", " : val-\\=: \\:  :");
    }
}
