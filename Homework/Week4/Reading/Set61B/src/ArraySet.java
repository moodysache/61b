import java.util.Iterator;

public class ArraySet<T> implements Set<T>{
private int size;
private T[] items;

public ArraySet(){
    this.items=(T[])new Object[100] ;
    this.size=0;
}
    @Override
    public void add(T value) {
        if (value == null) {
            throw new IllegalArgumentException("can't add null");
        }
        if(!contains(value)){
            items[size]=value;
            size++;
        }
    }

    @Override
    public boolean contains(T value) {
        for(int i=0;i<size;i++){
            if(items[i].equals(value))
                return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T> {
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        public boolean hasNext() {
            return wizPos < size;
        }

        public T next() {
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }
}
