public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}
	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.get(2));
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if(rest == null){
			return 1;
		} return 1 + rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		int count=0;
		IntList p=this;
		while(p!=null){
			p=p.rest;
			count++;
		}
		return count;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		if(i==0) {
			return this.first;
		}
		else return rest.get(i-1);
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
}
