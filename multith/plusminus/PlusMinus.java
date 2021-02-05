package primery.multith.plusminus;

public class PlusMinus {
    //пример 1
    public static int sum = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        // разные потоки плюсуют и минусуют sum
        // получются разные результаты
        // ни volatile ни synchronized(this) не помогли.
        // только блок synchronized(PlusMinus.class) - по объекту

        // ! больше одного раза нити стартовать нельзя!
        for (int i=0; i<10; i++) {
            Plus plus = new Plus();
            Minus minus = new Minus();
            minus.start();
            plus.start();
            //plus.join();
            Thread.sleep(500);
            while (plus.isAlive() || minus.isAlive()) {
                Thread.sleep(500);
            }
            System.out.println(sum);
        }



    }

    //пример2
//    public static void main(String[] args) throws InterruptedException {
//        PM pm = new PM(1_000_000);
//
//
//        for (int i=0; i<15; i++) {
//            PlusTh plus = new PlusTh(pm);
//            MinusTh minus = new MinusTh(pm);
//            plus.start();
//            minus.start();
//
//            plus.join();
//            minus.join();
//            System.out.println(pm.getAnInt());
//
//        }
//
//        System.out.println(pm.getAnInt());
//
//    }
//
//}

    class PlusTh extends Thread {
        //две нити прибовляют и отнимают одну и ту же переменную
        //внутри одного объекта. получаются разные результаты.
        //volatile не помогает
        //помог synchronized обоих методов

        private final PM pm;

        public PlusTh(PM pm) {
            this.pm = pm;
        }

        @Override
        public void run() {
            for (int i = 0; i < 30000; i++) {
                pm.plus();
            }
        }
    }

    class MinusTh extends Thread {
        private final PM pm;

        public MinusTh(PM pm) {
            this.pm = pm;
        }

        @Override
        public void run() {
            for (int i = 0; i < 30000; i++) {
                pm.minus();
            }
        }
    }
}


