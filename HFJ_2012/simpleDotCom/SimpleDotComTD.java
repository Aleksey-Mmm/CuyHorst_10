package primery.HFJ_2012.simpleDotCom;

import primery.HFJ_2012.simpleDotCom.SimpleDotCom;

public class SimpleDotComTD {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocationsCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "Косяк где то...";
        if ("Попал".equals(result)) {
            testResult = "Пройден (2)";
        }
        System.out.println(testResult);

        userGuess = "1";
        result = dot.checkYourself(userGuess);
        if ("Мимо".equals(result)) {
            System.out.println("Пройден (" + userGuess+ ")");
        } else {
            System.out.println("Не прошел ("+ userGuess+ ")");
        }

        userGuess = "3";
        result = dot.checkYourself(userGuess);
        if ("Попал".equals(result)) {
            System.out.println("Пройден (" + userGuess+ ")");
        } else {
            System.out.println("Не прошел ("+ userGuess+ ")");
        }

        userGuess = "4";
        result = dot.checkYourself(userGuess);
        if ("Потопил".equals(result)) {
            System.out.println("Пройден (" + userGuess+ ")");
        } else {
            System.out.println("Не прошел ("+ userGuess+ ")");
        }

//        int hitCount = dot.getHitCount();
//        if (hitCount == 3) {
//            System.out.println("Пройден (hitCount)= "+ hitCount);
//        } else {
//            System.out.println("Не прошел (hitCount)= "+ hitCount);
//        }

    }
}
