
import exceptions.MyArrayDataException;
import exceptions.MyArraySizeException;
import utils.ArrayUtil;

public class App {
    public static void main(String[] args)  {

        
        String[][] testArray = ArrayUtil.getRandomArray(4, 4);

        try {
            System.out.println("Результат суммирования элементов массива:");
            System.out.println(ArrayUtil.sumArray(testArray));
        }
        catch (MyArraySizeException e) {
            System.out.println("Получили ошибку в установлении размеров массива");
            System.out.println(e.getMessage());
        }
        catch (MyArrayDataException e) {
            System.out.println("Получили ошибку в суммировании элементов массива");
            System.out.println(e.getMessage());
        }
        
        testArray = ArrayUtil.setMistakeInArray(testArray);

        try {
            System.out.println("Результат суммирования элементов массива c ошибкой:");
            System.out.println(ArrayUtil.sumArray(testArray));
        } catch (MyArraySizeException e) {
            System.out.println("Получили ошибку в установлении размеров массива");
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Получили ошибку в суммировании элементов массива");
            System.out.println(e.getMessage());
        }

        

        

      

        

    }
    
    
}
