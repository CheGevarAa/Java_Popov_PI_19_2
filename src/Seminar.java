import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Seminar {

    public static void main(String[] args){

        boolean condition = true;
        int a= -5;
        int[] nums3= {1,2,3,4,5,6};
        while (a<10){
            System.out.println(a);
            a++;
        }
        System.out.println();
        for(int i: nums3){
            System.out.println(i);
        }
        String str = "sept";
        switch (str){
            case "sept":
                System.out.println(str);
                break;
        }
    }
    public static <T> Collection <T> rm(Collection <T> collection){
        return new HashSet<T>(collection);
    }
    public static double time(){
        return 3.0;
    }

    public static <K, V> Map<V, HashSet<K>> frc(Map<? extends K, ? extends V> map){
        HashMap<V, HashSet<K>> mp = new HashMap<>();
        Set<K> keys = (Set<K>) map.keySet();
        for(K key: keys){
            V value = map.get(key);
            mp.compute(value, (v, k) ->{
                if(k == null)
                    k = new HashSet<>();
                k.add(key);
                return k;
            });
        }
        return mp;
    }


}
