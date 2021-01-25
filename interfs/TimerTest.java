package primery.interfs;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        Timer t = new Timer(5000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Выйти?");
        System.exit(0);
    }
}
