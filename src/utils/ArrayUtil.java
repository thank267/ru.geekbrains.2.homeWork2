package utils;
import static constans.Constans.NEED_COLUMNS;
import static constans.Constans.NEED_ROWS;
import static constans.Constans.MISTAKE;

import java.util.Random;

import exceptions.MyArrayDataException;
import exceptions.MyArraySizeException;

public class ArrayUtil {

    /**
     * @param toSum;
     */
    public static int sumArray(String[][] toSum) {

        int sum = 0;
        int actialRows = toSum.length;
        int actialColumns = toSum[0].length;

        if (actialRows != NEED_ROWS || actialColumns != NEED_COLUMNS) {
            throw new MyArraySizeException(NEED_ROWS, NEED_COLUMNS, actialRows, actialColumns);
        }

        int i = 0;
        int j = 0;

        for (String[] rows : toSum) {
            for (String cell : rows) {
                try {
                    sum += Integer.parseInt(cell);
                    i++;
                    j++;
                } catch (NumberFormatException e) {

                    MyArrayDataException ex = new MyArrayDataException(cell, i, j);
                    ex.initCause(e);
                    throw ex;

                }
            }
        }
        
        return sum;
    }
    
    /**
     * @param actualRows;
     * @param actualColumns;
     */
    public static String[][] getRandomArray(int actualRows, int actualColumns) {

        String[][] randomArray = new String[actualRows][actualColumns];

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[0].length; j++) {
                randomArray[i][j] = String.valueOf(new Random().nextInt());
            }
        }

        return randomArray;

    }
    
    public static String[][] setMistakeInArray(String[][] toSet) {

        toSet[new Random().nextInt(NEED_ROWS)][new Random().nextInt(NEED_COLUMNS)] = MISTAKE;

        return toSet;

    }
    
    
    
}
