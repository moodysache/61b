import java.util.ArrayList;

/**
 * Array based list.
 *
 * @author Josh Hug
 */

public class AList<T> {
   private int size;
    private T[] items;

    /**
     * Creates an empty list.
     */
    public AList() {
        items = (T[])new Object[4];
        size = 0;
    }

    /**
     * Inserts X into the back of the list.
     */
    public void addLast(T x) {
        if(size==items.length){
            T [] a=(T[])new Object[size+1];
            System.arraycopy(items, 0,a ,0 ,size );
            items=a;
        }
            items[size]=x;
            size++;


    }

    /**
     * Returns the item from the back of the list.
     */
    public T getLast() {
        return items[size-1];
    }

    /**
     * Gets the ith item in the list (0 is the front).
     */
    public T get(int i) {
        return items[i];
    }

    /**
     * Returns the number of items in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Deletes item from back of the list and
     * returns deleted item.
     */
    public T removeLast() {
        T returnItem=getLast();
        items[size-1]=null;
        size--;
        return returnItem;
    }

    public static void main(String[] args) {
        AList <Integer> list = new AList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(39);
        list.addLast(2);
        list.addLast(333);
        list.addLast(34);
        list.addLast(2);
        list.addLast(333);
        list.addLast(34);

    }
} 