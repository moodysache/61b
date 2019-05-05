

public class LinkedListDeque<T> implements Deque<T> {
    private LinkedList sentinel;

    public int size = 0;

    public class LinkedList {
        public T item;
        public LinkedList next;
        public LinkedList prev;

        public LinkedList(T item, LinkedList next, LinkedList last) {
            this.item = item;
            this.next = next;
            this.prev = last;
        }
    }

    public LinkedListDeque() {
        sentinel = new LinkedList(null, null, null);
    }
    public LinkedListDeque(LinkedListDeque other){
        this();
        for(int i=0;i<other.size;i++){
            addLast((T)other.get(i));
        }
    }

    @Override
    public void addFirst(T item) {
        LinkedList j = new LinkedList(item, null, sentinel);
        if (!isEmpty()) {
            j.next = sentinel.next;
            j.next.prev = j;
        }
        sentinel.next = j;
        if (j.next == null) {
            j.next = sentinel;
            sentinel.prev = j;
        }
        size++;

    }

    @Override
    public void addLast(T item) {
        LinkedList j = new LinkedList(item, sentinel, null);
        if (!isEmpty()) {
            sentinel.prev.next = j;
            j.prev = sentinel.prev;
        }
        sentinel.prev = j;
        if (sentinel.next == null) {
            sentinel.next = j;
        }
        size++;
    }

    @Override
    public void printDeque() {
        LinkedList j = sentinel.next;
        while (j != sentinel) {
            System.out.print(j.item + " ");
            j = j.next;
        }
        System.out.println();
    }

    @Override
    public T removeFirst() {
        if (!isEmpty()) {
            size--;
            LinkedList x = sentinel.next;
            if(isEmpty()){
                return x.item;
            }
            if (sentinel.next.next != sentinel) {
                sentinel.next = sentinel.next.next;
                sentinel.next.prev = sentinel;
                return x.item;
            }
        }
        return null;
    }


    @Override
    public T removeLast() {
        if (!isEmpty()) {

            size--;
            LinkedList x = sentinel.prev;
            sentinel.prev = x.prev;
            x.prev.next = sentinel;
            return x.item;
        }
        return null;
    }

    @Override
    public T get(int index) {
        if (size - 1 >= index) {
            LinkedList j = sentinel.next;
            while (index != 0) {
                j = j.next;
                index--;
            }
            return j.item;
        }
        return null;
    }
    /* Not ready yet*/
    public T getRecursive(int index){

        return null;
    }

    public int size() {
        return size;
    }

}
