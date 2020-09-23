import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

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


}
