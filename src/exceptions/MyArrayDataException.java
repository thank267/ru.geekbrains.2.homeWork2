package exceptions;

public class MyArrayDataException extends NumberFormatException {

    private static final String MESSAGE = "The array cell (%d,%d) contains invalid data \"%s\". They cannot be converted to an integer";

    /**
     * @param actualCellData;
     * @param actualRow;
     * @param actualColumn;
     */
    public MyArrayDataException(String source, int actualRow, int actualColumn) {
       
        super(String.format(MESSAGE, actualRow, actualColumn, source));

    }

    
    
}
