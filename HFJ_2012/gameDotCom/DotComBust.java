package primery.HFJ_2012.gameDotCom;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        //созлание сайтов
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Ваша цель - потопить три сайта.");
        System.out.println("Попытайтесь сделать это за минимальное количество ходов.");
        System.out.println("Ваш ход - это ввод координаты в формате буква+цифра (b2)");

        for (DotCom dotComToSet : dotComList) {
            dotComToSet.setLocationCells(helper.placeDotCom(3));
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход:");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо!";

        for (DotCom dotComTest : dotComList) {
            result = dotComTest.checkYourself(userGuess);
            if ("Попал..".equals(result)) {
                break;
            }
            if ("Потопил".equals(result)) {
                dotComList.remove(dotComTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все сайты пошли ко дну. Ваши акции теперь ничего не стоят..");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у Вас всего " + numOfGuesses + " попыток.");
            System.out.println("Вы успели выбраться до того, как Ваши вложения утонули.");
        } else {
            System.out.println("Это заняло у Вас довольно много времени, " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений..");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
