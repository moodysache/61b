import java.util.Arrays;

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
            /* not mine  :( */
    public void reverse() {
        if (first == null || first.next == null) {
             return;
             }

         IntNode ptr = first.next;
         first.next = null;

         while (ptr != null) {
            IntNode temp = ptr.next;
             ptr.next = first;
             first = ptr;
             ptr = temp;
             }
         }




    public static void main(String[] args) {
        SLList j = new SLList();
        j.addFirst(2);
        j.addFirst(6);
        j.addFirst(5);
        j.insert(10, 0);
        j.reverse();
        int[] input={6,3,7,2,8,1,100,2345,231,0,-1,3,4,5,6,-5,100000};
        Arrays.sort(input);
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }
}

