package primery.innerClass;

import java.util.Arrays;

public class InnerStaticClass {
    public static void main(String[] args) {
        double[] dArr = new  double[10];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = 100 * Math.random();
        }
        Arrays.stream(dArr).forEach(System.out::println);

        //если не делать minmax статическим
        //ArrayAlg arrayAlg = new ArrayAlg();
        //arrayAlg.minmax(dArr);

        ArrayAlg.Pair p = ArrayAlg.minmax(dArr);
        //полное имя класса ArrayAlg.Pair а не просто Pair
        //полезно, если где то еще понадобится класс Pair но с другой сигнатурой

        System.out.println(p.getFirst()+"; "+ p.getSecond());
    }
}

class ArrayAlg {
    public static class Pair {
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (Double d : values) {
            if (min > d) min=d;
            if (max < d) max=d;
        }
        return new Pair(min, max);
    }
}