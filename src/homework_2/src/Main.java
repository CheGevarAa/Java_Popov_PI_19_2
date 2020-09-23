import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // task_2
        double[] test = {1,2,3};
        double[] test2 = {2,3,4};
        Vector a = new Vector(test);
        System.out.println(Vector.vector_length(test));
        System.out.println(a.scale(test2));
        System.out.println(a.ugol(test2));
        System.out.println(Arrays.toString(a.vect(test2).getVec1()));
        System.out.println(Arrays.toString(a.sum(test2).getVec1()));
        System.out.println(Arrays.toString(a.sub(test2).getVec1()));
        System.out.println(Arrays.deepToString(a.random_vect(10)));
        // task_5
        int[] b = {1,2,3};
        int[] c = {1,2,10};
        TaskFive d = new TaskFive(b,c);
        System.out.println(d.get_rand());
    }
}

