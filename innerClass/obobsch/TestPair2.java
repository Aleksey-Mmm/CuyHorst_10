package primery.innerClass.obobsch;

import java.time.LocalDate;

public class TestPair2 {
    public static void main(String[] args) {
        LocalDate[] birthDays = {
                LocalDate.of(1906,12,9),
                LocalDate.of(1815,12,10),
                LocalDate.of(1903,12,3),
                LocalDate.of(1910,6,22),
        };

        ArrayAlg.Pair<LocalDate> p = ArrayAlg.minmax(birthDays);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}

class ArrayAlg {

    /**
     * плучение минимального и максимального значения из массива
     * обобщенного типа Т расширяющего класс {@link Comparable}
     * @param a
     * @param <T>
     * @return Pair
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }

        return new Pair<>(min, max);
    }

    /**
     * обобщенный класс для хранения двух значений
     * @param <T>
     */
    public static class Pair<T> {
        private final T first;
        private final T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }
    }
}
