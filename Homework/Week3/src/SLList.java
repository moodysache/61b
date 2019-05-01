public class SLList {
    private class IntNode {
        public int item;
        public IntNode next;


        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    public int size = 0;
    private IntNode first;

    public void addFirst(int x) {
        first = new IntNode(x, first);
        size++;
    }

            /* works but it's very bad */

    public void insert(int item, int position) {
        if (position > size) {
            IntNode x = first;
            while (x.next != null) {
                x = x.next;
            }
            x.next = new IntNode(item, null);
            size++;
            return;
        }
        if (position == 0) {
           addFirst(item);
            size++;
            return;
        }
        IntNode x = first;
        while (position > 1) {
            x = x.next;
            position--;
        }
        size++;
        if (x.next != null) {
            x.next = new IntNode(item, x.next);
        } else x.next = new IntNode(item, null);
    }

    public static void main(String[] args) {
        SLList j = new SLList();
        j.addFirst(2);
        j.addFirst(6);
        j.addFirst(5);
        j.insert(10, 0);

    }
}

