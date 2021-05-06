package exceptions;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    private static final String MESSAGE = "Need an array of %d rows and %d columns. Received an array of %d rows and %d columns";
    
    /**
     * @param needRows
     * @param needColumns
     * @param actualRows
     * @param actualColumns
     */
    public MyArraySizeException(int needRows, int needColumns, int actualRows, int actualColumns) {
       
        super(String.format(MESSAGE,
            needRows,
            needColumns,
            actualRows,
            actualColumns
            ));

    }

    
    
}
