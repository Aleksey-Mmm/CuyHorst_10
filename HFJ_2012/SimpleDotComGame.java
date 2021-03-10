package primery.HFJ_2012;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        //SimpleDotCom theDotCom = new SimpleDotCom();
        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);
        //int[] locations = {randomNum, randomNum+1, randomNum+2};
        ArrayList<String> locations = new ArrayList<>();
        locations.add(String.valueOf(randomNum));
        locations.add(String.valueOf(randomNum+1));
        locations.add(String.valueOf(randomNum+2));
        theDotCom.setLocationsCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Введите число:");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if ("Потопил".equals(result)) {
                isAlive = false;
                System.out.println("Вам потребовалось "+ numOfGuesses+ " попыток.");
            }
        }
    }
}
