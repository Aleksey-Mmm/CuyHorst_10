package primery.HFJ_2012.sdvig_str76;

public class sdvig {
    //бинарный сдвиг. n=1 только когда 8й бит установлен
    public static void main(String[] args) {
        int i=25;
        int n= (i & 8) ;
        System.out.println(Integer.toBinaryString(n));
    }

}

