package primery.javaRush.taskX1;

import java.util.Arrays;

public class Solution3 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            resultArray [i]= firstArray[i];
        }
//        for (int i = firstArray.length; i < secondArray.length + firstArray.length; i++) {
//            resultArray[i]=secondArray[i - firstArray.length];
//        }

        for (int i = 0; i < secondArray.length; i++) {
            resultArray[i + firstArray.length]=secondArray[i];
        }


        System.out.println(Arrays.toString(resultArray));
    }
}
