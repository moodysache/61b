import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        change(list);
        System.out.println(list);
    }

    public static ArrayList change(ArrayList x){
        ArrayList<String> list=new ArrayList<>();
        x=list;
         return x;
    }

}
