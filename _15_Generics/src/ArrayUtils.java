import java.util.Arrays;

public class ArrayUtils {

    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Индексы выходят за пределы массива");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
