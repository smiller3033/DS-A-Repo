import java.util.NoSuchElementException;

/**
 * Your implementation of a Singly-Linked List.
 */
public class SinglyLinkedList<T> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the element to the front of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        //check for null data input
        if (data == null) {
            throw new IllegalArgumentException("cannot accept null data");
        }
        //ADD TO FRONT
        //creates data that contains node
        SinglyLinkedListNode<T> inputNode = new SinglyLinkedListNode<T>(data);
        //checks for an empty list edge case
        if (head == null) {
            head = inputNode;
            tail = inputNode;
            size = 0;
        }
        else {
            inputNode.setNext(head);
            head = inputNode;
        }
        //increment size variable
        size++;
    }

    /**
     * Adds the element to the back of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        //check for null data input
        if (data == null) {
            throw new IllegalArgumentException("cannot accept null data");
        }
        //creates data that contains node
        SinglyLinkedListNode<T> inputNode = new SinglyLinkedListNode<T>(data);
        //checks for empty list
        if (head == null) {
            head = inputNode;
            tail = inputNode;
            size = 0;
        }
        //ADD TO REAR
        else {
            tail.setNext(inputNode);
            tail = tail.getNext();
        }
        //increment size
        size++;
    }

    /**
     * Removes and returns the first data of the list.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        T returnData;
        //checks for empty list
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (head.getNext() == null) {
            returnData = head.getData();
            head = null;
            tail = null;
        }
        else {
            returnData = head.getData();
            head = head.getNext();
        }
        //decrement size
        size--;
        return returnData;
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        T returnData;
        //checks for empty list
        if (head == null) {
            throw new NoSuchElementException();
        }
        //checks for list with one element edge case
        if (head.getNext() == null) {
            returnData = head.getData();
            head = null;
            tail = null;
        }
        else {
            SinglyLinkedListNode<T> current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            returnData = current.getNext().getData();
            current.setNext(null);
            tail = current;

        }
        //decrement size
        size--;
        return returnData;
    }

    /**
     * Returns the head node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the list
     */
    public SinglyLinkedListNode<T> getHead() {
        // DO NOT MODIFY THIS METHOD!
        return head;
    }

    /**
     * Returns the tail node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the tail of the list
     */
    public SinglyLinkedListNode<T> getTail() {
        // DO NOT MODIFY THIS METHOD!
        return tail;
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