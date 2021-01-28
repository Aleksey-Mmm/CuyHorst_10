package primery.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class TalkingClock {
    private int interval;
    private boolean needBeep;

    public TalkingClock(int interval, boolean needBeep) {
        this.interval = interval;
        this.needBeep = needBeep;
    }

    public void start() {
        //локальный класс. Не имеет модификатора доступа
        class TimePrinter implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Время нынче: "+ LocalTime.now());
                if (needBeep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener listener = new TimePrinter();
        Timer timer = new Timer(interval, listener);
        timer.start();
    }
    //внутренний класс. Можно сделать из него вообще локальный класс (см. выше)
//    public class TimePrinter implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println("Время нынче: "+ LocalTime.now());
//            if (needBeep) {
//                Toolkit.getDefaultToolkit().beep();
//            }
//        }
//    }
}
