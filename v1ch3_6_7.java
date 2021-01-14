package primery;

import java.util.Arrays;
//String разбивка на символы и сборка обратно
public class v1ch3_6_7 {
    public static void main(String[] args) {
        //тип char слижком низкоуровневый, и кодировка UTF-16 в него не всегда лезет
        String greeting = "Hello, усё!";
        int n = greeting.length();
        int cpCount = greeting.codePointCount(0,greeting.length());
        int[] codePoints = greeting.codePoints().toArray(); // строку на символы
        System.out.println(n);
        System.out.println(cpCount);
        Arrays.stream(codePoints).forEach(System.out::println);
        int offset = 7;
            //символы обратно в строку со сдвигом и до конца строки
        String str = new String(codePoints, offset, codePoints.length-offset);
        System.out.println(str);
        char ch = greeting.charAt(9);
        System.out.println(ch);
    }
}
