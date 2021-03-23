package primery.HFJ_2012.simpleDotCom;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationsCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "Мимо";

        for (int cell : locationCells) {
            if (cell == guess) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
//
//    public int getHitCount() {
//        return numOfHits;
//    }
}
