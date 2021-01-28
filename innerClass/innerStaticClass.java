package primery.innerClass;

public class innerStaticClass {
    public static void main(String[] args) {
        double[] dArr = new  double[10];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = 100 * Math.random();
            ArrayAlg arrayAlg = new ArrayAlg();
            ArrayAlg.Pair p = arrayAlg.minmax(dArr);
        }
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

    public Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (Double d : values) {
            if (min > d) min=d;
            if (max < d) max=d;
        }
        return new Pair(min, max);
    }
}