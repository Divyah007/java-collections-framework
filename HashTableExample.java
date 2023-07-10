import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> h=new Hashtable<>();
        //it is legacy class
        //it extends map interface
        //it replaces the latest value of the key if the key is repeated.
        //it is synchronised so it is slow, but hashmap is not synchronised so it is faster
        h.put(null,"hj");
        h.put(1,"Abc");
        h.put(1,"viya");
        h.put(5,"diya");
        System.out.println(h);
    }
}
