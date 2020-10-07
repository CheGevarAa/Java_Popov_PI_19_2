import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleArrayIterator<T> implements Iterator {
    private T [][] array;
    private int index_0 = 0;
    private int index_1 = 0;

    public DoubleArrayIterator(T[][] array){
        this.array=array;
    }
    @Override
    public boolean hasNext() {
        if (index_1 >= array[index_0].length) {
            index_1 = 0;
            index_0++;
        }
        return index_0<array.length;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return array[index_0][index_1];
    }
}
