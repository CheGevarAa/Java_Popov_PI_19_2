package homework;

public class TaskOne {
        public static void main(String[] args) {
            System.out.println("Hello world");
            System.out.println(res());
            System.out.println(plusone());
            System.out.println(triangle());
            System.out.println(lstn());
            System.out.println((ten()));
            System.out.println((ten2()));
            System.out.println(minus(50));
            System.out.println((mid(2,10)));
            System.out.println(coord(5,5,10,10));
        }
        public static int res(){
            int a = 1;
            return a;
        }
        public static int plusone(){
            int b = 0;
            int c = ++b;
            int d = b++;
            b+=1;
            return b;
        }
        public static void swap(){
            int d = 1, e = 2, tmp;
            d=d+e; //способ 1
            e=d-e;
            d=d-e;
            tmp=d; //способ 2
            d=e;
            e=tmp;

        }
        public static double triangle(){
            int n = 5, m = 10;
            double g;
            g = Math.sqrt((n*n+m*m));
            return g;
        }
        public static int lstn(){
            int q = 10000000;
            q%=10;
            return q;
        }
        public static int ten(){
            int a = 123165464;
            a%=100;
            a/=10;
            return a;
        }
        public static int ten2(){
            int a = 20;
            a/=10;
            return a;
        }
        public static int minus(int args){
            return args-21;
        }
        public static double mid(int a,int b){
            return Math.sqrt(a*b);
        }
        public static double coord(double x, double y, double x1, double y1){
            return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
        }
    }
