

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMap<K,V> implements Map61B<K,V> {
private K[] keys;
private V[] values;
private int size;
    public ArrayMap(){
        keys= (K[]) new Object[100];
        values= (V[]) new java.lang.Object[100];
        size=0;
    }


    public int keyIndex(K key){
        for(int i=0;i<size;i++){
            if(keys[i].equals(key))
                return i;
        }
        return -1;
    }
    @Override
    public void put(K key, V value) {
        if(!containsKey(key)){
            keys[size]=key;
            values[size]=value;
            size++;
        }else{
            values[keyIndex(key)]=value;
        }

    }

    @Override
    public boolean containsKey(K key) {
        int index=keyIndex(key);
        return index>-1;
    }

    @Override
    public V get(K key) {
        return values[keyIndex(key)];
    }

    @Override
    public List<K> keys() {
        List<K> list =new ArrayList<>();
       for(int i=0;i<size;i++){
           list.add(keys[i]);
       }
       return list;
    }

    @Override
    public int size() {
        return size;
    }
}
