package primery.lambda.ch6_6;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.util.Arrays;


public class LambdaTest {
    public static void main(String[] args) {
        String[] sSys = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter",
                "Saturn", "Uranus", "Neptune", "Plutonium", "moon"};
        System.out.println(Arrays.toString(sSys));
        System.out.println("Literal sort:");
        Arrays.sort(sSys);
        System.out.println(Arrays.toString(sSys));
        System.out.println("Length sort:");
        Arrays.sort(sSys, (first, second)->(first.length() - second.length()));
        System.out.println(Arrays.toString(sSys));
        System.out.println("Ignore case:");
        Arrays.sort(sSys, String::compareToIgnoreCase);
        //same:
        //Arrays.sort(sSys, (x,y)->x.compareToIgnoreCase(y));
        System.out.println(Arrays.toString(sSys));

        Timer t = new Timer(1000, event-> System.out.println("Local time: "+ LocalTime.now()));
        t.start();

        JOptionPane.showMessageDialog(null, "Ok", "Ща закрою..", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
