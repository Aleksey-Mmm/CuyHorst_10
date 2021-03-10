package primery.HFJ_2012;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationsCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }

        return result;
    }
}
