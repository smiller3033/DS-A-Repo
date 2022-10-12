import java.util.NoSuchElementException;

/**
 * Your implementation of an ArrayList.
 */
public class ArrayList<T> {

    /*
     * The initial capacity of the ArrayList.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 9;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new ArrayList.
     * 
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayList() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Adds the data to the front of the list.
     *
     * This add may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        //checks for null data and throws error if true
        if (data == null) {
            throw new IllegalArgumentException();
        }
        //checks for an empty list and starts a list and size if true
        if (backingArray[0] == null) {
            size = 1;
            backingArray[0] = data;
        }
        //checks if array is full and if it is, double it
        else if (backingArray.length == size) {
            T[] tmp = backingArray;
            backingArray = (T[]) new Object[size*2];
            backingArray[0] = data;
            for (int i = 0; i < size; i++) {
                backingArray[i+1] = tmp[i];
            }
            size++;
        }
        //adds the new data to the front of the list and shifts the other data to the right
        else {
            T tmp = backingArray[0];
            backingArray[0] = data;
            for (int i = 1; i < size; i++) {
                T tmp2 = backingArray[i];
                backingArray[i] = tmp;
                tmp = tmp2; 
            }
            backingArray[size] = tmp;
            size++;
        }
    }

    /**
     * Adds the data to the back of the list.
     *
     * Method should run in amortized O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        //checks for null data and throws error if true
        if (data == null) {
            throw new IllegalArgumentException();
        }
        //checks for an empty list and starts a list and size if true
        if (backingArray[0] == null) {
            size = 1;
            backingArray[0] = data;
        }
        //checks if array is full and if it is, double it
        else if (backingArray.length == size) {
            T[] tmp = backingArray;
            backingArray = (T[]) new Object[size*2];
            for (int i = 0; i < size; i++) {
                backingArray[i] = tmp[i];
            }
            backingArray[size] = data;
            size++;
        }
        //adds the new data to the back of the list
        else {
            backingArray[size] = data;
            size++;
        }
    }

    /**
     * Removes and returns the first data of the list.
     *
     * Do not shrink the backing array.
     *
     * This remove may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        if (backingArray[0] == null) {
            throw new NoSuchElementException();
        }
        T returnData = backingArray[0];
        for (int i = 0; i < size - 1; i++) {
            backingArray[i] = backingArray[i+1];
        }
        size--;
        backingArray[size] = null;
        return returnData;
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Do not shrink the backing array.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        if (backingArray[0] == null) {
            throw new NoSuchElementException();
        }
        size--;
        T returnData = backingArray[size];
        backingArray[size] = null;
        return returnData;
    }

    /**
     * Returns the backing array of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}