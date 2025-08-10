package KataTest.JavaCore5;

import java.util.Arrays;

public class DynamicArray <T> {
    private T [] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 15;

    public DynamicArray() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }

    public void add(T el) {
        if(size == array.length) {
            int newArray = array.length + DEFAULT_CAPACITY;
            array = Arrays.copyOf(array,newArray);
        }
        array[size++] = el;


    }


    public T get(int index){
        if (index<0|| index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

}
