import java.util.concurrent.ThreadLocalRandom;

public class Vector {
    private double x;
    private double y;
    private double z;
    private double[] vec1 = {x, y, z};
    double[] vec2 = new double[3];


    public Vector(double[] vec1){
        this.vec1 = vec1;
    }
    public static double vector_length(double[] vec1){
        return Math.sqrt(Math.pow(vec1[0],2)+Math.pow(vec1[1], 2)+Math.pow(vec1[2], 2));
    }
    public double scale(double[] vec2){
        return vec1[0]*vec2[0]+vec1[1]*vec2[1]+vec1[2]*vec2[2];
    }
    public Vector vect(double[] vec2){
        double[] arr = {(vec1[1]*vec2[2] - vec2[1]*vec1[2]), (vec1[2]*vec2[0] - vec2[2]*vec1[0]), (vec1[0]*vec2[1] - vec2[0]*vec1[1])};
        Vector new_obj = new Vector(arr);
        return new_obj;
    }
    public double ugol(double[] vec2){
        return scale(vec2)/vector_length(vec1)*vector_length(vec2);
    }
    public Vector sum(double[] vec2){
        double[] arr = {vec1[0]+vec2[0], vec1[1]+vec2[1], vec1[2]+vec2[2]};
        Vector new_obj1 = new Vector(arr);
        return new_obj1;
    }
    public Vector sub(double[] vec2){
        double[] arr = {vec1[0]-vec2[0], vec1[1]-vec2[1], vec1[2]-vec2[2]};
        Vector new_obj2 = new Vector(arr);
        return new_obj2;
    }

    public double[] getVec1() {
        return vec1;
    }

    public double[][] random_vect(int n){
        int min = -10;
        int max = 10;
        double [][] result = new double[n][3];
        for (int i = 0; i<n; i++){
            double rand = ThreadLocalRandom.current().nextDouble(min,max);
            double rand1 = ThreadLocalRandom.current().nextDouble(min,max);
            double rand2 = ThreadLocalRandom.current().nextDouble(min,max);
            double[] rand_vec = {rand,rand1,rand2};
            result[i] = rand_vec;
        }
        return result;
    }

}
