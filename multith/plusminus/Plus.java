package primery.multith.plusminus;

public class Plus extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            if (i % 10_000 == 0) {
                System.out.println("Thread "+ Thread.currentThread().getName()+ " work");
            }
            synchronized (PlusMinus.class) {
                PlusMinus.sum ++;
            }
        }
    }
}
