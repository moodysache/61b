public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L = new IntList(10, L);
        L = new IntList(15, L);
        L = new IntList(20, L);
        IntList Q = incrList(L, 3);
        // IntList K=dincrList(L,3);


        System.out.println("Printing initial IntList");
        printIntLists(L);
        System.out.println("Printing changed IntList");
        printIntLists(Q);
        
    }
    
    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */

    /**
     * Seems good I think
     */
    public static IntList dincrList(IntList L, int x) {


        int count = L.size();
        IntList Q = L;
        for (int j = 0; j < L.size(); j++) {
            for (int i = 0; i < count - 1; i++) {
                Q = Q.rest;
            }
            Q.first = Q.first + x;
            count--;
            Q = L;
        }
        return Q;
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change.
     */

    /**
     * Working just fine!
     */
    public static IntList incrList(IntList L, int x) {
        IntList newList = null;
        int sizeCount = L.size();
        IntList IteratingList = L;
        for (int j = 0; j < L.size(); j++) {
            for (int i = 0; i < sizeCount - 1; i++) {
                IteratingList = IteratingList.rest;
            }
            newList = new IntList(IteratingList.first + x, newList);
            IteratingList = L;
            sizeCount--;
        }
        return newList;
    }

    //Working but backwards
    public static IntList incrList2(IntList L, int x) {
        IntList Lcopy = L;
        IntList newList = null;
        for (int i = L.size(); i > 0; i--) {
            newList = new IntList((Lcopy.first) + x, newList);
            Lcopy = Lcopy.rest;
        }
        return newList;
    }

    /**
     * Return the size of the list using... recursion!
     */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + rest.size();
    }

    /**
     * Return the size of the list using no recursion!
     */
    public int iterativeSize() {
        int count = 0;
        IntList p = this;
        while (p != null) {
            p = p.rest;
            count++;
        }
        return count;
    }

    /**
     * Returns the ith value in this list.
     */
    public int get(int i) {
        if (i == 0) {
            return this.first;
        } else return rest.get(i - 1);
    }

    //my own method, probably can be written better.
    public int iterativeGet(int i) {
        IntList p = this;

        int count = 0;
        while (count < this.size() - i - 1) {
            p = p.rest;
            count++;
        }
        return p.first;
    }

    private static void printIntLists(IntList L) {
        for (int i = 0; i < L.size(); i++) {
            System.out.println(L.iterativeGet(i));
        }

    }
}