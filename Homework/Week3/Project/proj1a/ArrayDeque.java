

public class ArrayDeque<T> {
    private T[] items;
    private int size = 0;
    private int nextFirst =0;
    private int nextLast ;
    private int rFactor = 2;
    private double shrink = 0.25;

    public ArrayDeque() {
        items = (T[]) new Object[8];
        nextLast=items.length-1;
    }

    public void addLast(T item) {
        if (items.length == size) {
            arrayResize();
        }
        if (nextLast >= items.length) {
            nextLast = 0;
        }
        items[nextLast] = item;

        size++;
    }

    public void addFirst(T item) {
        if (items.length == size) {
            arrayResize();
        }
        if (nextFirst < 0) {
            nextFirst = items.length - 1;
        }
        while(items[nextFirst]!=null){
            T it=items[nextFirst];
            items[nextFirst+1]=it;
            items[nextFirst]=item;
            nextFirst++;
        }
        nextFirst=0;

        size++;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        for (int i = 0; i < size - 1; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }


    public T removeFirst() {
        T item = items[0];
        for (int i = 0; i < size - 2; i++) {
            items[i] = items[i + 1];
        }
        items[size - 1] = null;
        size--;
        if ((double) size / items.length <= shrink) {
            arrayShrink();
        }
        return item;
    }

    public T removeLast() {
        T item = items[size - 1];
        items[size - 1] = null;
        size--;
        if ((double) size / items.length <= shrink) {
            arrayShrink();
        }
        return item;
    }

    private void arrayResize() {
        T[] a = (T[]) new Object[ (items.length * rFactor)];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    private void arrayShrink() {
        T[] a = (T[]) new Object[(int) (items.length / 2)];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> array = new ArrayDeque<>();
        array.addLast(20);
        array.addFirst(10);
        array.addLast(20);
        array.addFirst(10);
        array.addLast(20);
        array.addLast(20);
        array.addFirst(10);
        array.addLast(20);
        array.addFirst(10);
        array.addLast(20);
        array.addLast(20);
        array.removeLast();
        array.removeLast();
        array.removeLast();
        array.removeLast();
        array.removeLast();
        array.removeLast();
        array.removeLast();
        array.removeLast();
        array.removeLast();
        array.removeLast();
        array.removeLast();
    }
}
