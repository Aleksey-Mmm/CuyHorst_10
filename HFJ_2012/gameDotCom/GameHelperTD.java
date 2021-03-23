package primery.HFJ_2012.gameDotCom;


import java.util.ArrayList;

public class GameHelperTD {
    public static void main(String[] args) {
        //проверка генерации расположения "сайтов"
        GameHelper gameHelper = new GameHelper();
        ArrayList<String>[] dotCom = new ArrayList[3];
        for (int i=0; i<3; i++) {
            dotCom[i]  = gameHelper.placeDotCom(3);
            if (dotCom[i].size() == 3) {
                System.out.println("Правильный размер сайта "+ i);
            } else {
                System.out.println("Error list size "+ i+ "!!");
            }
            dotCom[i].forEach(System.out::println);
            System.out.println();
        }

    }


}
