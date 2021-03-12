package primery.HFJ_2012.gameDotCom;


import java.util.ArrayList;

public class GameHelperTD {
    public static void main(String[] args) {
        //проверка генерации расположения "сайтов"
        GameHelper gameHelper = new GameHelper();
        ArrayList<String> list = gameHelper.placeDotCom(3);
        if (list.size() == 3) {
            System.out.println("Правильный размер списка.");
        } else {
            System.out.println("Error list size!!");
        }
    }


}
