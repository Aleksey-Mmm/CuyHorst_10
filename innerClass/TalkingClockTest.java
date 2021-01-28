package primery.innerClass;

public class TalkingClockTest {
    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(3000, true);
        talkingClock.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
