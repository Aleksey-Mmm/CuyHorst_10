package primery.javaRush;

public class dzInteger {
    public static void main(String[] args) {
        //У нас есть два числа:
        //
        //1100001001 — в двоичной системе счисления
        //33332 — в пятеричной системе счисления
        //
        //Необходимо используя только методы класса Integer определить максимум среди двух данных чисел,
        // а затем вывести разницу между максимальным и минимальным значением в троичной системе счисления.

        Integer biNum = Integer.valueOf("1100001001", 2);
        //Integer biNum = Integer.parseInt("1100001001", 2);
        Integer ftNum = Integer.valueOf("33332", 5);

        System.out.println(Integer.toString(Integer.max(biNum, ftNum) - Integer.min(biNum, ftNum), 3));

        //------------/
        //Перевести максимально возможное значение Integer в восьмеричную систему счисления
        // и вывести на экран количество цифр в полученном числе

        Integer maxInt = Integer.MAX_VALUE;
        //Integer ocInt = Integer.valueOf(maxInt.toString(), 8); Error!!!

        System.out.println(Integer.toOctalString(maxInt).length());
        TestInteger ti = new TestInteger();
        ti.t1();
    }



}
    class TestInteger {
        public static Integer cnt = 2020;  //или лучше int?

        public void t1() {
            for (int i=0; i<10; i++){
                System.out.println(i*2);
                cnt++;
            }
            System.out.println(cnt);
        }
    }