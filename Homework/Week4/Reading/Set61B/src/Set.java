public interface Set<T> extends Iterable<T>{
    void add( T value);
    boolean contains(T value);
    int size();
}
