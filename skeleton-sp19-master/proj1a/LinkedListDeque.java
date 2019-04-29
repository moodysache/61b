import sun.awt.image.ImageWatched;

public class LinkedListDeque<T> {
    private LinkedList sentinel;

    public int size=0;

    public class LinkedList{
        public T item;
        public LinkedList next;
        public LinkedList prev;
        public LinkedList(T item,LinkedList next,LinkedList last){
            this.item=item;
            this.next=next;
            this.prev=last;
        }
    }

    public LinkedListDeque(){
        sentinel=new LinkedList(null, null,null);
    }

    public void addFirst(T item ){
        LinkedList j=new LinkedList(item, null, sentinel);
        if(!isEmpty()){
            j.next=sentinel.next;
            j.next.prev=j;
        }
        sentinel.next=j;
        if(j.next==null){
            j.next=sentinel;
            sentinel.prev=j;
        }
        size++;

    }
    public void addLast(T item){
        LinkedList j=new LinkedList(item, sentinel, null);
        if(!isEmpty()){
            sentinel.prev.next=j;
            j.prev=sentinel.prev;
        }
        sentinel.prev=j;
        if(sentinel.next==null){
            sentinel.next=j;
        }
        size++;
    }
    public void printDeque(){
        LinkedList j=sentinel.next;
        while(j!=sentinel){
            System.out.print(j.item+" ");
            j=j.next;
        }
        System.out.println();
    }
    public T removeFirst(){
       if(!isEmpty()){
           size--;
           LinkedList x=sentinel.next;
           if( sentinel.next.next!=sentinel){
               sentinel.next=sentinel.next.next;
               sentinel.next.prev=sentinel;
               return x.item;
           }

       }

return null;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

}
