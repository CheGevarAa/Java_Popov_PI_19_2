public class Solution {
    public static double func(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23; //само по себе уравнение
    }

    public static double  solve(double start, double end){
        if(end - start <= 0.001){ //вроде так надо
            return start;
        }
        double x = start + (end - start) / 2; //штука про деление отрезка на 2
        if(func(start) * func(x) > 0){//поехала рекурсия
            return solve(x, end);
        } else {
            return solve(start, x);
        }
    }
}
