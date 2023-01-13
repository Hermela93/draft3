
import java.util.*;
class ColGen<T,K>{
    T obj1;
    K obj2;  // An object of type T and K

    // constructor
    ColGen(T obj1, K obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
    <T> void dsiplayarray(T[] arr)
        {for(T x:arr){
            System.out.println(x);
        }}
        }
class Main {
    public static <T,K> void main(String[] args){
        ColGen<String, Integer> gg=new ColGen<String, Integer>("oops",65);
        gg.print();
        LinkedList<String> names=new LinkedList<>();
        names.add("aa");
        names.add("ab");
        names.add("ac");
        System.out.println(names);

        Iterator it=names.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        Map<String,Integer> countrycode=new HashMap<>();
        countrycode.put("ad",9);
        countrycode.put("ab",9);
        countrycode.put("au",9);
        countrycode.put("ap",9);
        System.out.println(countrycode);
    }
}