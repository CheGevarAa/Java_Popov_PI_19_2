public class TaskFive {
    private int[] final_arr;

    public TaskFive(int[] num, int[] weight){
        int lgt = 0;
        for (int wght : weight){
            lgt+=wght;
        }
        final_arr = new int [lgt];
        int mark = 0;

        for(int i = 0; i < weight.length; i++){
            for(int j = 0; j < weight[i]; j++){
                final_arr[mark++] = num[i];
            }
        }
    }

    public int get_rand(){
        int random = (int) (Math.random() * (final_arr.length - 1));
        return  final_arr[random];
    }
}
