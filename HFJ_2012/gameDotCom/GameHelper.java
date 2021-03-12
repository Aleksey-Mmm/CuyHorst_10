package primery.HFJ_2012.gameDotCom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt+ " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>();
        String[] alphaCoords = new String[comSize]; //хранит координаты типа f6
        String temp = null; //временная строка
        int[] coords = new int[comSize]; //координаты текущего сайта
        int attempts = 0; //счетчик текущих попыток
        boolean success = false; //нашли подходящее местоположение?
        int location = 0; //текущее начальное местоположение

        comCount++;     //энный "сайт" для размещения
        int incr = 1;   //устанавливаем горизонтальный инкремент
        if ((comCount % 2) == 1) {  //если нечетный - размещаем вертикально
            incr = gridLength;   //устанавливаем вертикальный инкремент
        }

        while (!success & attempts++ < 200) {   //главный поисковый цикл
            location = (int) (Math.random() * gridSize);    //получаем случайную стартовую точку
            int x = 0;  //энная позиция в "сайте" который нужно разместить
            success = true; //предполагаем удачный исход
            while (success && x < comSize) {    //ищем соседнюю неиспользованную ячейку
                if (grid[location] == 0) {  //если еще не используется
                    coords[x++] = location; //сохраняем местоположение
                    location += incr;   //пробуем следующую соседнюю ячейку
                    if (location >= gridSize) { //вышли за рамки - низ
                        success = false;    //неудача
                    }
                    if (x > 0 && (location % gridLength == 0)) { //вышли за рамки - правый край
                        success = false;    //неудача
                    }
                } else {    //уже используется
                    success = false;    //неудача
                }
            }
        }

        return null;
    }
}
