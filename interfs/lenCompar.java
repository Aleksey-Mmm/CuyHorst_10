package primery.interfs;

import java.util.Arrays;
import java.util.Comparator;

public class lenCompar {
    public static void main(String[] args) {
        String[] str = {"Odin", "Dva", "Tretia"};

        //LengthComparator cmp = new LengthComparator();
        //Arrays.sort(str, cmp);
        Arrays.sort(str, new LengthComparator());
        System.out.println(Arrays.toString(str));

    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
