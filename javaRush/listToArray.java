package primery.javaRush;

import java.util.Arrays;
import java.util.List;

public class listToArray {
    //Как по быстрому запилить списочек list to array
    public static void main(String[] args) {
        List<Integer> lInt = Arrays.asList(1,25,68,21,96);

        //из List в int[]
        //перебором
        int[] iArr1 = new int[lInt.size()];
        for (int i = 0; i < lInt.size(); i++) {
            iArr1[i] = lInt.get(i); //+автораспаковка
        }

        //use toArray
        int[] iArr2 = lInt.stream().mapToInt(i->i).toArray();

// Получение Integer[] из int[]
        Integer [] integerArray = Arrays.stream(iArr2).boxed().toArray(Integer[]::new);

// Получение int[]  из Integer[]
        int[] intArr = Arrays.stream(integerArray).mapToInt(i->i).toArray();

        Arrays.stream(integerArray).forEach(System.out::println);
        System.out.println();
        Arrays.stream(intArr).forEach(System.out::println);

    }
}
